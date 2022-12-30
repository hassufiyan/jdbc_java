package com.xworkz.cars.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.cars.dto.CarsDto;

public class CarsRepoImpl implements CarsRepo {
List<CarsDto> database=new ArrayList<CarsDto>();
	@Override
	public boolean save(CarsDto dto) {
		System.out.println("saving in database");
		database.add(dto);
		return true;
	}
	@Override
	public List<CarsDto> read() {
		System.out.println("Data is in repository and reading the data");
		return database;
	}
	@Override
	public List<CarsDto> findByName(String name) {
		System.out.println("data is in repository");
		for(CarsDto list:database) { 
			if(list.getBrand().equals(name)){
				System.out.println("databse is iterating");
				System.out.println("The data is in repo and finding by name in database");
				System.out.println(list);
			
			}
	}
		return database;
	
	}
	@Override
	public CarsDto updateColorByIndex(String color, int index) {
		CarsDto update=database.get(index);
		System.out.println("data has been fetched from database");
			System.out.println("the data has been found and updating");
			update.setColor(color);
			System.out.println("the color has been updated and adding it in database");
			database.set(index, update);
			
			return null;
			
		}
	@Override
	public CarsDto updateSpeedByBrand(int speed, String brand) {
		for (int i = 0; i < database.size(); i++) {
		CarsDto	d1=database.get(i);
		if(d1.getBrand().equals(brand)) {
			System.out.println("the brand is matched in database");
			d1.setTopSpeed(speed);
			database.set(i, d1);
			System.out.println("The speed has been updated by brand name");
		}
			
		}
		return null;
	}
	@Override
	public CarsDto updatePricedByType(int price, String type) {
		for (int i = 0; i < database.size(); i++) {
			CarsDto value=database.get(i);
			if(value.getType().equals(type)) {
				System.out.println("type is matched..");
				value.setPrice(price);
				System.out.println("The price has been updated");
				database.set(i, value);
			}
			
		}
		return null;
	}
	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		return true;
	}
	@Override
	public boolean deleteBrandByColor(String color,String brand) {
		System.out.println("deleting data from database");
		Iterator<CarsDto> itr=database.iterator();
		while(itr.hasNext()) {
			CarsDto delete=itr.next();
			if(delete.getColor().equals(color) && delete.getBrand().equals(brand) );
			System.out.println("deleting brand by color");
			database.remove(color);
		System.out.println("deleed successfully");
		}
		return true;	
	}
}	
		
	
	
	
	
	
	
	
	
	
	


