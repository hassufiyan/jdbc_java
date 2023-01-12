package com.xworkz.shirt.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.utilresources.DBUtils;

public class ShirtRepoImpl implements ShirtRepo {

	@Override
	public ShirtDto save(ShirtDto dto) {
String query="INSERT INTO Shirt VALUES(?,?,?,?,?,?)";

		
try(Connection connection = DBUtils.getConnection();	
		PreparedStatement statement = connection.prepareStatement(query);	) 
{

	
	statement.setInt(1, dto.getId());
	statement.setDouble(2, dto.getPrice());
	statement.setString(3, dto.getBrandName());
	statement.setString(4, dto.getColor());
	statement.setInt(5, dto.getSize());
	statement.setBoolean(6, dto.isHasPocket());

	int status=statement.executeUpdate();
	System.out.println(status);


} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
		return null;
	}

	@Override
	public List<ShirtDto> readAll() {
	String query="SELECT * FROM  Shirt";	
try(Connection connection=DBUtils.getConnection();	PreparedStatement statement=connection.prepareStatement(query);) {

List<ShirtDto>	list=new ArrayList<ShirtDto>();
ResultSet rs=statement.executeQuery();	
	
	while(rs.next()) {
		int id=rs.getInt(1);
		double price=rs.getDouble(2);
		String name=rs.getString(3);
		String color=rs.getString(4);
		int size=rs.getInt(5);
		boolean isPocket=rs.getBoolean(6);
	
		ShirtDto dto=new ShirtDto(id, price, name, color, size, isPocket);
		list.add(dto);
	}
	return list;
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
return null;
	}

	@Override
	public ShirtDto findByName(String name) {
	String query="SELECT * FROM Shirt WHERE brandName=?";
	
	try(Connection	 connection=DBUtils.getConnection();PreparedStatement	statement=connection.prepareStatement(query);) {
		
		statement.setString(1,name);
		
	ResultSet rs=statement.executeQuery();
		
	while(rs.next()) {
	int	id=rs.getInt("id");
	double price=rs.getDouble("price");
	String name1=rs.getString("brandName");
	String color=rs.getString("color");
	int size=rs.getInt("size");
	boolean isPocket=rs.getBoolean("isPocket");
	
	ShirtDto dto=new ShirtDto(id, price, name1, color, size, isPocket);
	return dto;
	
	}		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return null;
	}

	@Override
	public boolean updatePriceByName(double price, String name) {
		String query="UPDATE Shirt SET price=? where brandName=?";
				
	try(Connection connection=DBUtils.getConnection();PreparedStatement statement=connection.prepareStatement(query);) {
		
		statement.setDouble(1, price);
		statement.setString(2, name);
		
int status =statement.executeUpdate();		
	System.out.println(status);	
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}		
		return false;
	}

	@Override
	public boolean deleteByColor(String color) {
Connection connection=DBUtils.getConnection();
		
String query="DELETE FROM SHIRT WHERE COLOR=?";	
		
try {
	PreparedStatement statement=connection.prepareStatement(query);
	statement.setString(1, color);
	
int	status=statement.executeUpdate();
	System.out.println(status);
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
		
		return false;
	}

	@Override
	public boolean deleteSizeByName(int size, String name) {
		
		
String query="DELETE FROM SHIRT WHERE size=? and brandName=? ";		
try(Connection connection=DBUtils.getConnection();	PreparedStatement statement=connection.prepareStatement(query);) {
	
	statement.setInt(1,size);
	statement.setString(2, name);
	
int	status=statement.executeUpdate();
	System.out.println(status);
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}		



		return false;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
