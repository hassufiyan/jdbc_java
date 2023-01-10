<<<<<<< HEAD
package com.xworkz.television.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public class TelevisionRepoImpl implements TelevisionRepo {

	List<TelevisionDto> list=new ArrayList();
	
	
	@Override
	public TelevisionDto save(TelevisionDto dto) {
	System.out.println("Saving the data into database");
	list.add(dto);
	return dto;
	}


	@Override
	public List<TelevisionDto> read() {
		System.out.println("reading the data from database");
		return list;
	}


	@Override
	public List<TelevisionDto> findByNameAndSize(String name, int size) {
	for(TelevisionDto data:list) {
		System.out.println("finding the data from databse");
		if(data.getModelName().equalsIgnoreCase(name) && data.getSizeInInches()==size) {
			System.out.println("data has been fetched from database based on name and size");
		System.out.println(data);	
		}
	
	}
	return list;
	}


	@Override
	public boolean updateSizeByType(int size, String type) {
	for (int i = 0; i < list.size(); i++) {
	TelevisionDto d1=list.get(i);
	System.out.println("taken the data from database");
	if(d1.getType().equalsIgnoreCase(type) && d1.getSizeInInches()==size) 
		System.out.println("updating by type and size");
		d1.setSizeInInches(size);
		list.set(i, d1);
		System.out.println("updated");
	return true;
		
	}
		return false;
	}


	@Override
	public boolean deleteByNameAndColor(String name, String color) {
Iterator<TelevisionDto> itr=list.iterator();

while(itr.hasNext()) {
	TelevisionDto data=itr.next();
	if(data.getModelName().equalsIgnoreCase(name) && data.getColor().equalsIgnoreCase(color)) {
		System.out.println("deleting dto from database");
		itr.remove();
	return true;
	}

}

return true;
	}


	@Override
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index) {
		for(TelevisionDto  data:list)  {
			System.out.println("finding the data in database1");
			if(data.getType().equalsIgnoreCase(type) && data.getColor().equalsIgnoreCase(color)) {
				System.out.println("found the data");
				System.out.println(data);
			}
				
	}
		
		return null;
	}
}
=======
package com.xworkz.television.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public class TelevisionRepoImpl implements TelevisionRepo {

	List<TelevisionDto> list=new ArrayList();
	
	
	@Override
	public TelevisionDto save(TelevisionDto dto) {
	System.out.println("Saving the data into database");
	list.add(dto);
	return dto;
	}


	@Override
	public List<TelevisionDto> read() {
		System.out.println("reading the data from database");
		return list;
	}


	@Override
	public List<TelevisionDto> findByNameAndSize(String name, int size) {
	for(TelevisionDto data:list) {
		System.out.println("finding the data from databse");
		if(data.getModelName().equalsIgnoreCase(name) && data.getSizeInInches()==size) {
			System.out.println("data has been fetched from database based on name and size");
		System.out.println(data);	
		}
	
	}
	return list;
	}


	@Override
	public boolean updateSizeByType(int size, String type) {
	for (int i = 0; i < list.size(); i++) {
	TelevisionDto d1=list.get(i);
	System.out.println("taken the data from database");
	if(d1.getType().equalsIgnoreCase(type) && d1.getSizeInInches()==size) 
		System.out.println("updating by type and size");
		d1.setSizeInInches(size);
		list.set(i, d1);
		System.out.println("updated");
	return true;
		
	}
		return false;
	}


	@Override
	public boolean deleteByNameAndColor(String name, String color) {
Iterator<TelevisionDto> itr=list.iterator();

while(itr.hasNext()) {
	TelevisionDto data=itr.next();
	if(data.getModelName().equalsIgnoreCase(name) && data.getColor().equalsIgnoreCase(color)) {
		System.out.println("deleting dto from database");
		itr.remove();
	return true;
	}

}

return true;
	}


	@Override
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index) {
		for(TelevisionDto  data:list)  {
			System.out.println("finding the data in database1");
			if(data.getType().equalsIgnoreCase(type) && data.getColor().equalsIgnoreCase(color)) {
				System.out.println("found the data");
				System.out.println(data);
			}
				
	}
		
		return null;
	}
}
>>>>>>> e2424ffadd2223dd193b3585addd8a357f51bf23
