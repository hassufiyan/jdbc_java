package com.xworkz.cars.service;

import java.util.List;

import com.xworkz.cars.dto.CarsDto;
import com.xworkz.cars.repo.CarsRepo;
import com.xworkz.cars.repo.CarsRepoImpl;

public class CarsServiceImpl implements CarsService {

	CarsRepo repo=new CarsRepoImpl();

	@Override
	public boolean save(CarsDto dto) {
		if(dto!=null && dto.getBrand().length()>=3) {
			System.out.println("The data is in service");
			repo.save(dto);
			System.out.println("The data is saved in database...");
		}
		return true;
	}

	@Override
	public List<CarsDto> read() {
		System.out.println("The data is in service");
		return repo.read();
	}

	@Override
	public List<CarsDto> findByName(String name) {
		System.out.println("The dTABASE is in service");
		if(name!=null && name.length()>=3) {
			System.out.println("data sending to repository");
		
		}
		return repo.findByName(name);
		
	}

	@Override
	public CarsDto updateColorByIndex(String color, int index) {
		System.out.println("1234");
		if(color!=null && color.length()>=3 && index>=0) {
			System.out.println("data is in service");
			repo.updateColorByIndex(color,index);
		}
		return null;
	}

	@Override
	public CarsDto updateSpeedByBrand(int speed, String brand) {
		if(speed>=100 && brand!=null && brand.length()>=3) {
			System.out.println("Data is in service...");
			repo.updateSpeedByBrand(speed,brand);
		}
		return null;
	}

	@Override
	public CarsDto updatePricedByType(int price, String type) {
		if(price>=600000 && type!=null && type.length()>=3 ) {
			System.out.println("data is in service and sending to repository");
			
		}
		return repo.updatePricedByType(price,type);
	}

	@Override
	public boolean deleteByIndex(int index) {
	System.out.println("data must be sent to repository for deletion");
	repo.deleteByIndex(index);
		return false;
	}

	@Override
	public boolean deleteBrandByColor( String color,String brand) {
		System.out.println("delet the data and sending to repository");
		boolean del=repo.deleteBrandByColor(color,brand);
		System.out.println(del);
	
	
	return true;
	}
	
	
	

	

}
