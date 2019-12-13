package com.infy.funjourney.repository;

import com.infy.funjourney.model.Guest;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuestRepository extends MongoRepository<Guest, String> {
    
}