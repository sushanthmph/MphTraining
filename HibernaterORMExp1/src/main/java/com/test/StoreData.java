package com.test;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class StoreData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Configuration cfg =new Configuration();
//		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = HibernateUtil.getSession();//.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t =session.beginTransaction();
		Employee emp =new Employee();
		emp.setEmp_name("SKY");
		emp.setEmp_company("BCC");
		emp.setEmp_city("Mumbai");
		session.persist(emp);
		t.commit();
		List<Employee> list =session.createQuery("from Employee",Employee.class).list();
		list.forEach(obj -> System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city()));
//		Employee obj =session.find(Employee.class,102);
//		System.out.println(obj.getId()+" "+obj.getEmp_name()+" "+obj.getEmp_company()+" "+obj.getEmp_city());
//		obj.setEmp_name("Sharma");
//		obj.setEmp_company("PWC");
//		obj.setEmp_city("Banglore");
//		session.remove(obj);
//		t.commit();
		System.out.println("Done");
		session.close();
		
	}

}
