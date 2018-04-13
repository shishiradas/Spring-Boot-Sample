package com.demo.spring.dao.impl;

import org.springframework.stereotype.Repository;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Repository
public class EmpDaoJdbcImpl implements EmpDao {
	
	
@Override	
public String saveEmp(Employee e) {
	
	return "Employee with id " + e.getEmpId() + " is saved";
}

public void ShowEmp(Employee e) {
	
	System.out.println("Employee with id " + e.getEmpId()+ " and name " + e.getName() + " now exists");
}



}
