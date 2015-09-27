package com.dorjear.ralf.db.service.configuration;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dorjear.ralf.db.model.TbRalfApplication;
import com.dorjear.ralf.db.model.TbRalfCustomer;
import com.dorjear.ralf.db.model.TbRalfUser;
import com.dorjear.ralf.db.service.util.HibernateGenericDao;

@Configuration
@ComponentScan(basePackages = "com.dorjear.ralf.db")
public class DBServiceConfig {
	@Autowired
	SessionFactory sessionFactory;
	
    @Bean
    public HibernateGenericDao<TbRalfUser, String> tbRalfUserDao(){
    	HibernateGenericDao<TbRalfUser, String> dao = new HibernateGenericDao<TbRalfUser, String>();
    	dao.setSessionFactory(sessionFactory);
    	dao.setPojoClass(TbRalfUser.class);
        return dao;
    }
    
    @Bean
    public HibernateGenericDao<TbRalfCustomer, String> tbRalfCustomerDao(){
    	HibernateGenericDao<TbRalfCustomer, String> dao = new HibernateGenericDao<TbRalfCustomer, String>();
    	dao.setSessionFactory(sessionFactory);
    	dao.setPojoClass(TbRalfCustomer.class);
        return dao;
    }

    @Bean
    public HibernateGenericDao<TbRalfApplication, String> tbRalfApplicationDao(){
    	HibernateGenericDao<TbRalfApplication, String> dao = new HibernateGenericDao<TbRalfApplication, String>();
    	dao.setSessionFactory(sessionFactory);
    	dao.setPojoClass(TbRalfApplication.class);
        return dao;
    }
}
