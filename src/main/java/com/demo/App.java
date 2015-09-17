package com.demo;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.demo.dao.HibernateDaoImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/demo/beans/beans.xml");
		Person person = (Person) context.getBean("person");
		System.out.println(person);
		person.speak();

		HibernateDaoImpl daoImpl = (HibernateDaoImpl) context.getBean("hibernateDaoImpl");
		SessionFactory sessionFactory = (SessionFactory) daoImpl.getSessionFactory();
		Session session = sessionFactory.openSession();

		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			session.persist(person);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
