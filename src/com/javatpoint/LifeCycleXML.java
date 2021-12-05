package com.javatpoint;

public class LifeCycleXML {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Inside Display : "+name);
	}
	
	public void init()
	{
		System.out.println("Inside Init : "+name);
	}
	
	public void destroy()
	{
		System.out.println("Inside Destroy : "+name);
	}
}
