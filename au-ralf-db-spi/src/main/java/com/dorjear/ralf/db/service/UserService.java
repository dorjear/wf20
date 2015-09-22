package com.dorjear.ralf.db.service;

import java.util.List;

import com.dorjear.ralf.db.model.RalfUserSearchCriteria;
import com.dorjear.ralf.db.model.TbRalfUser;

public interface UserService {

	public void save(TbRalfUser user);

	public List<TbRalfUser> findAll();

	public void deleteById(String userId);

	public List<TbRalfUser> findByExample(TbRalfUser example);

	public List<TbRalfUser> search(RalfUserSearchCriteria searchInput);

	public void update(TbRalfUser employee);
	
	public TbRalfUser getById(String id);
}
