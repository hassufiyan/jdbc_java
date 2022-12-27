package com.xworkz.mobileservice;

import java.util.List;

import com.xworkz.mobiledto.MobileDto;
import com.xworkz.mobilerepository.MobileRepo;
import com.xworkz.mobilerepository.MobileRepoImpl;

public class MobileServiceImpl implements MobileService {

	MobileRepo repo= new MobileRepoImpl();
	
	@Override
	public boolean save(MobileDto dto) {
		if(dto!=null && dto.getModleName().length()>=3 && dto.getPrice()>=10000 && dto.getRamInGb()>=3 && dto.getStorageInGb()>=64) {
			System.out.println("Dto is in Service and sending to repo for savng in database..");
			repo.save(dto);
		}
		return true;
	}

	@Override
	public List<MobileDto> read(String password) {
		if(password!=null && password.equals("Creation@123")) {
			System.out.println("password is valid & Dto is in service for read opearation");
			return repo.read(password);
		}else {
			System.out.println("Enter the valid pasword");
		}
		return null;
	}

	@Override
	public MobileDto findByName(String name) {
		System.out.println("dto");
		List<MobileDto> mobileList=repo.read(name);
		for(MobileDto  mobDto:mobileList) {
			if(mobDto.getModleName().equals(name) && mobDto.getModleName().length()>=3) {
				System.out.println("The data is in service and being forwarded to repository for further process..");
				System.out.println(mobDto);
			}
		}
		
		return null;
	}

	@Override
	public MobileDto updateNameByIndex(String name, int index) {
		if(name!=null && name.length()>=3 && index>=0) {
			System.out.println("Data is in service and sending to repository for updation..");
			repo.updateNameByIndex(name,index);							
			
			
		}
		return null;
	}

	@Override
	public boolean deleteByIndex(int index) {
		if(index>=0) {
			System.out.println("Data is in service and sending to repository to delete the dto");
			repo.deleteByIndex(index);
		}
		return true;
	}

	
	
	
	

}
