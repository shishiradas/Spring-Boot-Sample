package com.demo.spring.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Service
public class EmpRegisterApp {
	@Autowired
	@Qualifier("jdbc2")
	EmpDao dao;
	
//	public void setDao(EmpDao dao){
//		this.dao=dao;
//		
//	}
	
	public String registerEmp(int id, String name, String city, double salary){
		
		
		int resp=dao.saveEmp(new Employee(id,name,city,salary));
		System.out.println(resp);
		
		return "Employee Resgistered";
		
	}
	
	
public Employee findEmployee(int empid){
		
		
		return dao.findById(empid);
		
	}

public List <Employee> getEmplList(){
	
		return dao.getAll();
	
}


public int SaveList(List <Employee> elist){
	
	return dao.saveEmpList(elist);

}
}
