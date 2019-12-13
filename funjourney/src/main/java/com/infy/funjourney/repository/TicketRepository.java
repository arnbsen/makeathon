package com.infy.funjourney.repository;

import com.infy.funjourney.model.Ticket;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends MongoRepository<Ticket, String> {


    @Query(value = "{'no': ?0}")
    Ticket getTicketByNumber(String no);
}