package com.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {

	@RequestMapping(path="/Login",method=RequestMethod.GET)
	public String getPage() {
		
		
		return "Login";
		
		
	}
	
	@RequestMapping(path="/Login",method=RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("username")String name, @RequestParam("password")String pwd)
	{
		
		ModelAndView mv= new ModelAndView();
		if(name.equals(pwd)){
			
			mv.setViewName("Success");			
		}
		else
		{
			mv.setViewName("Failure");		
			
		}
		
		return mv;
		
	}
	
	
}
