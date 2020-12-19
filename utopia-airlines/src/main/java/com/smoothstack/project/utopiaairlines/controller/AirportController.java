package com.smoothstack.project.utopiaairlines.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.project.utopiaairlines.entity.Airport;
import com.smoothstack.project.utopiaairlines.service.AirportService;

@RestController
@RequestMapping("/api/airports")
public class AirportController {
		
		@Autowired
		AirportService airportService;
		
		@GetMapping("/api/airports")
		public List<Airport> findAll() {
		    return airportService.findAll();
		}
		
		@RequestMapping(path = "api/airports/{id}", method = RequestMethod.GET)
		public Airport findById(@PathVariable String airportId) {
			return airportService.findById(airportId);
		}
}
