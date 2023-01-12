package com.xworkz.shirt.repository;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;

public interface ShirtRepo {
	
	public ShirtDto save(ShirtDto dto);
	
	public List<ShirtDto> readAll();
	
	public ShirtDto findByName(String name);
	
	public boolean updatePriceByName(double price,String name);
	
	public boolean deleteByColor(String color);
	
	public boolean deleteSizeByName(int size,String name);

}
