package com.xworkz.tree.repo;

import java.sql.Clob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.tree.dto.TreeDto;

public class TreeRepoImpl implements TreeRepo{


	 String userName="root";
	 String password="Xworkzodc@123";
	 String host="jdbc:mysql://localhost:3306/ Xworkz";
	
		 
	 @Override
	public TreeDto save(TreeDto dto) {
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(host, userName, password);
			
			String query="INSERT INTO tree VALUES(?,?,?,?,?)";
			
			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2,dto.getName());
			statement.setString(3,dto.getFamily());
			statement.setInt(4,dto.getExsistance());
			statement.setString(5,dto.getScientificName());
			
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
	public TreeDto read() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection=DriverManager.getConnection(host, userName, password);
			
			String sqlQuery="select * from tree where name=?";
			
			
			PreparedStatement statement=connection.prepareStatement(sqlQuery);
			statement.setString(1, "neem");
			
		ResultSet rs=statement.executeQuery();
			
		rs.next();
		//String name=rs.getString("name");
		//System.out.println("name is :"+ name);	
			
		int existence=rs.getInt("Exsistence");
		System.out.println(existence);
		
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
		
		
		
		
		
		
		return null;
	}

}
