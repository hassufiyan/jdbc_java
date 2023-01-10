package com.xworkz.bags.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.bags.dto.BagsDto;
import com.xworkz.sqlcredentials.SqlCredentials;

public class BagsRepoImpl implements BagsRepo {

	@Override
	public BagsDto save(BagsDto dto) {
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
Connection connection=DriverManager.getConnection(SqlCredentials.URL.value, SqlCredentials.USERNAME.value, SqlCredentials.PASSWORD.value);		
		
		String query="INSERT INTO Bags VALUES(?,?,?,?,?)";
		
		PreparedStatement statement =connection.prepareStatement(query);
		
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getName());
		statement.setDouble(3, dto.getPrice());
		statement.setString(4, dto.getColor());
		statement.setDouble(5, dto.getCapacity());
		
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
		return null;
	}

	@Override
	public BagsDto findByName(String name) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(SqlCredentials.URL.value, SqlCredentials.USERNAME.value, SqlCredentials.PASSWORD.value);
			
			
			String query="SELECT * FROM BAGS WHERE NAME=?";
			
			PreparedStatement statement =connection.prepareStatement(query);
			statement.setString(1, name);
			
		ResultSet rs=statement.executeQuery();
			 if(rs.next()) {
				 int id=rs.getInt("id");
				 String brandName=rs.getString("name");
				 double price=rs.getDouble("price");
				 String color=rs.getString("color");
				 double capacity=rs.getDouble("capacity");
				 
				 
				 BagsDto dto=new BagsDto(id, brandName, price, color, capacity);
				 System.out.println(dto);
				 
			 }
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public BagsDto findbyNameId(String name, int id) {
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection connection=DriverManager.getConnection(SqlCredentials.URL.value, SqlCredentials.USERNAME.value, SqlCredentials.PASSWORD.value);
	
	
	String query="SELECT * FROM BAGS WHERE NAME=? and id=?";
	
	PreparedStatement statement =connection.prepareStatement(query);
	statement.setString(1, name);
	statement.setInt(2, id);
	
	
	ResultSet rs=statement.executeQuery();
	 if(rs.next()) {
		 int id1=rs.getInt("id");
		 String brandName=rs.getString("name");
		 double price=rs.getDouble("price");
		 String color=rs.getString("color");
		 double capacity=rs.getDouble("capacity");
		 
		 BagsDto dto=new BagsDto(id1, brandName, price, color, capacity);
	System.out.println(dto);
	
	
	 }
}
	
	
	
	
	
	
 catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		
		
		
		
		return null;
	}
}

