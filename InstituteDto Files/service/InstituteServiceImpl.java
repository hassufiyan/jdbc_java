package com.xworkz.institue.service;

import java.util.List;

import com.xworkz.institue.dto.InstituteDto;
import com.xworkz.institue.repository.InstituteRepo;
import com.xworkz.institue.repository.InstituteRepoImpl;

public class InstituteServiceImpl implements InstituteService {

	InstituteRepo repo=new InstituteRepoImpl();
	
	@Override
	public InstituteDto save(InstituteDto dto) {
		if(dto!=null && dto.getName().length()>=3) {
			System.out.println("dto is validated and it is not null...");
			
		}
	return	repo.save(dto);
	}

	@Override
	public List<InstituteDto> read() {
System.out.println("Data is in service and sending to repo for ead operation");
return  repo.read();
		
	}

	@Override
	public InstituteDto updateLocationByIndex(String location, int index) {
		if(location!=null && location.length()>=3 && index>=0) {
			System.out.println("location is validated and sending to repository for updation");
			
		}
		return repo.updateLocationByIndex(location,index);
	}

	@Override
	public InstituteDto updateCourseByName(String course, String name) {
		if(course!=null && course.length()>=3 && name!=null && name.length()>=3) {
			System.out.println("validated");
			
		}
		return repo.updateCourseByName(course,name);
	}

	@Override
	public boolean deleteByRating(int rating) {
if(rating>=2) {
	System.out.println("validated");
	repo.deleteByRating(rating);
}
		return true;
	}

	@Override
	public List<InstituteDto> findByNameAndCourse(String name, String course) {
if(name!=null && name.length()>=3 && course!=null && name.length()>=3) {
	System.out.println("sending to repo for finding name and course");

}
return repo.findByNameAndCourse(name,course);
		
	}

	@Override
	public List<InstituteDto> findByLocationAndRating(String location, int rating) {
		if(location!=null && location.length()>=3 && rating>=3) {
			System.out.println("finding by location and rating");
		}
		
	return repo.findByLocationAndRating(location,rating);
}
}
