package com.xworkz.cars;

import java.util.List;

import com.xworkz.cars.dto.CarsDto;
import com.xworkz.cars.service.CarsService;
import com.xworkz.cars.service.CarsServiceImpl;

public class CarsRunner {

	public static void main(String[] args) {
				
		CarsService service=new CarsServiceImpl();
		
		
		CarsDto baleno=new CarsDto("Baleno", 785290.23, "Blue", "HatchBack", 140);
		CarsDto xuv=new CarsDto("XUV500", 1897654.780, "White", "XUV", 200);
		CarsDto innova=new CarsDto("Innova Hybrid Cross", 2548965.235, "Grey", "MPV", 240);
		CarsDto seltos=new CarsDto("Kia Seltos", 15243897.45, "Red", "SUV", 190);
		CarsDto dzire=new CarsDto("Swift Dezire", 564786.345, "Grey", "Sedan", 160);
		CarsDto scorpio=new CarsDto("Scorpio-N", 567823.453, "White", "Suv", 200);
		
		
		service.save(seltos);
		service.save(xuv);
		service.save(innova);
		service.save(dzire);
		service.save(scorpio);
		service.save(baleno);
	
		
//service.findByName("XUV500");

service.updateColorByIndex("Maroon", 1);

service.updateSpeedByBrand(220, "Kia Seltos");

service.updatePricedByType(2734598, "MPV");

//service.deleteByIndex(3);

service.deleteBrandByColor("Blue", "Baleno");

List<CarsDto> serv=service.read();
for(CarsDto l1:serv) {
System.out.println(l1);
}

		
		
		
		

	}

}
