package com.test;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
@Entity
@Table(name="orders")
@NamedQueries({
	@NamedQuery(name ="CustomerQuery",query="from Order o where o.O_name =:name"),
	@NamedQuery(name ="pricequery", query="from Order o where o.O_price =:price")
})
public class Order {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private int Id;
	private String O_name;
	private int O_quantity;
	private int O_price;
	public Order()
	{
		
	}
	public Order(String O_name,int O_quantity,int O_price )
	{
		this.O_name=O_name;
		this.O_quantity=O_quantity;
		this.O_price=O_price;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getO_name() {
		return O_name;
	}
	public void setO_name(String o_name) {
		O_name = o_name;
	}
	public int getO_quantity() {
		return O_quantity;
	}
	public void setO_quantity(int o_quantity) {
		O_quantity = o_quantity;
	}
	public int getO_price() {
		return O_price;
	}
	public void setO_price(int o_price) {
		O_price = o_price;
	}
	@Override
	public String toString() {
		return "Order [Id=" + Id + ", O_name=" + O_name + ", O_quantity=" + O_quantity + ", O_price=" + O_price + "]";
	}
}
