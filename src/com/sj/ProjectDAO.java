package com.sj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProjectDAO {

	Connection con;
	
	public boolean insertProject(Project p)
	{
		try {
			con=DBConnector.getConnection();
			PreparedStatement a = con.prepareStatement("insert into Project values(?.?.?.?)");
			a.setInt(1, p.getId());
			a.setString(2, p.getTitle());
			a.setString(3, (String) p.getDomain());
			a.setString(4, p.getDescription());
			a.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}return false;
	}
}
