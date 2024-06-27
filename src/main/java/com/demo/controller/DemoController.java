package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

	
	@GetMapping("get")
	public String view() {
		
		return "welcome to my spring boot java world mr anem's";
	}
}
