package com.demo.spring.dao;

import java.util.List;

import com.demo.spring.model.Employee;

public interface EmpDao {
	
	public String saveEmp(Employee e);
	
	public List <Employee> getAll();
	
	public Employee findById(int empId);
	
	public int  saveEmpList(List<Employee> elist);
	
	public String delete(int empId);
	

}
