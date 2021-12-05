package com.javatpoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleJava implements InitializingBean, DisposableBean {

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
	
	
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside Init - afterPropertiesSet() : "+name);
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy() : "+name);
		
	}
}
