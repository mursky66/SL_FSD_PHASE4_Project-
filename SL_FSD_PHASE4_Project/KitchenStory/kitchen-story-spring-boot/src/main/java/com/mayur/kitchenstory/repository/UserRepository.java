package com.mayur.kitchenstory.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mayur.kitchenstory.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	
	Optional<User> findByEmail(String email);
}

