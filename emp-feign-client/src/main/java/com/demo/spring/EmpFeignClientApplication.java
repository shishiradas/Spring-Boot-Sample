package com.demo.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class EmpFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpFeignClientApplication.class, args);
	}
}
