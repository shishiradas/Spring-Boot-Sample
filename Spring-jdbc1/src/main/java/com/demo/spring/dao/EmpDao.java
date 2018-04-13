package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.Employee;

public interface EmpDao {
	
	public int saveEmp(Employee e);
	
	public List <Employee> getAll();
	
	public Employee findById(int empId);
	
	public int  saveEmpList(List<Employee> elist);
	

}
