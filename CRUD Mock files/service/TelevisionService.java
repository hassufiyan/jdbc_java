<<<<<<< HEAD
package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionService {
	
	
	public TelevisionDto save(TelevisionDto dto);
	
	public List<TelevisionDto> read();

	
	public List<TelevisionDto> findByNameAndSize(String name,int size);
	
	public boolean updateSizeByType(int size,String type);
	
	public boolean deleteByNameAndColor(String name,String color);
	
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index);
}
=======
package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionService {
	
	
	public TelevisionDto save(TelevisionDto dto);
	
	public List<TelevisionDto> read();

	
	public List<TelevisionDto> findByNameAndSize(String name,int size);
	
	public boolean updateSizeByType(int size,String type);
	
	public boolean deleteByNameAndColor(String name,String color);
	
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index);
}
>>>>>>> e2424ffadd2223dd193b3585addd8a357f51bf23
