package com.smoothstack.project.utopiaairlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.project.utopiaairlines.dao.AirportDao;
import com.smoothstack.project.utopiaairlines.entity.Airport;


@Service
public class AirportService {
	
	@Autowired
	private AirportDao airportDao;
	
	public Airport findById(String id) {
		return airportDao.findById(id);
	}
	
	public List<Airport> findByCity(String city) {
		return airportDao.findByCity(city);
	}

	public List<Airport> findAll() {
		return airportDao.findAll();
	}
	
}
