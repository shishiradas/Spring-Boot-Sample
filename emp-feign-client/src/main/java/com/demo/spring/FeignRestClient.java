package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignRestClient {
	
	
	
	@Autowired
	EmpService client;
	
	@RequestMapping(path = "/feign/{id}",method=RequestMethod.GET)
	
	public ResponseEntity getEmpData(@PathVariable("id") int id) {
	ResponseEntity<String> response = client.getEmployee(id);
		return response;
	}

}
