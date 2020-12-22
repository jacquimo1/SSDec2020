package com.smoothstack.project.utopiaairlines.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.smoothstack.project.utopiaairlines.entity.Airport;
import com.smoothstack.project.utopiaairlines.service.AirportService;

@RestController
@RequestMapping("api/airports")
public class AirportController {
		
		@Autowired
		private AirportService airportService;
		
		@GetMapping
		public ResponseEntity<List<Airport>> findAll(@RequestParam(value = "city", required = false) String city) {
			try {
				if (city == null) {
					return new ResponseEntity<List<Airport>>(airportService.findAll(),  HttpStatus.OK);
				}
				else {
					return new ResponseEntity<List<Airport>>(airportService.findByCity(city), HttpStatus.OK);
				}
			
	        } catch (Exception e) {
	            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
		}
		
		@RequestMapping(path = "/id/{id}", method = RequestMethod.GET)
		public ResponseEntity<Airport> findById(@PathVariable String id) {
			try {
				Airport airport = airportService.findById(id);
				if (airport == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
				else {
					return new ResponseEntity<Airport>(airport, HttpStatus.OK);
				}
			}        
			catch (Exception e) {
	            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
			
		}
		
		@PostMapping
		public ResponseEntity<Airport> createOrUpdateAirport(@RequestBody Airport airport) {
			try {
				Airport existing = airportService.findById(airport.getId());
				if (existing == null) {
					return new ResponseEntity<Airport>(airportService.saveAirport(airport), HttpStatus.CREATED);
				}
				else {
					existing.setCity(airport.getCity());
					return new ResponseEntity<Airport>(airportService.saveAirport(existing), HttpStatus.OK);
				}
			}
			catch (Exception e) {
	            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
		}
		
		@DeleteMapping("/id/{id}")
		public ResponseEntity<Airport> delete(@PathVariable String id) {
			try {
				Airport airport = airportService.findById(id);
				if (airport == null) {
	                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
				}
				airportService.delete(airport);
				return ResponseEntity.status(HttpStatus.OK).body(airport);
			}
			catch (Exception e) {
	            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
	        }
		}
		
		
}
