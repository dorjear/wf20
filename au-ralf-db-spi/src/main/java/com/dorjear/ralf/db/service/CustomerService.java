package com.dorjear.ralf.db.service;

import java.util.List;

import com.dorjear.ralf.db.dto.RalfCustomerSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfCustomer;

public interface CustomerService {

	public void save(TbRalfCustomer user);

	public List<TbRalfCustomer> findAll();

	public void deleteById(String userId);

	public List<TbRalfCustomer> findByExample(TbRalfCustomer example);

	public List<TbRalfCustomer> search(RalfCustomerSearchCriteria searchInput);

	public void update(TbRalfCustomer employee);
	
	public TbRalfCustomer getById(String id);
}
