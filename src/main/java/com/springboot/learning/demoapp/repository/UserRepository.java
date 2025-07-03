package com.springboot.learning.demoapp.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;

import com.springboot.learning.demoapp.model.User;

import reactor.core.publisher.Mono;

public interface UserRepository extends R2dbcRepository<User, String>{
      Mono<User> findByEmail(String email);
}
