package com.infy.funjourney.repository;

import com.infy.funjourney.model.Notification;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotificationRepository extends MongoRepository<Notification, String> {
    
}