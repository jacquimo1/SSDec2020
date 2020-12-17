package com.smoothstack.uthopiaairlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.smoothstack.uthopiaairlines.dao.AirportDao;
import com.smoothstack.uthopiaairlines.model.Airport;

@Component
public class AirportService {

//	@Autowired
//	AirportDao airportDao;
//	public List<Airport> getAllAirports() {
//		return airportDao.getAllAirports();
//	}
	
	@Autowired
	AirportDao airportDao;
	public Airport getAirportById(String id) {
		return airportDao.getAirportById(id);
	}
}
