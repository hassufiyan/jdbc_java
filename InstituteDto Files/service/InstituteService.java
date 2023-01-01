package com.xworkz.institue.service;

import java.util.List;

import com.xworkz.institue.dto.InstituteDto;

public interface InstituteService {
	
	public InstituteDto save(InstituteDto dto);
	
	public List<InstituteDto> read();
	
	public InstituteDto updateLocationByIndex(String location,int index);
	
	public InstituteDto updateCourseByName(String course,String name);
	
	public boolean deleteByRating(int rating);
	
	public List<InstituteDto> findByNameAndCourse(String name,String course);
	
	public List<InstituteDto> findByLocationAndRating(String location,int rating);
	

}
