package com.infy.funjourney.model;

import java.time.Instant;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Coordinates getFrom() {
		return from;
	}

	public void setFrom(Coordinates from) {
		this.from = from;
	}

	public Coordinates getTo() {
		return to;
	}

	public void setTo(Coordinates to) {
		this.to = to;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Instant getDeparture() {
		return departure;
	}

	public void setDeparture(Instant departure) {
		this.departure = departure;
	}

	public Instant getArrival() {
		return arrival;
	}

	public void setArrival(Instant arrival) {
		this.arrival = arrival;
	}

	public Instant getRtDeparture() {
		return rtDeparture;
	}

	public void setRtDeparture(Instant rtDeparture) {
		this.rtDeparture = rtDeparture;
	}

	public Instant getRtArrival() {
		return rtArrival;
	}

	public void setRtArrival(Instant rtArrival) {
		this.rtArrival = rtArrival;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Set<Coordinates> getStops() {
		return stops;
	}

	public void setStops(Set<Coordinates> stops) {
		this.stops = stops;
	}
    

}