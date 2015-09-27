package com.dorjear.ralf.db.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dorjear.ralf.db.dto.RalfCustomerSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfCustomer;
import com.dorjear.ralf.db.service.CustomerService;
import com.dorjear.ralf.db.service.util.HibernateGenericDao;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{
	private final Log ralfDebugger = LogFactory.getLog("ralfDebug."+this.getClass().getName());
	private final Log ralfAuditor = LogFactory.getLog("ralfAudit."+this.getClass().getName());
	@Autowired
	HibernateGenericDao<TbRalfCustomer, String> tbRalfCustomerDao;
	
	@Override
	public void save(TbRalfCustomer user){
		ralfDebugger.debug(this.getClass());
		ralfAuditor.info("save customer " + user.getCustomerId());
		tbRalfCustomerDao.save(user);
	}

	@Override
	public List<TbRalfCustomer> findAll(){
		return tbRalfCustomerDao.loadAll();
	}

	@Override
	public void deleteById(String userId){
		tbRalfCustomerDao.delete(userId);
	}

	@Override
	public
	List<TbRalfCustomer> findByExample(TbRalfCustomer example){
		return tbRalfCustomerDao.findByExample(example);
	}
	
	@Override
	public void update(TbRalfCustomer user){
		tbRalfCustomerDao.update(user);
	}

	@Override
	public TbRalfCustomer getById(String id) {
		return tbRalfCustomerDao.findById(id);
	}

	@Override
	public List<TbRalfCustomer> search(RalfCustomerSearchCriteria searchInput) {
		// TODO extract to mapper
		List<Criterion> criteria = new ArrayList<Criterion>();
		
		if(searchInput.getBranch()!=null) criteria.add(Restrictions.eq("primaryBranch", searchInput.getBranch()));
		if(searchInput.getRoles()!=null && searchInput.getRoles().length>0){
			for(String role : searchInput.getRoles()){
				criteria.add(Restrictions.like("roles", "%"+role+"%"));
			}
		}
		// TODO extract to mapper
		
		return tbRalfCustomerDao.retrieveListByCriteria(criteria);
	}
}
