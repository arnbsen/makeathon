package com.infy.funjourney.model;

import java.time.Instant;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Ticket {


    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    Coordinates from;

    @Getter
    @Setter
    Coordinates to;

    @Getter
    @Setter
    String no;


    @Getter
    @Setter
    Instant departure;

    @Getter
    @Setter
    Instant arrival;

    @Getter
    @Setter
    Instant rtDeparture;

    @Getter
    @Setter
    Instant rtArrival;

    @Getter
    @Setter
    @DBRef
    Guest guest;

    @Getter
    @Setter
    Set<Coordinates> stops;

}