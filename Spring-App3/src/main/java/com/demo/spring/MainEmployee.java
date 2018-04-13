package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.service.EmpRegisterApp;

public class MainEmployee {

	public static void main(String[] args) {
		
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//Service Class
		
		EmpRegisterApp app=(EmpRegisterApp)ctx.getBean("empRegisterApp");
		String resp= app.registerEmp(108,"Lachu","Kochi",60000);
		System.out.println(resp);
	}

}
