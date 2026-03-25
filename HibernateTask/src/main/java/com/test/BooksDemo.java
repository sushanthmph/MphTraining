package com.test;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class BooksDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction t =session.beginTransaction();
		Books obj =new Books();
		
		obj.setName("Electronics");
		obj.setAuthor("Balaji");
		obj.setGenre("EEE");
		obj.setPrice(500);
		session.persist(obj);
		
		Manga m =new Manga();
		m.setChapters(5);
		
		Manhwa ma = new Manhwa();
		ma.setCharacters(15);
		
		session.persist(obj);
		session.persist(m);
		session.persist(ma);

	}

}
