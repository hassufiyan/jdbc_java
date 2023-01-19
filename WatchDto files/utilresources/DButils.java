package com.xworkz.watch.utilresources;

import java.sql.Connection;
import java.sql.DriverManager;

import com.xworkz.watch.Constants.SqlCredentials;



public class DButils {
	public static Connection getConnection(){
		Connection	connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
 connection=DriverManager.getConnection(SqlCredentials.URL.getValue(),SqlCredentials.USERNAME.getValue() ,SqlCredentials.PASSWORD.getValue());
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		return connection;				
	}


}
