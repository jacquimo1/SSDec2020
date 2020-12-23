package com.smoothstack.project.utopiaairlines;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.smoothstack.project.utopiaairlines.dao.AirportDao;
import com.smoothstack.project.utopiaairlines.entity.Airport;
import com.smoothstack.project.utopiaairlines.service.AirportService;

public class AirportServiceTest {
		
	
	@InjectMocks
	private AirportService airportService;
	
	@Mock
	private AirportDao airportDao;
	
	@Test
	public void findAllTest() {
		List<Airport> expected = new ArrayList<Airport>();
		Airport a1 = new Airport();
		a1.setId("LAX");
		a1.setCity("Los Angeles");
		Airport a2 = new Airport();
		a2.setId("JFK");
		a2.setCity("New York");
		expected.add(a1);
		expected.add(a2);
		when(airportDao.findAll()).thenReturn(expected);
		List<Airport> testList = airportService.findAll();
		assertEquals(testList.size(), 2);
		verify(airportDao, times(1)).findAll(); 
	}
	
	@Test
	public void findByIdTest() {	
		String id = "LAX";
		Airport expected = new Airport();
		expected.setId(id);
		expected.setCity("Los Angeles");
		when(airportDao.findById(id)).thenReturn(expected);
		Airport test = airportService.findById(id);
		assertEquals("Los Angeles", test.getCity());
	}
	
	@Test 
	public void findByCityTest() {	
		List<Airport> expected = new ArrayList<Airport>();
		String city = "Chicago";
		Airport a1 = new Airport();
		a1.setId("ORD");
		a1.setCity(city);
		Airport a2 = new Airport();
		a2.setId("MDW");
		a2.setCity(city);
		expected.add(a1);
		expected.add(a2);
		when(airportDao.findByCity(city)).thenReturn(expected);
		List<Airport> test = airportService.findByCity(city);
		assertEquals(test.get(0).getId(), expected.get(0).getId());
	}
	
	@Test
	public void saveAirportTest() {
		Airport expected = new Airport();
		expected.setId("LAX");
		expected.setCity("Los Angeles");
		airportService.saveAirport(expected);
		verify(airportDao, times(1)).save(expected);
	}
	
	@Test
	public void deleteAirportTest() {
		Airport airport = new Airport();
		airport.setId("LAX");
		airport.setCity("Los Angeles");
		doNothing().when(airportDao).delete(airport);
		airportService.delete(airport);
		verify(airportDao, times(1)).delete(airport);
	}
}
