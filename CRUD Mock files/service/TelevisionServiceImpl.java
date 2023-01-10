<<<<<<< HEAD
 package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.repository.TelevisionRepo;
import com.xworkz.television.repository.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {

	TelevisionRepo repo=new TelevisionRepoImpl();
	
	@Override
	public TelevisionDto save(TelevisionDto dto) {
if(dto.getModelName()!=null && dto.getModelName().length()>=3 && dto.getPrice()>=20000.00 && dto.getSizeInInches()>=40) {
	System.out.println("Fileds are validated and sending the data to repo for saving menthod");
	
}
return repo.save(dto);
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("sending to repo for read opeartion");
		return repo.read();
	}

	@Override
	public List<TelevisionDto> findByNameAndSize(String name, int size) {
		if(name!=null && name.length()>=3 && size>=40) {
			System.out.println("data is validated for finding method");
			return repo.findByNameAndSize(name,size);
		}
		return null;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		if(type!=null && type.length()>=2 && size>=40) {
			System.out.println("Validated");
			return repo. updateSizeByType(size,type);
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndColor(String name, String color) {
if(name!=null && name.length()>=3 && color!=null && color.length()>=3) {
	System.out.println("validated for delete operation");
	return repo.deleteByNameAndColor(name,color);
	
}
		return false;
	}

	@Override
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index) {
	if(index>=0 && type!=null && color!=null && type.length()>=3 && color.length()>=3) {
		System.out.println("finding  data by index");
		return repo.findTypeAndColorByIndex(type,color,index);
	}
		return null;
	}

	
	
}
=======
 package com.xworkz.television.service;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.repository.TelevisionRepo;
import com.xworkz.television.repository.TelevisionRepoImpl;

public class TelevisionServiceImpl implements TelevisionService {

	TelevisionRepo repo=new TelevisionRepoImpl();
	
	@Override
	public TelevisionDto save(TelevisionDto dto) {
if(dto.getModelName()!=null && dto.getModelName().length()>=3 && dto.getPrice()>=20000.00 && dto.getSizeInInches()>=40) {
	System.out.println("Fileds are validated and sending the data to repo for saving menthod");
	
}
return repo.save(dto);
	}

	@Override
	public List<TelevisionDto> read() {
		System.out.println("sending to repo for read opeartion");
		return repo.read();
	}

	@Override
	public List<TelevisionDto> findByNameAndSize(String name, int size) {
		if(name!=null && name.length()>=3 && size>=40) {
			System.out.println("data is validated for finding method");
			return repo.findByNameAndSize(name,size);
		}
		return null;
	}

	@Override
	public boolean updateSizeByType(int size, String type) {
		if(type!=null && type.length()>=2 && size>=40) {
			System.out.println("Validated");
			return repo. updateSizeByType(size,type);
		}
		return false;
	}

	@Override
	public boolean deleteByNameAndColor(String name, String color) {
if(name!=null && name.length()>=3 && color!=null && color.length()>=3) {
	System.out.println("validated for delete operation");
	return repo.deleteByNameAndColor(name,color);
	
}
		return false;
	}

	@Override
	public TelevisionDto findTypeAndColorByIndex(String type,String color,int index) {
	if(index>=0 && type!=null && color!=null && type.length()>=3 && color.length()>=3) {
		System.out.println("finding  data by index");
		return repo.findTypeAndColorByIndex(type,color,index);
	}
		return null;
	}

	
	
}
>>>>>>> e2424ffadd2223dd193b3585addd8a357f51bf23
