package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmpRegisterApp;

public class MainEmployee {

	public static void main(String[] args) {
		
	
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-context.xml");
		
		
		//Service Class
		
		EmpRegisterApp app=(EmpRegisterApp)ctx.getBean("empApp");
		String resp= app.registerEmp(108,"Lachu","Kochi",60000);
		System.out.println(resp);
	}

}
