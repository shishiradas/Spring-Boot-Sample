package com.demo.spring;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface MyJpaRepo extends CrudRepository<Employee, Integer> {
	
	
	@Query("select o from Employee o where o.salary>40000")
	public List<Employee> getAllMoreThan40k();

}
