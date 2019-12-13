package com.infy.funjourney.api;

import com.infy.funjourney.model.Coordinates;
import com.infy.funjourney.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/loc")
public class LocationAPI {

    @Autowired
    private LocationService locationService;

    @GetMapping("/nearest/{lat}/{lng}")
    public Coordinates getNearestCity(@PathVariable("lat") Double lat, @PathVariable("lng") Double lng) {
        return this.locationService.findNearestCity(lat, lng);
    }


}