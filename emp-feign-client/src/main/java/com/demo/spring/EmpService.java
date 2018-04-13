package com.demo.spring;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@FeignClient("emp-service")
public interface EmpService {
	
	
	@RequestMapping(path="/getemp",method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<String> getEmployee(@RequestParam("empid") int id);
	
	@RequestMapping(path="/greet",method=RequestMethod.GET)
	public String greet(@RequestParam(name="name",required=false)String name);

}
