package com.xworkz.soaps.repository;

import java.util.List;

import com.xworkz.soaps.dto.SoapsDto;

public interface SoapsRepo {

	
	public SoapsDto save(SoapsDto dto);
	
	public List<SoapsDto> read();
	
	public SoapsDto findByNameAndPrice(String name,double price);

	public boolean updateNameByPrice(String name,double price);
	
	public boolean updateColorAndFragranceByName(String color,String fragrance,String name);
	
	public boolean updateTypeByid(String type,int id);
	
	
	
	
	
}
