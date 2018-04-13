package com.demo.spring;

import java.util.HashMap;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyRestController {
	
	static HashMap<Integer, Employee> empMap = new HashMap();
	static{
		
		empMap.put(100,new Employee(100, "Shekhar", "Hyderabad", 56000));
		empMap.put(101,new Employee(101, "Vishal", "Chennai", 56000));
		empMap.put(102,new Employee(102, "Raj", "Kochi", 56000));
		empMap.put(103,new Employee(103, "Ravi", "Mumbai", 56000));
		empMap.put(104,new Employee(104, "Rajan", "Delhi", 2));
		empMap.put(105,new Employee(105, "Suman", "Bangalore", 56000));
		
			}
	
	
	
@RequestMapping(path="/greet",method=RequestMethod.GET)
public String greet(@RequestParam(name="name",required=false)String name){
	
	return "Welcome to Spring REST " + name;
}


@RequestMapping(path="/getemp",method=RequestMethod.GET,produces={MediaType.APPLICATION_ATOM_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
public ResponseEntity getEmployee(@RequestParam("empid") int id){
	
	if(empMap.containsKey(id)){
		
		Employee e= empMap.get(id);
		return ResponseEntity.ok(e);
	}
		else
		{
			return ResponseEntity.ok("Employee Not Found");
		}
	}
	
	
	
	
	
	
}





