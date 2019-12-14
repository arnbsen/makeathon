package com.infy.funjourney.service;

import com.infy.funjourney.model.Coordinates;
import com.infy.funjourney.repository.CoordinateRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    @Autowired
    private CoordinateRepository coordinateRepository;

    public Coordinates findNearestCity(Double lat, Double lng) {
        return this.coordinateRepository.getPlaceName(lat - 0.0000001, lat + 0.0000001, lng - 0.0000001, lng + 0.0000001);
    }

    public Coordinates addNewPlace(Coordinates coordinates) {
        return this.coordinateRepository.save(coordinates);
    }
}