package com.xworkz.theater_service;


import java.util.ArrayList;
import java.util.List;



import com.xworkz.theaterdto.TheaterDto;

import theatre_repo.Theater_Rep_Impl;
import theatre_repo.Theater_Repo;

public class Theater_Service_impl implements TheaterService{

Theater_Repo repository=new Theater_Rep_Impl();

	
	
	public boolean save(TheaterDto theaterdto) {
		if(theaterdto!=null) {
			if(theaterdto.getName().length()>=3) {
				System.out.println("DTO is not null and sending to repository..");
				repository.save(theaterdto);
				return true;
			}
			
			else {
			System.out.println("DTO is null");
			return false;
		
			}
		
		}
		return false;
		}

	@Override
	public List<TheaterDto> read() {
		System.out.println("DTO is in service and will be transfered to repository to read the data..");
		System.out.println("The Data present in TheaterDto is..");
		return repository.read();
		 
		
	}

	@Override
	public TheaterDto findByName(String name) {
	 List<TheaterDto> listTheater=repository.read();
	 for(TheaterDto theaterName:listTheater) {
		 if(theaterName.getName().equals(name)) {
			 if(theaterName.getName().length()>=3) {
				 System.out.println("The details of theater entered is...");
				System.out.println(theaterName);
				
			 }
		 
		 }
	 }
	return null;
	
		
		
		
		
	}

	

	


	}


	






	
			
	
	
		

