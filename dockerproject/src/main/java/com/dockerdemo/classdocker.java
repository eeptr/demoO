package com.dockerdemo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class classdocker {
	@GetMapping("/display")
	public String print () {
		return "Hello, I'm Rajyalakshmi and this is my docker project, let's get started with it...!";
	
	}

}
