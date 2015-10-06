package com.dorjear.ralf.db.service;

import java.util.List;

import com.dorjear.ralf.db.dto.RalfApplicationSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfApplication;

public interface ApplicationService {

	public void save(TbRalfApplication application);

	public List<TbRalfApplication> findAll();

	public void deleteById(String applicationId);

	public List<TbRalfApplication> findByExample(TbRalfApplication example);

	public List<TbRalfApplication> search(RalfApplicationSearchCriteria searchInput);

	public void update(TbRalfApplication employee);
	
	public TbRalfApplication getById(String id);
}
