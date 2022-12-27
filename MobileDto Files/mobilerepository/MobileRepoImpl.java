package com.xworkz.mobilerepository;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobiledto.MobileDto;

public class MobileRepoImpl implements MobileRepo {

	List<MobileDto> database=new ArrayList<MobileDto>(); 
	
	@Override
	public boolean save(MobileDto dto) {
		database.add(dto);
		System.out.println("The data have benn saved into database");
		return true;
	
		
	}

	@Override
	public List<MobileDto> read(String password) {
	System.out.println("Data is in repository and being read");
		return database;
	}

	@Override
	public MobileDto findByName(String name) {
		System.out.println("The data recieved from database is...");
		return null;
	}

	@Override
	public MobileDto updateNameByIndex(String name, int index) {
		MobileDto mList=database.get(index);
		mList.setModleName(name);
		database.set(index, mList);
		return null;
	}

	@Override
	public boolean deleteByIndex(int index) {
		database.remove(index);
		return true;
	}
}
