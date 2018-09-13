package com.cruelengine.dairyfarm.controllers;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cruelengine.dairyfarm.models.Account;
import com.cruelengine.dairyfarm.models.AuthResponse;
import com.cruelengine.dairyfarm.models.Login;
import com.cruelengine.dairyfarm.repository.AccountRepository;
import com.cruelengine.dairyfarm.security.JWTUtil;
import com.cruelengine.dairyfarm.security.PBKDF2Encoder;
import com.cruelengine.dairyfarm.services.UserDetailService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.GsonBuilder;

import reactor.core.publisher.Mono;
@CrossOrigin(origins = "http://localhost:4200") 
@RestController
@RequestMapping("/dairyfarm")
public class LoginController {

	@Autowired
	private JWTUtil jwtUtil;
	
	@Autowired
	private PBKDF2Encoder passwordEncoder;

	@Autowired
	private UserDetailService uds;
	
	Logger log = LoggerFactory.getLogger(LoginController.class);
	
	
	public LoginController(AccountRepository accountRepo , BCryptPasswordEncoder bCryptPasswordEncoder ) {

	}
	
	
	/**
	 * Jackson will parse the incoming json {username:string , password:string}
	 * @param login
	 * @return
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 */
	@RequestMapping(value = "auth", method = RequestMethod.POST)
	public Mono<ResponseEntity<AuthResponse>> auth(@RequestBody Login ar) {
		return uds.findByUsername(ar.getUsername()).map((userDetails) -> {
			if (passwordEncoder.encode(ar.getPassword()).equals(userDetails.getPassword())) {
				return ResponseEntity.ok(new AuthResponse(jwtUtil.generateToken(userDetails)));
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
			}
		});
	}
}
