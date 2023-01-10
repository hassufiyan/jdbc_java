package com.xworkz.bags.repository;

import com.xworkz.bags.dto.BagsDto;

public interface BagsRepo {
	
public BagsDto save(BagsDto dto);

public BagsDto findByName(String name);

public BagsDto findbyNameId(String name,int id);

}
