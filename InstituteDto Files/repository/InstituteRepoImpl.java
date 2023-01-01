package com.xworkz.institue.repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.institue.dto.InstituteDto;

public class InstituteRepoImpl implements InstituteRepo {

	List<InstituteDto> list=new ArrayList();
	
	@Override
	public InstituteDto save(InstituteDto dto) {
		System.out.println("data is in repository and saving in databse");
		list.add(dto);
		System.out.println("Dto has been added into databse");
		return null;
	}

	@Override
	public List<InstituteDto> read() {
	System.out.println("Reading the data from databse");
		return list;
	}

	@Override
	public InstituteDto updateLocationByIndex(String location, int index) {
		InstituteDto update=list.get(index);
		System.out.println("data has been fetched from database");
		update.setLocation(location);
		System.out.println("location has been updated");
		list.set(index, update);
		return null;
	}

	@Override
	public InstituteDto updateCourseByName(String course, String name) {
	for (int i = 0; i < list.size(); i++) {
	InstituteDto l1=list.get(i);	
	System.out.println("the data has been taken from database for updating course by name");
	if(l1.getCourse().equals(course) && l1.getName().equals(name)) 
		System.out.println("course is updating by name");
		l1.setCourse(course);
		list.set(i, l1);
		return l1;
	}
		return null;
	}

	@Override
	public boolean deleteByRating(int rating) {
	System.out.println("deleting by rating");
	list.remove(rating);
	return true;
	}

	@Override
	public List<InstituteDto> findByNameAndCourse(String name, String course) {
		for(InstituteDto data:list) {
			if(data.getName().equals(name)&& data.getCourse().equals(course)) {
				System.out.println("name and course is matched with data present in database");
			System.out.println(data);
				
		}
		}
		 return list;
	
		}

	@Override
	public List<InstituteDto> findByLocationAndRating(String location, int rating) {
		for(InstituteDto data:list) {
	System.out.println("finding data based on location and rating");
	if(data.getLocation().equals(location)) {
		System.out.println("the data based on location and rating is matched");
		System.out.println(data);
	
}
}

		return list;
	}
	
			}
	
	
	


