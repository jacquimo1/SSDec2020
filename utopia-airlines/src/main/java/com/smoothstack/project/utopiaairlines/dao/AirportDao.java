package com.smoothstack.project.utopiaairlines.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smoothstack.project.utopiaairlines.entity.Airport;


@Repository
public interface AirportDao extends JpaRepository<Airport, Long> {

	//@Query(value = "select * from airport where iata_id=?1", nativeQuery = true)
	Airport findById(String id);
	
	//@Query(value = "from airport")
	List<Airport> findAll();
}
