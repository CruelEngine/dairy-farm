package com.cruelengine.dairyfarm.services;

import com.cruelengine.dairyfarm.models.UserDetail;

import reactor.core.publisher.Mono;

public interface UserDetailService {

	public Mono<UserDetail> findByUsername(String username);
}
