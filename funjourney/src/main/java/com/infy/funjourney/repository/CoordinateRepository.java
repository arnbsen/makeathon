package com.infy.funjourney.repository;

import com.infy.funjourney.model.Coordinates;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CoordinateRepository extends MongoRepository<Coordinates, String> {
    
}