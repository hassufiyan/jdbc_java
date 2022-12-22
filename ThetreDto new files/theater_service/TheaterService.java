package com.xworkz.theater_service;

import java.util.List;

import com.xworkz.theaterdto.TheaterDto;

public interface TheaterService {
	
	public boolean save(TheaterDto theaterdto);

	public List<TheaterDto> read();
	
	public TheaterDto findByName(String name);
	
}
