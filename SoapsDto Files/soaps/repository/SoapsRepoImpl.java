package com.xworkz.soaps.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.constants.SqlCredentials;
import com.xworkz.soaps.dto.SoapsDto;

public class SoapsRepoImpl implements SoapsRepo {

	@Override
	public SoapsDto save(SoapsDto dto) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
		String query="INSERT INTO Soaps Values(?,?,?,?,?,?,?,?)";
		
			PreparedStatement statement =connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setDouble(3, dto.getPrice());
			statement.setString(4, dto.getColor());
			statement.setString(5,dto.getFragrance());
			statement.setDouble(6, dto.getWeight());
			statement.setInt(7, dto.getManufactureDate());
			statement.setString(8, dto.getType());
			
		int	status=statement.executeUpdate();
			System.out.println(status);
			
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
	public List<SoapsDto> read() {
		List<SoapsDto> list=new ArrayList<SoapsDto>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
			String query="SELECT * FROM Soaps";
			
		PreparedStatement statement=connection.prepareStatement(query);
			
			ResultSet	rs=statement.executeQuery();
		
			
			
			while(rs.next()) {
			
		int id=	rs.getInt("id");
		String name=rs.getString("name");
		double price=	rs.getDouble("price");
		String color=	rs.getString("color");
			String fragrance=rs.getString("fragrance");
			double weight=rs.getDouble("weight");
			int manufacture=rs.getInt("manufactureDate");
			String type=rs.getString("type");
			
			SoapsDto dto=new SoapsDto(id, name, price, color, fragrance, weight, manufacture, type);
			list.add(dto);
			}
			return list;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public SoapsDto findByNameAndPrice(String name, double price) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
			
			String query="SELECT * FROM SOAPS WHERE name=? and price=?";

			PreparedStatement statement=connection.prepareStatement(query);
			
			statement.setString(1, name);
			statement.setDouble(2, price);
			
			
		ResultSet rs=statement.executeQuery();
			
		if(rs.next()) {
			int id=	rs.getInt("id");
			String name1=rs.getString("name");
			double price1=rs.getDouble("price");
			String color=	rs.getString("color");
				String fragrance=rs.getString("fragrance");
				double weight=rs.getDouble("weight");
				int manufacture=rs.getInt("manufactureDate");
				String type=rs.getString("type");
				
			SoapsDto dto=new SoapsDto(id, name1, price1, color, fragrance, weight, manufacture, type);
		return dto;
		
		}		
		
		statement.close();
		connection.close();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	@Override
	public boolean updateNameByPrice(String name, double price) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
			String query="UPDATE SOAPS SET name=? where price=?";
			
	PreparedStatement statement=connection.prepareStatement(query);
			
	statement.setString(1, name);
	statement.setDouble(2, price);
	int status=statement.executeUpdate();
	System.out.println(status);
			
	statement.close();
	connection.close();
	
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	@Override
	public boolean updateColorAndFragranceByName(String color, String fragrance, String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
			String query="UPDATE SOAPS SET color=?, fragrance=? where name=?";
			
		PreparedStatement	statement=connection.prepareStatement(query);
		statement.setString(1, color);
		statement.setString(2,fragrance);
		statement.setString(3,name);
		
		int	status=statement.executeUpdate();
			System.out.println(status);
			statement.close();
			connection.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateTypeByid(String type, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection	connection=DriverManager.getConnection(SqlCredentials.URL.value,SqlCredentials.USERNAME.value ,SqlCredentials.PASSWORD.value);
			
			String query="UPDATE SOAPS SET type=? where id=? ";
			
		PreparedStatement statement=connection.prepareStatement(query);
			statement.setString(1, type);
			statement.setInt(2, id);
			
		int	status=statement.executeUpdate();
		System.out.println(status);
			
		statement.close();
		connection.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

}
