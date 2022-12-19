package com.xworkz.theater_service;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater.Theater_Rep_Impl;
import com.xworkz.theater.Theater_Repo;
import com.xworkz.theaterdto.TheaterDto;

public class Theater_Service_impl implements TheaterService{

TheaterDto data=new TheaterDto();
Theater_Repo repository=new Theater_Rep_Impl();
List<TheaterDto> dataDto1=new ArrayList<TheaterDto>();
	
	
	public boolean save(TheaterDto theaterdto) {
		if(data!=null) {
			repository.save(theaterdto);
			System.out.println("Theater services are not null");
			return true;
			}
			
			else {
			System.out.println("Theatre services are null");
			return false;
		
			}
		
		
		}


	@Override
	public TheaterDto read(TheaterDto theaterdto) {
		for(TheaterDto datadto:dataDto1) {
			 System.out.println(datadto);
			
	}
		return theaterdto;
		
}
}


	
			
	
	
		

