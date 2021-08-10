package com.omkar.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloResource {

	@GetMapping("/hello")
	public String hello()
	{
		return "Hello World from Omkar. I am learning devops....just checking...I am Omkar Pidde...again doing internal review...Internal review completed....todays date is 10/08/2021";
	}
	@GetMapping("/hi")
	public String hello1()
	{
		return "hi from Omkar Pidde....todays date is 10/08/2021";
	}
	
	
}
