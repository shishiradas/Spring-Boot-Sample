package com.demo.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Repository("jpa")
public class EmpDaoJpaImpl implements EmpDao {
	
	
@Override	
public String saveEmp(Employee e) {
	
	return "Jpa: Employee with id " + e.getEmpId() + " is saved";
}

public void ShowEmp(Employee e) {
	
	System.out.println("Jpa:Employee with id " + e.getEmpId()+ " and name " + e.getName() + " now exists");
}



}