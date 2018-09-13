package com.cruelengine.dairyfarm.repository;

import org.reactivestreams.Publisher;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.cruelengine.dairyfarm.models.UserDetail;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface UserDetailRepository extends ReactiveCrudRepository<UserDetail, String>{

	public Mono<UserDetail> findByUsername(String username);

}
