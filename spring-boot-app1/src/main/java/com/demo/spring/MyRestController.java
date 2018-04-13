package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	MyJpaRepo repo;
	
	@GetMapping("/test")
	public String Test()
	{
		
		return "Testing REST with Boot";
	}
	
	
	
	@RequestMapping(path="/find", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity findById(@RequestParam("empid")int id)
	{
		Employee e=repo.findOne(id);
		if(e!=null)
		{
			return ResponseEntity.ok(e);
			
		}
		else
		{
			return ResponseEntity.ok("Not Found");
			
		}
				
		
	}
	
	@RequestMapping(path="/find40k", method=RequestMethod.GET,produces="application/json")
	public ResponseEntity findSum()
		
	{
		return ResponseEntity.ok(repo.getAllMoreThan40k());
				
	}
	
	
}
