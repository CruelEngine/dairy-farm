package com.cruelengine.dairyfarm.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cruelengine.dairyfarm.models.User;

@RestController
public class UserController {

	
	@GetMapping
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		
		return users;
	}
	
}
