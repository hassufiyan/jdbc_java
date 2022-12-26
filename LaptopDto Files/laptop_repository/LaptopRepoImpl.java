package com.xworkz.laptop_repository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptopdto.LaptopDto;




public class LaptopRepoImpl implements LaptopRepo {
	ArrayList<LaptopDto> database=new ArrayList<LaptopDto>();
	
	@Override
	public boolean save(LaptopDto dto) {
		database.add(dto);
		System.out.println("Dto has been addede to the database");
		return true;
	}

	@Override
	public ArrayList<LaptopDto> read(String password) {
System.out.println("Dto is in repository and the data is being read");	
		return database;
	}

	@Override
	public LaptopDto findByName(String name) {
		System.out.println("The entred data is");
		return null;
	}

	@Override
	public LaptopDto deleteByIndex(int index) {
		database.remove(index);
		System.out.println("the data to be deleted from database based on index is");
		return null;
	}

	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
	database.get(index);
	LaptopDto l1=new LaptopDto();
	l1.setModelName(name);
	database.set(index, l1);
	database.add(l1);
		return null;
	}

}
