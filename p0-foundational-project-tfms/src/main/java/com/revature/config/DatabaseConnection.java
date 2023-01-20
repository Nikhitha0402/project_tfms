package com.revature.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection connection = null;

	public static Connection getConnection() {
		if (connection == null) {
			String dburl = "jdbc:mysql://localhost:3306/tfms";
			String driver = "com.mysql.cj.jdbc.Driver";
			String username = "root";
			String password = "nikky";

			try {

				Class.forName(driver);
				connection = DriverManager.getConnection(dburl, username, password);
				System.out.println("Connection Succesful");

			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}

		}
		return connection;

	}

}
