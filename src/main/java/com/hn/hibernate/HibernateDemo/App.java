package com.hn.hibernate.HibernateDemo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();// factory.getCurrentSession();

		// factory.getSessionFactory();
		// System.out.println("hi " + factory.getSessionFactory());
		System.out.println("hi1 " + factory.isClosed());

		Student ss = new Student(101, "sachin", "palawa", "columbia");
		StudentAddress sa = new StudentAddress();
		sa.setStreet("street1");
		sa.setOpen(true);
		sa.setAddedDate(new Date());
		sa.setX(12.4f);

		Transaction txn = session.beginTransaction();
		session.save(ss);
		session.save(sa);
		txn.commit();

		session.close();
		System.out.println(ss);
	}
}
