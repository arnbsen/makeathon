package com.infy.funjourney.model;

import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonIgnore;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Instant getDob() {
		return dob;
	}

	public void setDob(Instant dob) {
		this.dob = dob;
	}

    
}