package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class HQLTest {
	public static void main(String [] args)
	{
		Session session =HibernateUtil.getSession().openSession();
		Transaction t = session.beginTransaction();
		String hql  ="from Order";
		String hql1="delete from Order where id= :id";
		Query query =session.createQuery(hql1);
		query.setParameter("id",52);
		query.executeUpdate();
		t.commit();
		Query<Books> q =session.createQuery(hql,Books.class);
		List<Books> list =q.getResultList();
		list.forEach(dt -> System.out.println(dt.getName()+" "+dt.getAuthor()+" "+dt.getGenre()+" "+dt.getPrice()));
		
	}

}
