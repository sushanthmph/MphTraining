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
		Query<Order> q =session.createQuery(hql,Order.class);
		List<Order> list =q.getResultList();
		list.forEach(dt -> System.out.println(dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));
		
	}

}
