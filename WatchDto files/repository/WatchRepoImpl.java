package com.xworkz.watch.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.x.protobuf.MysqlxPrepare.Prepare;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.utilresources.DButils;

public class WatchRepoImpl implements WatchRepo {

	@Override
	public WatchDto save(WatchDto dto) {
	
	
	String query="INSERT into watch VALUES(?,?,?,?,?)";
	
try(Connection connection=DButils.getConnection();PreparedStatement	statement=connection.prepareStatement(query);) {
	
	statement.setInt(1, dto.getId());
	statement.setString(2, dto.getBrandName());
	statement.setString(3, dto.getColor());
	statement.setString(4,dto.getType());
	statement.setInt(5, dto.getPrice());
	
	statement.executeUpdate();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
		return null;
	}

	@Override
	public List<WatchDto> readAll() {
	String query="SELECT * FROM  watch";
	List<WatchDto> list=new ArrayList();
	try(Connection connection=DButils.getConnection();PreparedStatement	statement=connection.prepareStatement(query);) {
	
ResultSet	rs=statement.executeQuery();

while (rs.next()) {
int id =rs.getInt(1);
String name=rs.getString(2);
String color=rs.getString(3);
String type=rs.getString(4);
int price=rs.getInt(5);
	
	WatchDto dto=new WatchDto(id, name, color, type, price);
	list.add(dto);	
	}
	return list;
	}	catch (SQLException e) {

		e.printStackTrace();
	
}
		return null;
	}

	@Override
	public WatchDto findByNameAndColor(String name, String color) {
	String query="SELECT * FROM  watch WHERE bradnName=? and color=?";
	
	try(Connection connection=DButils.getConnection();PreparedStatement	statement=connection.prepareStatement(query);) {
		statement.setString(1,name);
		statement.setString(2,color);
	ResultSet	rs=statement.executeQuery();

	while (rs.next()) {
	int id =rs.getInt(1);
	String name1=rs.getString(2);
	String color1=rs.getString(3);
	String type=rs.getString(4);
	int price=rs.getInt(5);
	WatchDto dto=new WatchDto(id, name1, color1, type, price);
	return dto;
	}

	}
	catch (SQLException e) {

		e.printStackTrace();
	
}	
		return null;
}

	@Override
	public WatchDto findByidAndType(int id, String type) {
	


	String query="SELECT * FROM  watch WHERE id=? and type=?";
	
try(Connection	connection=DButils.getConnection();PreparedStatement statement=connection.prepareStatement(query);) {
	
	statement.setInt(1,id);
	statement.setString(2,type);
ResultSet rs=statement.executeQuery();
while (rs.next()) {
	int id1 =rs.getInt(1);
	String name=rs.getString(2);
	String color=rs.getString(3);
	String type1=rs.getString(4);
	int price=rs.getInt(5);
	WatchDto dto=new WatchDto(id1, name, color, type1, price);
	return dto;
	}
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}	
		return null;
	}

	@Override
	public boolean updateNameById(String name, int id) {
		String query="UPDATE Watch SET bradnName=? where id=?";

		try(Connection connection=DButils.getConnection();PreparedStatement statement=connection.prepareStatement(query);) {
			statement.setString(1, name);
			statement.setInt(2, id);
			
		int	status=statement.executeUpdate();
		System.out.println(status);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return true;
	}

	@Override
	public boolean deleteBycolorandtype(String color, String type) {


String query="DELETE FROM watch WHERE COLOR=? and type=?";
	
try(Connection connection=DButils.getConnection();PreparedStatement statement=connection.prepareStatement(query);) {
	
statement.setString(1, color);
statement.setString(2,type);

int	status=statement.executeUpdate();
System.out.println(status);
	
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}	
		return true;
	}

//	@Override
//	public WatchDto saveAll(WatchDto dto) {
//	
//	String query="INSERT into watch VALUES(?,?,?,?,?)";
//	try(Connection connection=DButils.getConnection();PreparedStatement	statement=connection.prepareStatement(query);) {
//		
//	statement.setInt(1,  dto.getId());
//	statement.setString(2, dto.getBrandName());
//		statement.setString(3,  dto.getColor());
//		statement.setString(4, dto.getType());
//		statement.setInt(5,  dto.getPrice());
//		
//		statement.executeUpdate();
//	} catch (SQLException e) {
//		// TODO Auto-generated catch block
//		e.printStackTrace();
//	}	
//		return null;
//	}
}
