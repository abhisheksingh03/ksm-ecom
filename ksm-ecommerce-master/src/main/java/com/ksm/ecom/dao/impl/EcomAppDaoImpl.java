package com.ksm.ecom.dao.impl;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ksm.ecom.dao.EcomAppDao;
import com.ksm.ecom.entity.App;
import com.mysql.fabric.xmlrpc.base.Array;

@Repository("EcomAppDaoImpl")
public class EcomAppDaoImpl  implements EcomAppDao  {

	@Override
	public List<App> getAppData() {
		System.err.println("Error-----------");
		return Arrays.asList(new App());
	}


	/*@Override
	public List<App> getAppData() {
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<App> query=cb.createQuery(App.class);
		Root<App> root=query.from(App.class);
		query.select(root);
		return em.createQuery(query).getResultList();
	}*/

}
