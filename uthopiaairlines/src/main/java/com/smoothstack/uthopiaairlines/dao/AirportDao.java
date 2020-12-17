package com.smoothstack.uthopiaairlines.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.smoothstack.uthopiaairlines.model.Airport;
import com.smoothstack.uthopiaairlines.util.DatabaseConnecter;



@Component
public class AirportDao {

	public List<Airport> getAllAirports() {
		List<Airport> airports = new ArrayList<>();
		String sql = "select * from airports";
		ResultSet rs = null;
		try (Connection c = DatabaseConnecter.hardcodedConnection();
				PreparedStatement ps = c.prepareStatement(sql);) {
			rs = ps.executeQuery();
			while (rs.next()) {
				Airport airport = new Airport();
				airport.setId(rs.getString("iata_id"));
				airport.setCity(rs.getString("city"));
				airports.add(airport);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return airports;
	}
	public Airport getAirportById(String id) {
		Airport airport = null;
		ResultSet rs = null;
		String sql = "select * from airports where iata_id = ?";
		try (Connection c = DatabaseConnecter.hardcodedConnection();
				PreparedStatement ps = c.prepareStatement(sql);){
			ps.setString(1, id);
			rs = ps.executeQuery();
			if (!rs.next()) {
				System.out.println("Could not retrieve result set.");
				return airport;
			}
			airport = new Airport();
			airport.setId(id);
			airport.setCity(rs.getString("city"));
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return airport;
	}
	
}
