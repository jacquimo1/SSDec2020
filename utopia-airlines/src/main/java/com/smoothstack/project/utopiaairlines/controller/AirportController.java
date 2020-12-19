package com.smoothstack.project.utopiaairlines.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.smoothstack.project.utopiaairlines.dao.AirportDao;
import com.smoothstack.project.utopiaairlines.entity.Airport;
import com.smoothstack.project.utopiaairlines.service.AirportService;

@RestController
@RequestMapping("/api/airports")
public class AirportController {


		@Autowired
		private AirportDao airportDao;
		
		@GetMapping("/api/airports")
		public List<Airport> getAllAirports() {
		    return airportDao.findAllAirports();
		}
		

		@Autowired
		AirportService authorService;
		@RequestMapping(path = "api/airports/{id}", method = RequestMethod.GET)
		public Airport getAirportById(@PathVariable String airportId) {
			return authorService.getAirportById(airportId);
		}
	
}
