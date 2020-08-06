package com.ksm.ecom.dao.impl;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EcomAppCoreConfig {
	
	@Autowired
	EntityManager em;
   
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public EcomAppCoreConfig(EntityManager em) {
		super();
		this.em = (EntityManager) sessionFactory.getCurrentSession();
	}
}
