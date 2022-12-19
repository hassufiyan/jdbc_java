package com.xworkz.theater;

import com.xworkz.theaterdto.TheaterDto;

public interface Theater_Repo {
	
	public boolean save(TheaterDto theaterdto);
	
	public boolean read(TheaterDto theaterdto);
	}


