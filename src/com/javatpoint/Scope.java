package com.javatpoint;

public class Scope {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Scope getScope()
	{
		return new Scope();
	}
	
}
