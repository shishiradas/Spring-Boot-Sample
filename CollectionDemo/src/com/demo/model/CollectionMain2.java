package com.demo.model;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
public class CollectionMain2 {

public static void main(String[] args){
	
	
	List<Employee> empSet = new ArrayList<>();
	empSet.add(new Employee(101, "Shekhar", "Hyderabad", 56000));
	empSet.add(new Employee(102, "Vishal", "Chennai", 56000));
	empSet.add(new Employee(103, "Raj", "Kochi", 56000));
	empSet.add(new Employee(104, "Ravi", "Mumbai", 56000));
	empSet.add(new Employee(105, "Rajan", "Delhi", 2));
	empSet.add(new Employee(106, "Suman", "Bangalore", 56000));
	System.out.println(empSet.size());
	
	Iterator<Employee> empItr =empSet.iterator();
	
	while(empItr.hasNext()) {
		
		Employee e= empItr.next();
		System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());
	
	}
	
	System.out.println("=========");
	
	for(Employee e:empSet)
	{
		System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());
				
	}
	
}
	
	
}
