package com.xworkz.bags;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Clob;

public class BagsRunner {

	public static void main(String[] args) {
		 String userName="root";
		 String password="Xworkzodc@123";
		 String host="jdbc:mysql://localhost:3306/ Xworkz";
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(host, userName, password);
			
			String sqlQuery="Select * From laptops where id=?";
					
		PreparedStatement statement=connection.prepareStatement(sqlQuery);
		statement.setInt(1, 1);
 ResultSet rs=statement.executeQuery();
rs.next();

	String name =rs.getString("name");
	System.out.println("name is "+name);
	String color =rs.getString("color");
	System.out.println("color is "+color);



          
		statement.execute();
		
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
