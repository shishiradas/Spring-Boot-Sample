package com.demo.spring.service;
import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

public class EmpRegisterApp {
	
	EmpDao dao;
	
	public void setDao(EmpDao dao){
		this.dao=dao;
		
	}
	
	public String registerEmp(int id, String name, String city, double salary){
		
		
		String resp=dao.saveEmp(new Employee(id,name,city,salary));
		System.out.println(resp);
		dao.ShowEmp(new Employee (id,name,city,salary));
		return "Employee Resgistered";
		
	}

}
