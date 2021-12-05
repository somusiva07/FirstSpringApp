package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String[] args) {
	/*
	 * Resource resource=new ClassPathResource("applicationContext.xml");
	 * BeanFactory factory=new XmlBeanFactory(resource);
	 * 
	 * Student student=(Student)factory.getBean("studentbean");
	 */
	
	
	/*
	 * Resource resource = new FileSystemResource("src/applicationContext.xml");
	 * XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(resource);
	 */
	 

	
	
	/*
	 * ClassPathResource classPathResource = new
	 * ClassPathResource("applicationContext.xml"); XmlBeanFactory xmlBeanFactory =
	 * new XmlBeanFactory(classPathResource);
	 */
	   
	 

	
	
	/*
	 * ClassPathXmlApplicationContext appContext = new
	 * ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
	 * BeanFactory factory =(BeanFactory) appContext; Student
	 * student=(Student)factory.getBean("studentbean");
	 * 
	 * //Student student=(Student)xmlBeanFactory.getBean("studentbean");
	 * student.displayInfo();
	 * 
	 * //try multiple students? Student
	 * student2=(Student)factory.getBean("studentbean2"); student2.displayInfo();
	 * 
	 * Student student3=(Student)factory.getBean("studentbean3");
	 * student3.displayInfo();
	 */
	
	/*
	 * System.out.println(xmlBeanFactory.isSingleton("studentbean"));
	 * System.out.println(xmlBeanFactory.getBean("studentbean") instanceof Student);
	 * System.out.println(xmlBeanFactory.isTypeMatch("studentbean", Student.class));
	 * System.out.println(xmlBeanFactory.getAliases("studentbean").length > 0);
	 */
	
	
	/*
	 * ClassPathXmlApplicationContext appContext = new
	 * ClassPathXmlApplicationContext( new String[] {"applicationContext.xml"});
	 * BeanFactory factory =(BeanFactory) appContext; //LifeCycleXML
	 * lifeCycle=(LifeCycleXML)factory.getBean("lifeCycle"); LifeCycleJava
	 * lifeCycle=(LifeCycleJava)factory.getBean("lifeCycleJava");
	 * lifeCycle.display(); appContext.registerShutdownHook();
	 */
	
	ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext( new String[] {"scope.xml"});
	BeanFactory factory =(BeanFactory) appContext;
	
	Scope scope = (Scope)factory.getBean("scope");
	scope.setName("Test Scope Class");
		
	System.out.println(scope.getName());
	
	Scope anotherScope = (Scope)factory.getBean("scope");
	System.out.println(anotherScope.getName());
	
	
	appContext.registerShutdownHook();
}
}
