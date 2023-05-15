package com.stacksimplify.ccdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/test")
	public String sayHello() {
		return "My New Application Reflect";
	}
	
}
