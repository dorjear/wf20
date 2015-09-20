package com.dorjear.ralf.db.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.UserService;
import com.dorjear.ralf.db.service.util.HibernateGenericDao;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	HibernateGenericDao<TbRalfUser, String> tbRalfUserDao;
	
	@Override
	public void save(TbRalfUser user){
		tbRalfUserDao.save(user);
	}

	@Override
	public List<TbRalfUser> findAll(){
		return tbRalfUserDao.loadAll();
	}

	@Override
	public void deleteById(String userId){
		tbRalfUserDao.delete(userId);
	}

	@Override
	public
	List<TbRalfUser> findByExample(TbRalfUser example){
		return tbRalfUserDao.findByExample(example);
	}
	
	@Override
	public void update(TbRalfUser user){
		tbRalfUserDao.update(user);
	}

	@Override
	public TbRalfUser getById(String id) {
		return tbRalfUserDao.findById(id);
	}
}