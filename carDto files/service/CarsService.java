package com.xworkz.cars.service;

import java.util.List;

import com.xworkz.cars.dto.CarsDto;

public interface CarsService {
	
	public boolean save(CarsDto dto);
	
	public List<CarsDto> read();
	
	public List<CarsDto> findByName(String name);
	
	public CarsDto updateColorByIndex(String color,int index);
	
	public CarsDto updateSpeedByBrand(int speed,String brand);
	
	public CarsDto updatePricedByType(int price,String type);
	
	public boolean deleteByIndex(int index);
	
	public boolean deleteBrandByColor(String color,String brand);
	
	
	
	
	
	
	
	
	
	
	
	

}
