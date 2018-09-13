package com.cruelengine.dairyfarm.services;

import org.springframework.stereotype.Service;

import com.cruelengine.dairyfarm.models.UserDetail;
import com.cruelengine.dairyfarm.repository.UserDetailRepository;

import reactor.core.publisher.Mono;

@Service
public class UserDetailServiceImpl implements UserDetailService{

	UserDetailRepository udr;
	
	@Override
	public Mono<UserDetail> findByUsername(String username) {
		return udr.findByUsername(username);
	}

}
