package com.olaniyi.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//Get Http Method 
	
	@GetMapping("/")
	public String message() {
		return "Welcome to SpringBoot Training";
	}
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "HelloWorld says Welcome";
	}
	@ExceptionHandler
	@GetMapping("/error")
	public String errorCode() {
		return "Error has happene";
	}




}
