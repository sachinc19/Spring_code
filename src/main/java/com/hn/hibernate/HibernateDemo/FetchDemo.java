package com.hn.hibernate.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		// get load
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();// factory.getCurrentSession();
		Student ss = (Student) session.get(Student.class, 101);
		System.out.println(ss);
		session.close();
		factory.close();
	}

}
