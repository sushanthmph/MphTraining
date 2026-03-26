package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf =cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t = session.beginTransaction();
		Address a = new Address();
		a.setCity("Pune");
		a.setState("MH");
		
		Employee e =new Employee();
		e.setE_name("Virat");
		e.setE_company("BCC");
		
		e.setAddress(a);
		a.setEmp(e);
		
		session.persist(e);
		t.commit();
		System.out.println("Done");
		session.close();
	}

}
