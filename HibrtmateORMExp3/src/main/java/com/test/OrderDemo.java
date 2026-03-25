package com.test;

import java.util.List;

public class OrderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderDAO odao =new OrderDAO();
		Order obj =new Order();
		
		obj.setO_name("Electronics");
		obj.setO_quantity(10);
		obj.setO_price(5000);
		odao.saveOrder(obj);
		//odao.updateOrder(obj);
//		List<Order> list =odao.listAllorders();
//		list.forEach(dt -> System.out.println(dt.getId()+" "+dt.getO_name()+" "+dt.getO_quantity()+" "+dt.getO_price()));
//		System.out.println("Done");
		//odao.deleteOrder(obj);

	}

}
