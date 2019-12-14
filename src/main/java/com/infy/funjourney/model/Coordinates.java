package com.infy.funjourney.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Coordinates {

    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    Double lat;

    @Getter
    @Setter
    Double lng;

    @Getter
    @Setter
    String name;

}