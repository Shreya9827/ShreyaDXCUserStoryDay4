package com.sj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {

	static DBConnector db;
	private DBConnector() {
	}
	public static DBConnector	getInstance() {
	
		if(db==null)
			db=new DBConnector();
			return db;
	}
	public static Connection getConnection() throws SQLException{
		return(DriverManager.getConnection("jdbc:mysql://localhost:3306/schema","root","Mum#271930"));
	}

}
