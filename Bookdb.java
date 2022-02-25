package com.ac.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Bookdb {
	
	public static Connection getConnection() 
			  throws Exception
			  {
				
				 String driverName = "org.postgresql.Driver";
				  Class.forName(driverName);
				  Connection conn = DriverManager.getConnection(
				             "jdbc:postgresql://localhost/bookstore","postgres","nikhil"
				             		+  "");
				
				return conn; 
			  }

}
