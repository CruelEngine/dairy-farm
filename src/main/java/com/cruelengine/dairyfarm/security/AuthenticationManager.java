package com.cruelengine.dairyfarm.security;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.ReactiveAuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.cruelengine.dairyfarm.enums.AccountType;

import io.jsonwebtoken.Claims;
import reactor.core.publisher.Mono;

public class AuthenticationManager implements ReactiveAuthenticationManager{
	@Autowired
	private JWTUtil jwtUtil;
	
	@Override
	public Mono<Authentication> authenticate(Authentication authentication) {
		String authToken = authentication.getCredentials().toString();
		
		String username;
		try {
			username = jwtUtil.getUsernameFromToken(authToken);
		} catch (Exception e) {
			username = null;
		}
		if (username != null && jwtUtil.validateToken(authToken)) {
			Claims claims = jwtUtil.getAllClaimsFromToken(authToken);
			List<String> accountTypeMap = claims.get("role", List.class);
			List<AccountType> account = new ArrayList<>();
			for (String accountType : accountTypeMap) {
				account.add(AccountType.valueOf(accountType));
			}
			UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(
				username,
				null,
				account.stream().map(authority -> new SimpleGrantedAuthority(authority.name())).collect(Collectors.toList())
			);
			return Mono.just(auth);
		} else {
			return Mono.empty();
		}
	}

}
