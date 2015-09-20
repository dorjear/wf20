package com.dorjear.ralf.db.service.util;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.CriteriaSpecification;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate4.HibernateCallback;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.dorjear.ralf.common.constant.DomainConstants;



/**
 * Generic Hibernate DAO
 */
@SuppressWarnings("unchecked")
public class HibernateGenericDao<T, ID extends Serializable> extends HibernateDaoSupport {
    private Class<T> pojoClass;
    
    /**
     * initialize DAO, get POJO type
     */
    public HibernateGenericDao() {
//        this.pojoClass = (Class<T>)((ParameterizedType)getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.pojoClass = GenericsUtils.getSuperClassGenricType(getClass());
    }
    
    /**
     * get the POJO from DAO
     */
    public Class<T> getPojoClass() {
        return this.pojoClass;
    }
    
    public void setPojoClass(Class<T> pojoClass) {
		this.pojoClass = pojoClass;
	}

	/**
     * get the POJO type name from DAO
     */
    public String getPojoClassName() {
        return getPojoClass().getName();
    }
    
    /**
     * load all objects
     */
    public List<T> loadAll() {
        return (List<T>)getHibernateTemplate().loadAll(getPojoClass());
    }
    
    /**
     * find by native sql
     */
    public List findByNativeSql(String sqlStr) {
		List resultList;
		Transaction transaction = null;
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			transaction = session.beginTransaction();
			Query query = session.createSQLQuery(sqlStr);
			resultList = query.list();

		} catch (RuntimeException re) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw re;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
			if (session != null) {
				session.close();
				session = null;
			}
		}
		return resultList;
	}
    
    /**
	 * key:op,propertyName,condition,value
	 * dynamic criteria search
	 * @param entityClassName
	 * @param restrictions
	 * @return
     * @throws Exception 
	 */
	public List<T> retrieveListByCriteria(List<Map<String, Object>> restrictions) throws Exception{

		Criterion[] criterions = null;
		List<Criterion> andList = new ArrayList<Criterion>();
		List<Criterion> orList = new ArrayList<Criterion>();
		String andOr = null;
		String propertyName = null;
		String condition = null;
		Object value = null;
		
		for(int i = 0 ; i<restrictions.size();i++){
		
			Map<String,Object> map = restrictions.get(i);
			andOr = (String) map.get(DBConstants.OP);
			propertyName = (String) map.get(DBConstants.PROPERTYNAME);
			condition = (String) map.get(DBConstants.CONDITION);
			value = map.get(DBConstants.VALUE);
			
			if(DBConstants.OR.equals(andOr)){
				//store or criteria 
				orList.add(opMapper(condition,propertyName,value));
			}else{
				//store and criteria
				andList.add(opMapper(condition,propertyName,value));
			}
		}
		
		//combine or criteria and and criteria
		if(orList.size() == 0){
			
		}else if(orList.size()==1){
			andList.set(0, Restrictions.or(andList.get(0), orList.get(0)));
		}else if(orList.size()==2){
			andList.add(Restrictions.or(orList.get(0), orList.get(1)));
		}else{
			Criterion c = Restrictions.or(orList.get(0), orList.get(1));
			for(int i = 2 ; i < orList.size();i++){
				c = Restrictions.or(orList.get(i),c);
			}
			andList.add(c);
		}
		
		criterions = new Criterion[andList.size()];
		criterions = andList.toArray(criterions);
		
		return retrieveListByCriteria(criterions);
	}
    
	public List<T> retrieveListByCriteria(Criterion[] criterions) {
		List<T> resultList;
		Transaction transaction = null;
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			Criteria crt = session.createCriteria(getPojoClass());
			for(Object criterion :criterions){
				crt.add((Criterion)criterion);
			}
			resultList = crt.list();
		} catch (RuntimeException re) {
			if (transaction != null) {
				transaction.rollback();
			}
			throw re;
		} finally {
			if (transaction != null) {
				transaction = null;
			}
			if (session != null) {
				session.close();
				session = null;
			}
		}
		return resultList;
	}
	
	private static Criterion opMapper(String condition,String propertyName,Object value) throws ParseException{
		
		Criterion criterion = null;
		
		if(propertyName.toLowerCase().contains("date") && (value instanceof String)){
			value = DomainConstants.AU_SIMPLE_DATE_FORMATE.parse((String)value);
		}
		
		//special handle: number type convert
		if(value instanceof Double) { 
			Double numValue = (Double)value;
			if(numValue - numValue.intValue() == 0){
				value = numValue.intValue();
			}
			else{
				value = new BigDecimal(numValue);
			}
		} 
		
		if(DBConstants.CN.equals(condition)){
			//special handle contain
			criterion = Restrictions.like(propertyName, (String) value, MatchMode.ANYWHERE);
		}else if(DBConstants.NC.equals(condition)){
			//special handle no cnotain
			criterion = Restrictions.not(Restrictions.like(propertyName, (String) value, MatchMode.ANYWHERE));
		}else if(DBConstants.IN.equals(condition)){
			criterion = Restrictions.in(propertyName, (Object[])value);
		}else if(DBConstants.IS_NULL.equals(condition)){
			criterion = Restrictions.isNull(propertyName);
		}else{
			try {
				Class c = Restrictions.class;
				Method method = c.getMethod(condition, String.class,Object.class);
				criterion = (Criterion) method.invoke(c,propertyName, value);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
		return criterion;
	}
    
    /**
     * find by hql
     *
     * @param values : params for hql
     */
    public List find(String hql, Object... values) {
        return getHibernateTemplate().find(hql, values);
    }

    /**
     * find objects by criteria
     */
    public List<T> findByCriteria(final Criteria criteria) {
        List list = criteria.list(); 
        return transformResults(list);
    }
    
    /**
     * find objects by criteria
     */
    public List<T> findByCriteria(final DetachedCriteria detachedCriteria) {
        return (List<T>) getHibernateTemplate().execute(new HibernateCallback() {
               public Object doInHibernate(Session session) throws HibernateException {
                   Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                   List list = criteria.list(); 
                   return transformResults(list); 
               }
           });
    }
    
    /**
     * find objects by the instance,except null and primary key
     */
    public List<T> findByExample(T instance) {
        List<T> results = (List<T>)getHibernateTemplate().findByExample(instance);
        return results;
    }    
    
    /**
     * find objects by id
     */
    public T findById(ID id) {
        return (T) getHibernateTemplate().get(getPojoClassName(), id);
    }
    
    /**
     * find object by property�
     */
    public List<T> findByProperty(String propertyName, Object value) {
       String queryString = "from " + getPojoClassName() + " as model where model." 
                               + propertyName + "= ?";
       return (List<T>)getHibernateTemplate().find(queryString, value);
    }
    
    //insert,update,delete�
    
    /**
     * save object
     */
    public ID save(T transientInstance) {
        return (ID)getHibernateTemplate().save(transientInstance);
    }
    
    /**
     * update object
     */
    public void update(T transientInstance) {
        getHibernateTemplate().update(transientInstance);
    }
    
    /**
     * save or update object
     */
    public void saveOrUpdate(T transientInstance){
    	getHibernateTemplate().saveOrUpdate(transientInstance);
    }
    
    /**
     * delete object by id
     */
    public void delete(ID id) {
           T instance = findById(id);
           if (instance != null)
               getHibernateTemplate().delete(instance);
    }
    
    /**
     * delete object
     */
    public void delete(T persistentInstance) {
        getHibernateTemplate().delete(persistentInstance);
    }    
    
    /**
     * delete all object by property
     */
    public void deleteAll(String findHql) {
		List list = this.getHibernateTemplate().find(findHql);
		if (list.size() > 0) {
			this.getHibernateTemplate().deleteAll(list);
		}
    }    
    
    //Pagination
    /**
     * 
     * Pagination display based on Criteria, verify page size and start index
     */
    public PaginationSupport findPageByCriteria(final Criteria criteria, final int pageSize, final int startIndex) {   
        int totalCount = getCountByCriteria(criteria);   
        criteria.setProjection(null);
        List items = criteria.setFirstResult(startIndex).setMaxResults(pageSize).list();
        items = transformResults(items);
        PaginationSupport ps = new PaginationSupport(items, totalCount, pageSize, startIndex);
        return ps;
    }
    
    /**
     * Pagination display based on Criteria, default page size, start from 0
     */
    public PaginationSupport findPageByCriteria(final Criteria criteria) {   
        return findPageByCriteria(criteria, PaginationSupport.PAGESIZE, 0);   
    }   
 
    /**
     * Pagination display based on Criteria, default page size, start from start index
     */
    public PaginationSupport findPageByCriteria(final Criteria criteria, final int startIndex) {   
        return findPageByCriteria(criteria, PaginationSupport.PAGESIZE, startIndex);   
    }
    
    /**
     * get total count of criteria
     */
    public int getCountByCriteria(final Criteria criteria) {   
        Integer count = (Integer) criteria.setProjection(Projections.rowCount()).uniqueResult();    
        return count.intValue();   
    }
    
	public int getCountByRestrictions(List<Map<String, Object>> restrictions) {
		int totalCount = 0;
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(pojoClass);
			List<Criterion> criterions = getCriterionsByRestrictions(restrictions);
			for (Criterion criterion : criterions) {
				criteria.add(criterion);
			}
			totalCount = ((Integer) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return totalCount;
    }
	
	public int getCountByCriterions(List<Criterion> criterions) {
		int totalCount = 0;
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			Criteria criteria = session.createCriteria(pojoClass);
			for (Criterion criterion : criterions) {
				criteria.add(criterion);
			}
			totalCount = ((Integer) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null) {
				session.close();
			}
		}
		return totalCount;
    }
    
	private List<Criterion> getCriterionsByRestrictions(List<Map<String, Object>> restrictions) {
		List<Criterion> andList = new ArrayList<Criterion>();
		List<Criterion> orList = new ArrayList<Criterion>();
		String andOr = null;
		String propertyName = null;
		String condition = null;
		Object value = null;

		for (int i = 0; i < restrictions.size(); i++) {
			Map<String, Object> map = restrictions.get(i);
			andOr = (String) map.get(DBConstants.OP);
			propertyName = (String) map.get(DBConstants.PROPERTYNAME);
			condition = (String) map.get(DBConstants.CONDITION);
			value = map.get(DBConstants.VALUE);

			if (DBConstants.OR.equals(andOr)) {
				// store or criteria
				try {
					orList.add(opMapper(condition, propertyName, value));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			} else {
				// store and criteria
				try {
					andList.add(opMapper(condition, propertyName, value));
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}

		// combine or criteria and and criteria
		if (orList.size() == 0) {

		} else if (orList.size() == 1) {
			andList.set(0, Restrictions.or(andList.get(0), orList.get(0)));
		} else if (orList.size() == 2) {
			andList.add(Restrictions.or(orList.get(0), orList.get(1)));
		} else {
			Criterion c = Restrictions.or(orList.get(0), orList.get(1));
			for (int i = 2; i < orList.size(); i++) {
				c = Restrictions.or(orList.get(i), c);
			}
			andList.add(c);
		}
		
		return andList;
    }
    
    /**
     * Pagination display based on DetachedCriteria, verify page size and start index
     */
    public PaginationSupport findPageByCriteria(final DetachedCriteria detachedCriteria, final int pageSize, final int startIndex) {   
        return (PaginationSupport) getHibernateTemplate().execute(new HibernateCallback() {   
            public Object doInHibernate(Session session) throws HibernateException {   
                Criteria criteria = detachedCriteria.getExecutableCriteria(session);
                int totalCount = ((Integer) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();   
                criteria.setProjection(null);
                List items = criteria.setFirstResult(startIndex).setMaxResults(pageSize).list();
                items = transformResults(items);
                PaginationSupport ps = new PaginationSupport(items, totalCount, pageSize, startIndex);   
                return ps;   
            }
        });   
    }
    
    /**
     * Pagination display based on DetachedCriteria, default page size, start from 0
     */
    public PaginationSupport findPageByCriteria(final DetachedCriteria detachedCriteria) {   
        return findPageByCriteria(detachedCriteria, PaginationSupport.PAGESIZE, 0);   
    }   
  
    /**
     * Pagination display based on DetachedCriteria, default page size, start from start index
     */
    public PaginationSupport findPageByCriteria(final DetachedCriteria detachedCriteria, final int startIndex) {   
        return findPageByCriteria(detachedCriteria, PaginationSupport.PAGESIZE, startIndex);   
    } 
    
    /**
     * get total count of DetachedCriteria
     */
    public int getCountByCriteria(final DetachedCriteria detachedCriteria) {   
        Integer count = (Integer) getHibernateTemplate().execute(new HibernateCallback() {   
            public Object doInHibernate(Session session) throws HibernateException {   
                Criteria criteria = detachedCriteria.getExecutableCriteria(session);   
                return criteria.setProjection(Projections.rowCount()).uniqueResult();   
            }   
        });   
        return count.intValue();   
    } 
    
    /**
     * Pagination display based on hql, verify page size and start index
     */
    public PaginationSupport findPageByQuery(final String hql, final int pageSize, final int startIndex, Object...values) {
        int totalCount = getCountByQuery(hql, values);
        
        if (totalCount < 1)
            return new PaginationSupport(new ArrayList(0), 0);

        Query query = createQuery(hql, values);
        List items = query.setFirstResult(startIndex).setMaxResults(pageSize).list();
        PaginationSupport ps = new PaginationSupport(items, totalCount, pageSize, startIndex);
        return ps;
    }
    
    /**
     * Pagination display based on hql, default page size, start from 0
     */
    public PaginationSupport findPageByQuery(final String hql, Object...values) {   
        return findPageByQuery(hql, PaginationSupport.PAGESIZE, 0, values);   
    }   
 
    /**
     * Pagination display based on hql, default page size, start from start index
     */
    public PaginationSupport findPageByQuery(final String hql, final int startIndex, Object...values) {   
        return findPageByQuery(hql, PaginationSupport.PAGESIZE, startIndex, values);  
    }
    
    /**
     * get total count of hql
     */
    public int getCountByQuery(final String hql, Object...values) {   
        String countQueryString = " select count (*) " + removeSelect(removeOrders(hql));
        List countlist = getHibernateTemplate().find(countQueryString, values);
//        return (Integer) countlist.get(0);
        return Integer.parseInt(countlist.get(0).toString());
    }
    
    //create Criteria and Query
    
    /**
     * create Criteria instance
     *
     * @param criterions 
     */
    public Criteria createCriteria(Criterion...criterions) {
    	Session session = currentSession();
        
        Criteria criteria = session.createCriteria(getPojoClass());
		try {
	        for (Criterion c : criterions){
	            criteria.add(c);
	        }
		} catch (RuntimeException re) {
			throw re;
		} finally {
			if (session != null) {
				session.close();
				session = null;
			}
		}
		
        return criteria;

    }

    /**
     * create Criteria instance with desc or asc
     */
    public Criteria createCriteria(String orderBy, boolean isAsc, Criterion...criterions) {
        Criteria criteria = createCriteria(criterions);
        if (isAsc)
            criteria.addOrder(Order.asc(orderBy));
        else
            criteria.addOrder(Order.desc(orderBy));
        return criteria;
    }
    
    /**
     * create query by hql and param array
     */
    public Query createQuery(String hql, Object... values) {
        Query query = currentSession().createQuery(hql);
        for (int i = 0; i < values.length; i++) {
            query.setParameter(i, values[i]);
        }
        return query;
    }
    
    /**
     * remove select from hql, except union
     */
    private static String removeSelect(String hql) {
        int beginPos = hql.toLowerCase().indexOf("from");
        return hql.substring(beginPos);
    }

    /**
     * remove order by from hql
     */
    private static String removeOrders(String hql) {
        Pattern p = Pattern.compile("order\\s*by[\\w|\\W|\\s|\\S]*", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(hql);
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "");
        }
        m.appendTail(sb);
        return sb.toString();
    }
    
   
    private List transformResults(List items) {
        if (items.size() > 0) {
            if (items.get(0) instanceof Map) {
                ArrayList list = new ArrayList(items.size());
                for (int i = 0; i < items.size(); i++) {
                    Map map = (Map)items.get(i);
                    list.add(map.get(CriteriaSpecification.ROOT_ALIAS));
                }
                return list;
            } else if (items.get(0) instanceof Object[]) {
                ArrayList list = new ArrayList(items.size());
                int pos = 0;
                for (int i = 0; i < ((Object[])items.get(0)).length; i++) {
                    if (((Object[])items.get(0))[i].getClass() == getPojoClass()) {
                        pos = i;
                        break;
                    }
                }
                for (int i = 0; i < items.size(); i++) {
                    list.add(((Object[])items.get(i))[pos]);
                }
                return list;
            } else
                return items;
        } else
            return items;
    }

	public void executeByHQL(String hql) {
		
		Session session = null;
		try {
			session = getHibernateTemplate().getSessionFactory().openSession();
			Query query =session.createQuery(hql);
			query.executeUpdate();
		} catch (RuntimeException re) {
			throw re;
		} finally {
			if (session != null) {
				session.close();
				session = null;
			}
		}
	}
	
	public List<?> findByPage(final String hql, final int offset, final int pageSize) {
		List<?> list = this.getHibernateTemplate().execute(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException {
						List<?> result = session.createQuery(hql).setFirstResult(offset).setMaxResults(pageSize).list();
						return result;
					}
				}
		);
		return list;
	}
}