package com.xworkz.mobileservice;

import java.util.List;

import com.xworkz.mobiledto.MobileDto;

public interface MobileService {

	public boolean save(MobileDto dto);
	
	public List<MobileDto> read(String password);
	
	public MobileDto findByName(String name);
	
	public MobileDto updateNameByIndex(String name,int index);
	
	public boolean deleteByIndex(int index);
	






}
