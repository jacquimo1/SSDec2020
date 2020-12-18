package com.smoothstack.uthopiaairlines.util;
import java.sql.*; 
public class DatabaseConnecter {
	private static Connection connection;

	public static Connection hardcodedConnection() throws SQLException {

		String url = "ss-dec20-g1.cfpbmu9hqjwi.us-east-2.rds.amazonaws.com";
		String username = "admin";
		String password = "wwN8CK_k8ouHUNMLv7qZ";

		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
		}

		return connection;
	}
}
