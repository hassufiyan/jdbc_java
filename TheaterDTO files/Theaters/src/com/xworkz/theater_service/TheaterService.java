package com.xworkz.theater_service;

import com.xworkz.theaterdto.TheaterDto;

public interface TheaterService {
	
	public boolean save(TheaterDto theaterdto);

	public TheaterDto read(TheaterDto theaterdto);
	
	public TheaterDto findByName(TheaterDto theaterdto);
}
