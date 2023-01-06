package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BagsRunner {

	public static void main(String[] args) {
		 String userName="root";
		 String password="Xworkzodc@123";
		 String host="jdbc:mysql://localhost:3306/ Xworkz";
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(host, userName, password);
			
			String query="INSERT INTO laptops VALUES(?,?,?,?,?)";
			
		PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, 1);
			statement.setString(2, "Hp elite");
			statement.setString(3, "HP");
			statement.setDouble(4, 25.687);
			statement.setString(5, "Grey");
			
			statement.setInt(1, 2);
			statement.setString(2, "Dell notepad");
			statement.setString(3, "Dell");
			statement.setDouble(4, 32.267);
			statement.setString(5, "Black");
			
		statement.executeUpdate();
		
		statement.close();
		connection.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		
		

	}

}
