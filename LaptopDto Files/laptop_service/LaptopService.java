package com.xworkz.laptop_service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptopdto.LaptopDto;

public interface LaptopService {
	
	public boolean save(LaptopDto dto);
	
	public ArrayList<LaptopDto> read(String password);
	
	public LaptopDto findByName(String name);
	
	public LaptopDto deleteByIndex(int index);
	
	public LaptopDto updateNameByIndex(String name,int index);
	
	
	
	
	
	
	
	
	

}
