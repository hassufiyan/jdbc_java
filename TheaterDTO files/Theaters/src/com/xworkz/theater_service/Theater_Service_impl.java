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


	public TheaterDto read(TheaterDto theaterdto) {
	if(theaterdto!=null) {
		System.out.println("The requested theatre data is not null..");
	}
		return theaterdto;
	}
List<TheaterDto> list=repository.findByName();

	@Override
	public TheaterDto findByName(TheaterDto theaterdto) {
		System.out.println("The theatre details are..");
		for(TheaterDto lists:list) {
			if(lists.getName().equals(list)) {
			System.out.println(theaterdto);
			}
		}
		return theaterdto ;
	
	}


	}


	






	
			
	
	
		

