package com.demo.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.service.EmpRegisterApp;

public class MainEmployee4 {

	public static void main(String[] args) {
ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//Service Class
		String resp;
		List <Employee> el;
		
		Employee emp;
		EmpRegisterApp app=(EmpRegisterApp)ctx.getBean("empRegisterApp");
		
		
		//resp= app.registerEmp(205,"Lachu","Kochi",60000);
		//System.out.println(resp);
		
		el= app.getEmplList();
		for (Employee e : el) {

			System.out.println(e.getEmpId() + " " + e.getName());
			
		}
		
		
		emp=app.findEmployee(200);
		if(emp!=null)
		System.out.println(emp.getEmpId() + " " + emp.getName());
		
		
		
	List <Employee> empList = new ArrayList();
	empList.add(new Employee(601, "a1", "c1",3434));
	empList.add(new Employee(602, "a2", "c1",3434));
	empList.add(new Employee(603, "a3", "c1",3434));
	empList.add(new Employee(604, "a4", "c1",3434));
	empList.add(new Employee(605, "a5", "c1",3434));
	empList.add(new Employee(606, "a6", "c1",3434));
	
	app.SaveList(empList);
	
	}

}
