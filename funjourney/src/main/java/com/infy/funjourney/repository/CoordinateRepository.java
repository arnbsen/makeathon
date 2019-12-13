package com.infy.funjourney.repository;

import com.infy.funjourney.model.Coordinates;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CoordinateRepository extends MongoRepository<Coordinates, String> {
    
    @Query(value = "{'lat': {$gte: ?0, $lte: ?1}, 'lng': {$gte: ?2, $lte: ?3}}")
    Coordinates getPlaceName(Double gteLat, Double lteLat, Double gteLng, Double lteLng);

}