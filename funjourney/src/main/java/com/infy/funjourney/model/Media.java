package com.infy.funjourney.model;

import org.springframework.data.annotation.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Media {

    @Id
    @Getter
    @Setter
    String id;

    @Getter
    @Setter
    String name;

    @Getter
    @Setter
    String type;

    @Getter
    @Setter
    Integer duration;

    @Getter
    @Setter
    String certification;

    @Getter
    @Setter
    String url;

    @Getter
    @Setter
    String genre;

    @Getter
    @Setter
    String photoUrl;

}