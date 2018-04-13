package com.demo.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController

public class EmpRestClient {
	
	@Autowired
	RestTemplate rt;

	//@RequestMapping(path="/empinfo/{id}", method=RequestMethod.GET)
	
	//public ResponseEntity getEmpData(@PathVariable("id") int id) {
	// ResponseEntity response= rt.getForEntity("http://emp-service/getemp/?empid=" + id, String.class);
	//	return response;
	//}

	@RequestMapping(path = "/get/{id}")
	//http://localhost:9080/get/100
	public String getEmpData(@PathVariable("id") int id) {
	String response = 
			rt.getForObject("http://emp-service/getemp?empid=" + id, String.class);
		return response;
	}

}
