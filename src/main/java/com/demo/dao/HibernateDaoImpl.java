package com.demo.dao;

import org.hibernate.SessionFactory;

public class HibernateDaoImpl {
	private SessionFactory sessionFactory;

	public HibernateDaoImpl() {
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
