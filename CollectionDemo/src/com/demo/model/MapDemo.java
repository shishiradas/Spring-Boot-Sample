package com.demo.model;



import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {
	
	
	public static void main(String[] args){
		
		
		Map<Integer,Employee> empMap = new HashMap<>();
		empMap.put(100,new Employee(100, "Shekhar", "Hyderabad", 56000));
		empMap.put(101,new Employee(101, "Vishal", "Chennai", 56000));
		empMap.put(102,new Employee(102, "Raj", "Kochi", 56000));
		empMap.put(103,new Employee(103, "Ravi", "Mumbai", 56000));
		empMap.put(104,new Employee(104, "Rajan", "Delhi", 2));
		empMap.put(105,new Employee(105, "Suman", "Bangalore", 56000));
		
		
		
		System.out.println(empMap.containsKey(107));
		
		Set<Integer> keySet=empMap.keySet();
		
		for(Integer i:keySet){
			
			Employee e=empMap.get(i);
			System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getCity() + " " + e.getSalary());
			
						
		}
		
		
		Test t = new Test(){
			
			public void fun(){
			System.out.println("Hello");
			
		}
			
		};
		
		t.fun();
		
	}
}
		
		
	
		
	
	
	


