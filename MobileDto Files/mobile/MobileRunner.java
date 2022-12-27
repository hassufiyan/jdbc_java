package com.xworkz.mobile;



import java.util.ArrayList;
import java.util.List;

import com.xworkz.mobiledto.MobileDto;
import com.xworkz.mobileservice.MobileService;
import com.xworkz.mobileservice.MobileServiceImpl;

public class MobileRunner {
	
	
	
	
	public static void main(String[] args) {
		MobileService service=new  MobileServiceImpl();
		
		MobileDto apple=new MobileDto("Apple", 65000, false, 256, 4);
		MobileDto oppo=new MobileDto("Oppo f12", 39467, true, 128,6 );
		MobileDto onePlus=new MobileDto("One plus 9 pro", 55000, true, 256,8 );
		
		MobileDto vivo=new MobileDto();
		vivo.setModleName("vivo y17");
		vivo.setPrice(17000);
		vivo.setDualSim(true);
		vivo.setStorageInGb(128);
		vivo.setRamInGb(4);
		
		
		MobileDto samsung=new MobileDto();
		samsung.setModleName("Samsung");
		samsung.setPrice(23456);
		samsung.setDualSim(true);
		samsung.setStorageInGb(128);
		samsung.setRamInGb(6);
		
		
		service.save(apple);
		service.save(samsung);
		service.save(vivo);
		service.save(onePlus);
		service.save(oppo);

		

		service.findByName("Oppo f12");
		
	service.updateNameByIndex("one Plus 10 r", 3);
	
		service.deleteByIndex(1);
		List<MobileDto>	mobileList=service.read("Creation@123");
		for(MobileDto mobileDto1:mobileList) {
			System.out.println( mobileDto1);
		
		}
	}
	}




