package com.smoothstack.project.utopiaairlines.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smoothstack.project.utopiaairlines.dao.AirportDao;
import com.smoothstack.project.utopiaairlines.entity.Airport;


@Service
public class AirportService {
	
	@Autowired
	AirportDao airportDao;
	public Airport findById(String id) {
		return airportDao.findById(id);
	}
	
	@Autowired
	public List<Airport> findAll() {
		return airportDao.findAll();
	}
	
}
