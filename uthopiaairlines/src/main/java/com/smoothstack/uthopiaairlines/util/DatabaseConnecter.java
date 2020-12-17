package com.smoothstack.uthopiaairlines.util;
import java.sql.*; 
public class DatabaseConnecter {
	private static Connection connection;

	public static Connection hardcodedConnection() throws SQLException {

		String url = "url";
		String username = "username";
		String password = "password";

		if (connection == null || connection.isClosed()) {
			connection = DriverManager.getConnection(url, username, password);
		}

		return connection;
	}
}
