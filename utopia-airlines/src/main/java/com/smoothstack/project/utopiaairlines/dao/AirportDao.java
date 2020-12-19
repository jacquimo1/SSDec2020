package com.smoothstack.project.utopiaairlines.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.smoothstack.project.utopiaairlines.entity.Airport;


@Repository
public interface AirportDao extends JpaRepository<Airport, Long> {
	@Query
	Airport getAirportById(String id);
	@Query
	List<Airport> findAllAirports();
}
