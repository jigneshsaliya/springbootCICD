package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorlController {
	
	@RequestMapping(value="/greeting", method = RequestMethod.GET)
	public String sayHelloWorld() {
		return "Hello World Jignesh!";
	}
}
