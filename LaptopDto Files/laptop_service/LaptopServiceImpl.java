package com.xworkz.laptop_service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop_repository.LaptopRepo;
import com.xworkz.laptop_repository.LaptopRepoImpl;
import com.xworkz.laptopdto.LaptopDto;

public class LaptopServiceImpl implements LaptopService {

	LaptopRepo repo=new LaptopRepoImpl();
	@Override
	public boolean save(LaptopDto dto) {
		if(dto!=null && dto.getModelName().length()>=3) {
			System.out.println("Dto is not null and transffering to repository for saving the data into database");
			repo.save(dto);
			return true;
		}
		else {
			System.out.println("Dto is null");
		}
		return false;
	}
	@Override
	public ArrayList<LaptopDto> read(String password) {
		if(password!=null && password.length()>=5) {
			System.out.println("valid password and transferring the Dto to repository to read the data");
			return repo.read(password);
			
		}
		else {
			System.out.println("Enter a valid password");
		}
		return null;
	}
	@Override
	public LaptopDto findByName(String name) {
		System.out.println("using read() to findByName");
		ArrayList<LaptopDto> laptopList1=repo.read(name);
			for(LaptopDto laptopName:laptopList1) {
				if(laptopName.getModelName().equals(name)) {
					if(laptopName.getModelName().length()>=3) {
					System.out.println("the details of enetred laptop is");
					System.out.println(laptopName);
	
		}
		
			
		}
			}
		return null;
	}
	@Override
	public LaptopDto deleteByIndex(int index) {
		System.out.println("Dto is in service and sending to repository to delete the data");
		repo.deleteByIndex(index);
		return null;
	}
	@Override
	public LaptopDto updateNameByIndex(String name, int index) {
		if(name!=null && name.length()>=3) {
			System.out.println("DTO is in service and it is being transfered to repository for further process...");
	
	
		}
		return repo.updateNameByIndex(name,index);
	}
	
	
	}

