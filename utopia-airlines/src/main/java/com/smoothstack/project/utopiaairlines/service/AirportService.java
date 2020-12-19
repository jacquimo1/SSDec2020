package com.smoothstack.project.utopiaairlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.smoothstack.project.utopiaairlines.dao.AirportDao;
import com.smoothstack.project.utopiaairlines.entity.Airport;

public class AirportService {
	@Autowired
	AirportDao airportDao;
	public Airport getAirportById(String id) {
		return airportDao.getAirportById(id);
	}
	@Autowired
	public List<Airport> getAllAirports() {
		return airportDao.findAllAirports();
	}
	
}
