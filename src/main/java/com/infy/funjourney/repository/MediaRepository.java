package com.infy.funjourney.repository;

import java.util.List;

import com.infy.funjourney.model.Media;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaRepository extends MongoRepository<Media, String> {

    @Query(value = "{'genre': ?0}")
    public List<Media> filterByGenre(String genre);

    @Query(value = "{'type': ?0}")
    public List<Media> filterByType(String type);

    Media findByName(String name);

    

}