package com.smoothstack.uthopiaairlines.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.uthopiaairlines.entity.Airport;
import com.smoothstack.uthopiaairlines.service.AirportService;

@RestController
public class AirportController {
	
	@Autowired
	AirportService airportService;
	@RequestMapping(path = "airports/{airportId}", method = RequestMethod.GET)
	public Airport getAirportById(@PathVariable String airportId) {
		return airportService.getAirportById(airportId);
	}
	
}