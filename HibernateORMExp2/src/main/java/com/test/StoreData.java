package com.test;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t =session.beginTransaction();
		Customer c =new Customer();
		c.setC_name("SKY");
		c.setC_email("sky@gmial.com");
		c.setC_city("Mumbai");
		session.persist(c);
		t.commit();
		System.out.println("Done");
		session.close();
	}
}