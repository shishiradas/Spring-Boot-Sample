package com.demo.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.spring.Employee;
import com.demo.spring.dao.EmpDao;

@Repository
public class EmpDaoJdbcImpl2 implements EmpDao {
	
	
@Override	
public int saveEmp(Employee e) {
	
	return  e.getEmpId() ;
}

public void ShowEmp(Employee e) {
	
	System.out.println("Employee with id " + e.getEmpId()+ " and name " + e.getName() + " now exists");
}

@Override
public List<Employee> getAll() {
		return null;
}

@Override
public Employee findById(int empId) {
	// TODO Auto-generated method stub
	return null;
}

@Override
	public int saveEmpList(List<Employee> elist) {
		// TODO Auto-generated method stub
		return 0;
	}

}
