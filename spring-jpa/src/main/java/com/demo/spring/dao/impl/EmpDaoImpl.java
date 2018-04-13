package com.demo.spring.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.model.Employee;

@Repository
public class EmpDaoImpl implements EmpDao {
	
	
	@PersistenceContext
	private EntityManager em;
	
	
	
	@Override
	@Transactional
	public String saveEmp(Employee e) {
	em.persist(e);
		return "success";
	}

	@Override
	public List<Employee> getAll() {
		
		Query query = em.createQuery("select e from Employee e");
		List<Employee> empList = query.getResultList();
		return empList;
				
	}

	@Override
	public Employee findById(int empId) {
		
		Employee e = em.find(Employee.class, empId);
		
		return e;
	}

	@Override
	public int saveEmpList(List<Employee> elist) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	@Transactional
	public String delete(int empId) {
		
		Employee e = em.find(Employee.class, empId);
		if(e!=null)
		{
			em.remove(e);
			return "Row with emp id " + empId + " removed.";
			
		}
		
		else
			
		{
			
			return ("Not Found!");
		}
		
		
		
	}

}
