package com.vleague.dao.impl;

import java.sql.*;

public class DAO {
	private static String DB_URL = "jdbc:mysql://localhost:3306/vleague?useSSL=false";
	private static String USER_NAME = "root";
	private static String PASSWORD = "1234";
	
	public static Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
//			String unicode="useSSL=false&autoReconnect=true&useUnicode=yes&characterEncoding=UTF-8";	
			connection =  DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("connect failure!");
			e.printStackTrace();
		}catch (SQLException ex) {
			System.out.println("has err in sql");
			ex.printStackTrace();
		}
		return connection;
	}
	
	 protected void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
}
