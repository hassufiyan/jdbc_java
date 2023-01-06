package com.xworkz.television.repository;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;

public interface TelevisionRepo {

	public TelevisionDto save(TelevisionDto dto);

	public List<TelevisionDto> read();

	public List<TelevisionDto> findByNameAndSize(String name, int size);

	public boolean updateSizeByType(int size, String type);

	public boolean deleteByNameAndColor(String name, String color);

	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index);

}
