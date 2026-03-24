package com.test;

import java.security.Principal;

public class UserPrinciple implements Principal {
	private String name;
	public UserPrinciple(String name)
	{
		this.name=name;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public void setName()
	{
		this.name=name;
	}
	public String toString()
	{
		return name;
	}

}
