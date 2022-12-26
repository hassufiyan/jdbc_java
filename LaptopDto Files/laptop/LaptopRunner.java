package com.xworkz.laptop;



import java.util.ArrayList;
import java.util.List;

import com.xworkz.laptop_service.LaptopService;
import com.xworkz.laptop_service.LaptopServiceImpl;
import com.xworkz.laptopdto.LaptopDto;






public class LaptopRunner {
	public static void main(String[] args) {
		
		LaptopService service=new LaptopServiceImpl();
	
	LaptopDto  zen=new LaptopDto();
	zen.setBrandName("Asus");
	zen.setModelName("Asus zen notebook");
	zen.setDisplayInInches(16);
	zen.setGeneration("3rd");
	zen.setScreentouch(false);
	zen.setPrice(72456);
	zen.setProccessor("intel core i3");
	zen.setOperatingSystem("microsoft windows");
	zen.setRamInGb(8);
	zen.setGraphic("Radeon");
	
	
	LaptopDto elite=new LaptopDto();
	elite.setBrandName("HP");
	elite.setModelName("HP elite Notebook");
	elite.setDisplayInInches(15);
	elite.setGeneration("5th gen");
	elite.setScreentouch(false);
	elite.setPrice(59788);
	elite.setProccessor("celeron i5");
	elite.setOperatingSystem("microsoft windows");
	elite.setRamInGb(8);
	elite.setGraphic("Radeon");
	
	
LaptopDto toshiba=new LaptopDto("Toshiba", "toshiba tera c", 34786, "microsoft windows 10", "3rd gen", 8, 16, false,"celron i3" , "Radeon");
LaptopDto dell=new LaptopDto("dell", "dell thinkpad", 23754, "microsoft windows 8", "3rd gen", 8, 15, false,"intel Atom i3" , "Radeon");
LaptopDto apple=new LaptopDto("Apple", "Apple mac book", 1075432, "macOs", "Apple lisa", 12, 14, true,"Apple m1" , " GeForce GT120 512MB");
LaptopDto lenovo=new LaptopDto("Lenovo", "lenovo ideapad gaming", 55654, "microsoft windows 10", "12th gen", 8, 16, false,"intel core i5" , "NVIDIA");
LaptopDto acer=new LaptopDto("acer", "acer Aspire 7", 54990, "microsoft windows 11", "5th gen", 8, 15, false,"celron" , "Reyzen");
LaptopDto samsung=new LaptopDto("Samsung", "samsung galaxy book2", 35990, "microsoft windows 11", "11th gen", 8, 16, false,"intel core i5" , "iris xe");
LaptopDto msi=new LaptopDto("MSI", "MSI Thin GF63", 46387, "microsoft windows 10", "i7", 8, 16, false,"Octa Core" , "Nvidia");
LaptopDto xiaomi=new LaptopDto("Xiaomi", "Xiaomi Rdmi book pro 15", 42517, "microsoft windows 10", "i5", 8, 16, false,"Quad Core" , "intel iris xe");

	
	
	service.save(toshiba);
	service.save(dell);
	service.save(elite);
	service.save(msi);
	service.save(xiaomi);
	service.save(acer);
	service.save(lenovo);
	service.save(apple);
	service.save(samsung);
	service.save(zen);
	
	ArrayList<LaptopDto> database=new ArrayList<LaptopDto>();
	database.add(toshiba);
	database.add(acer);
	database.add(dell);
	database.add(xiaomi);
	database.add(lenovo);
	database.add(msi);
	database.add(apple);
	database.add(zen);
	database.add(elite);
	database.add(samsung);
	

	
	
	
	
	service.findByName("DEll");
	
	service.deleteByIndex(1);

	
	
	service.updateNameByIndex("RSi", 3);
	
	ArrayList<LaptopDto> laptopList= service.read("hi_there");
	for(LaptopDto dtoList:laptopList) {
		System.out.println(dtoList);
	
	}
	
	
	
	
	}
	
	
	
	
	
	
	

}
