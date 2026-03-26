package com.test;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();
		faculty f = new faculty();
		f.setF_name("mazin");
		f.setF_salary(233005);
		faculty f1 = new faculty();
		f1.setF_name("smith");
		f1.setF_salary(3000000);
		
		Student s1 = new Student();
		s1.setS_name("mark");
		s1.setRoll("223cai");
		s1.setCollege("PU");
		s1.setS_fees(23000);
		Student s2 = new Student();
		s2.setS_name("zuck");
		s2.setRoll("221cca");
		s2.setS_fees(23303);
		List<Student> list = Arrays.asList(s1,s2);
		f1.setStd(list);
		f.setStd(list);
		session.persist(s1);
		session.persist(s2);
		
		session.persist(f1);
		t.commit();
		System.out.println("Done");
		session.close();
	}

}