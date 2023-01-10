package com.xworkz.bags;

import com.xworkz.bags.dto.BagsDto;
import com.xworkz.bags.repository.BagsRepo;
import com.xworkz.bags.repository.BagsRepoImpl;

public class BagsRunner {

	public static void main(String[] args) {
		
		BagsRepo repo=new  BagsRepoImpl();
		
		
	
	BagsDto hermes=new BagsDto(1, "Hermes Kelly's", 2500.34, "Black", 30.23);
	BagsDto sky=new BagsDto(2, "Sky Bags", 3500.23, "Sky Blue", 50.12);
	BagsDto diesel=new BagsDto(3, "Diesel", 2800.98, "Dark Blue", 60.23);
	
	
//	repo.save(diesel);
//	repo.save(sky);
//	repo.save(hermes);
//	
	
	//repo.findByName("Sky Bags");
	
	repo.findbyNameId("Hermes Kelly's", 1);
	
	
	
	}
	}