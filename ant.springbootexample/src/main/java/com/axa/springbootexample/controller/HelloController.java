package com.axa.springbootexample.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/")
	   public String sayHello() {
	      return "Hello Spring Boot!!";
	   }

}
