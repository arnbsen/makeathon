package com.infy.funjourney.model;

import org.springframework.data.mongodb.core.mapping.DBRef;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Notification {

    @Getter
    @Setter
    Integer priority;

    @Getter
    @Setter
    String title;

    @Getter
    @Setter
    String description;

    @Getter
    @Setter
    @DBRef
    Ticket ticket;
    
}