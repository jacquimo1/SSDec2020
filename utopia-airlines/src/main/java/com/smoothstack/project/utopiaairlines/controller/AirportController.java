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
public class AirportController {
		
		@Autowired
		private AirportService airportService;
		
		@GetMapping("/api/airports")
		public List<Airport> findAll() {
		    return airportService.findAll();
		}
		
		@RequestMapping(path = "/api/airports/id/{id}", method = RequestMethod.GET)
		public Airport findById(@PathVariable String id) {
			return airportService.findById(id);
		}
		
		@RequestMapping(path = "/api/airports/city/{city}", method = RequestMethod.GET)
		public List<Airport> findByCity(@PathVariable String city) {
			return airportService.findByCity(city);
		}
}
