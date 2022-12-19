package com.xworkz.theater;

import java.util.ArrayList;

import com.xworkz.theaterdto.TheaterDto;

public class Theater_Rep_Impl implements Theater_Repo {

	ArrayList<TheaterDto> list=new ArrayList<TheaterDto>();
	public boolean save(TheaterDto theaterdto) {
		System.out.println(list);
		return true;
	}
	@Override
	public boolean read(TheaterDto theaterdto) {
		System.out.println(list);
		return true;
	}
	

}
