package com.smoothstack.project.utopiaairlines;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.smoothstack.project.utopiaairlines.controller.AirportController;
import com.smoothstack.project.utopiaairlines.entity.Airport;
import com.smoothstack.project.utopiaairlines.service.AirportService;

@RunWith(MockitoJUnitRunner.class)
public class AirportControllerTest {
	
	@InjectMocks
	private AirportController airportController;
	
	@Mock
	AirportService airportService;
	
	@Test
	public void findAllTest() {
		List<Airport> expected = new ArrayList<Airport>();
		Airport a1 = new Airport();
		a1.setId("ORD");
		a1.setCity("Chicago");
		Airport a2 = new Airport();
		a2.setId("MDW");
		a2.setCity("Chicago");
		expected.add(a1);
		expected.add(a2);
		when(airportService.findAll()).thenReturn(expected);
		ResponseEntity<List<Airport>> test = airportController.findAll(null);
		assertEquals(test, new ResponseEntity<List<Airport>>(expected, HttpStatus.OK));
	}
	@Test
	public void findByCity() {
		List<Airport> expected = new ArrayList<Airport>();
		Airport a1 = new Airport();
		a1.setId("ORD");
		a1.setCity("Chicago");
		Airport a2 = new Airport();
		a2.setId("MDW");
		a2.setCity("Chicago");
		Airport a3 = new Airport();
		a2.setId("JFK");
		a2.setCity("New York");
		expected.add(a1);
		expected.add(a2);
		expected.add(a3);
		when(airportService.findByCity("Chicago")).thenReturn(expected);
		ResponseEntity<List<Airport>> test = airportController.findAll("Chicago");
		assertEquals(test, new ResponseEntity<List<Airport>>(expected, HttpStatus.OK));
	}
	@Test
	public void createAirport() {
		Airport expected = new Airport();
		expected.setId("ORD");
		expected.setCity("Chicago");
		when(airportService.saveAirport(expected)).thenReturn(expected);
		ResponseEntity<Airport> test = airportController.createOrUpdateAirport(expected);
		assertEquals(test, new ResponseEntity<Airport>(expected, HttpStatus.CREATED));
		
	}
}
