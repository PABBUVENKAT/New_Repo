package com.example.demoforjpa.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.deomForJpa.entity.user;

@RestController
public class controller {
	@PostMapping("/api/user")
	public void savestudent(@RequestBody user user) { 
		System.out.println(user);
		
	}

}
