package com.Docker1.IndianOcean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cousine {
	@GetMapping("/display")
	public String print () {
		return "Welcome to IndianOcean, Cousine Island";
		
	}
	

}
