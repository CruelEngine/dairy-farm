package com.cruelengine.dairyfarm.controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cruelengine.dairyfarm.models.Account;
import com.cruelengine.dairyfarm.models.Login;
import com.cruelengine.dairyfarm.repository.AccountRepository;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;

import reactor.core.publisher.Mono;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/dairyfarm")
public class LoginController {

	
	
	Logger log = LoggerFactory.getLogger(LoginController.class);
	
	private AccountRepository accountRepo;
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	
	public LoginController(AccountRepository accountRepo , BCryptPasswordEncoder bCryptPasswordEncoder ) {
		this.accountRepo = accountRepo;
		this.bcryptPasswordEncoder = bcryptPasswordEncoder;
	}
	
	
	/**
	 * Jackson will parse the incoming json {username:string , password:string}
	 * @param login
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@PostMapping("/userlogin")
	public Mono<ResponseEntity> loginUser(@RequestBody Login login) throws JsonParseException, JsonMappingException, IOException{
		
		Account account = new Account(login.getUsername() , bcryptPasswordEncoder.encode(login.getPassword()),0);
		return null;
		
	}
}
