package com.infy.funjourney.model;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Guest {

    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String email;

    @Getter
    @Setter
    @JsonIgnore
    String password;

    @Getter
    @Setter
    String gender;

    @Getter
    @Setter
    Instant dob;

}