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

import com.dorjear.ralf.db.dto.RalfApplicationSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfApplication;
import com.dorjear.ralf.db.service.ApplicationService;
import com.dorjear.ralf.db.service.util.HibernateGenericDao;

@Service("applicationService")
@Transactional
public class ApplicationServiceImpl implements ApplicationService{
	private final Log ralfDebugger = LogFactory.getLog("ralfDebug."+this.getClass().getName());
	private final Log ralfAuditor = LogFactory.getLog("ralfAudit."+this.getClass().getName());
	@Autowired
	HibernateGenericDao<TbRalfApplication, String> tbRalfApplicationDao;
	
	@Override
	public void save(TbRalfApplication application){
		ralfDebugger.debug(this.getClass());
		ralfAuditor.info("save application " + application.getApplicationId());
		tbRalfApplicationDao.save(application);
	}

	@Override
	public List<TbRalfApplication> findAll(){
		return tbRalfApplicationDao.loadAll();
	}

	@Override
	public void deleteById(String applicationId){
		tbRalfApplicationDao.delete(applicationId);
	}

	@Override
	public
	List<TbRalfApplication> findByExample(TbRalfApplication example){
		return tbRalfApplicationDao.findByExample(example);
	}
	
	@Override
	public void update(TbRalfApplication application){
		tbRalfApplicationDao.update(application);
	}

	@Override
	public TbRalfApplication getById(String id) {
		return tbRalfApplicationDao.findById(id);
	}

	@Override
	public List<TbRalfApplication> search(RalfApplicationSearchCriteria searchInput) {
		// TODO extract to mapper
		List<Criterion> criteria = new ArrayList<Criterion>();
		
		if(searchInput.getProductGroup()!=null) criteria.add(Restrictions.eq("productGroup", searchInput.getProductGroup()));
		if(searchInput.getStatus()!=null) criteria.add(Restrictions.eq("status", searchInput.getStatus()));
		// TODO extract to mapper
		
		return tbRalfApplicationDao.retrieveListByCriteria(criteria);
	}
}