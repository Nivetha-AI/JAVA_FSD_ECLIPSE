package com.dao;

import java.sql.*;


public class DBConnector {
	// step 1: defines all DB variable 
  private String usernameDb="root";
  private String passwordDb="";
  private String urlDb ="jdbc:mysql://localhost:3306/hexfeb2024";
  private String driverName="com.mysql.jdbc.Driver";
  private Connection conn;
  
 // step 2:Load the Driver
  public Connection dbconnect() {
	  try {
		Class.forName(driverName);
//		System.out.println("Driver loaded successfully .. ");
	} catch (ClassNotFoundException e) {
		System.out.println("Driver Could not be loaded");
		e.printStackTrace();
	}
	// step 3:  establish the connection
	  try {	
		 conn = DriverManager.getConnection(urlDb, usernameDb, passwordDb);
//		 System.out.println("Connection established ..");
	} catch (SQLException e) {
       System.out.println("connection could not be established");
        e.printStackTrace();
	 }
	  return conn;
  }
  public void dbclose() {
	  try {
		conn.close();
		System.out.println("Connection closed ..");
	} catch (SQLException e) {
		e.printStackTrace();
	}
  }
  
   
}
