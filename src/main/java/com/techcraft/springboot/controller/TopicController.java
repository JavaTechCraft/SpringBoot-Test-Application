package com.techcraft.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/hello")
	public String Return() {
		return "Hi welcome ro Course Api";
	}
		
}
