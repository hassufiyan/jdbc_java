package com.xworkz.watch.service;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.a.NativeConstants.StringLengthDataType;
import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.repository.WatchRepo;
import com.xworkz.watch.repository.WatchRepoImpl;
import com.xworkz.watch.utilresources.DButils;

public class WatchServiceImpl implements WatchService {

	 WatchRepo repo=new WatchRepoImpl();
	
	@Override
	public WatchDto save(WatchDto dto) {
	if(dto!=null) {
	System.out.println("dto is not null");
	}
	else {
		System.out.println("dto is null");
	}
	if(dto.getBrandName()!=null && dto.getBrandName().length()>=3) {
		System.out.println("brandName is valid");
	}
	else {
		System.out.println("brandName is not valid");
	}
	if(dto.getType()!=null && dto.getType().length()>=2) {
		System.out.println("valid type");
	}else {
		System.out.println("type is not valid");
	}
	if(dto.getColor()!=null && dto.getColor().length()>=2) {
		System.out.println("color is valid");
	}
	else{
		System.out.println("Color is not valid");
	}
	if(dto.getPrice()>=5000) {
		System.out.println("valid price");
	}
	else{
		System.out.println("price is not valid");
	}
	System.out.println("ALl the fileds has been validated and sending the data to repository");
	return repo.save(dto);
	
	}

	
	
	@Override
	public List<WatchDto> readAll() {
		return repo.readAll();
	}
	

	@Override
	public WatchDto findByNameAndColor(String name, String color) {
if(name!=null && name.length()>=3) {
	System.out.println("name is valid");
}
else {
	System.out.println("name is not valid");
}
if(color!=null && color.length()>=2) {
	System.out.println("color is valid");
}
else {
	System.out.println("color is not valid");
}
		return repo.findByNameAndColor(name,color);
	}
	

	@Override
	public WatchDto findByidAndType(int id, String type) {
		if(id>=0) {
			System.out.println("id is valid");
		}
		else {
			System.out.println("id is invalid");
		}
		if(type!=null && type.length()>=2) {
			System.out.println("type is valid");
		}
		else {
			System.out.println("type is not valid");
		}
		return repo. findByidAndType(id,type);
	}
	

	@Override
	public boolean updateNameById(String name, int id) {
if(name!=null && name.length()>=3) {
	System.out.println("name is valid");
}
else {
	System.out.println("Name is not valid");
}
if(id>=0) {
	System.out.println("id is not valid");
}
else {
	System.out.println("id is not valid");
}

		return repo.updateNameById(name,id);
	}
	

	@Override
	public boolean deleteBycolorandtype(String color, String type) {
if(color!=null && color.length()>=2) {
	System.out.println("color is valid");
}
else {
	System.out.println("color is not vlaid");
}
if(type!=null && type.length()>=2) {
	System.out.println("type is valid");
}
else {
	System.out.println("type is not valid");
}
		return repo.deleteBycolorandtype(color,type);
	}



//	@Override
//	public WatchDto saveAll<List(WatchDto> dto) {
//		return repo.saveAll(dto);
//		
//	}

}
