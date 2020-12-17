package com.ss.assignment.day5.assignment6;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Assignment6 {
	
	private static Connection conn = null;
	
	private static Assignment6 instance = null;
	
	private Assignment6() {
		// Maybe add connection credentials here.
	}
	
	// Fixed getInstance method to check if instance is null
	// and call constructor if so. 
	public static Assignment6 getInstance() {
		if (instance == null) instance = new Assignment6();
		return instance;
	}
	
	public static void databaseQuery(BigDecimal input) throws SQLException {
		conn = DriverManager.getConnection("url");
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("select id from table");
		BigDecimal x = new BigDecimal("1.00"); // Or whatever it should be.
		while (rs.next()) {
			x = rs.getBigDecimal(1).multiply(input);
		}
	}
	
}
