package com.xworkz.institue;

import java.util.List;

import com.xworkz.institue.dto.InstituteDto;
import com.xworkz.institue.service.InstituteService;
import com.xworkz.institue.service.InstituteServiceImpl;

public class InstitueRunner {
	public static void main(String[] args) {
		
	
	
	InstituteService service=new InstituteServiceImpl();
	
	InstituteDto xworkz=new InstituteDto("Xworkz","Java" ,500, 50, "RajajniNagar", 5);
	InstituteDto qSpiders=new InstituteDto("QSpiders","Automation Testing" ,5000, 200, "BTM", 4);
	InstituteDto kodnext=new InstituteDto("Kodnext","Python", 200, 30, "JP Nagar", 2);
	InstituteDto abc=new InstituteDto("ABC","Type Script" ,500, 50, "RajajniNagar", 5);
	InstituteDto codingMinds =new InstituteDto("Coding Minds","Clojure", 500, 50, "RajajniNagar", 5);
	
	service.save(xworkz);
	service.save(qSpiders);
	service.save(kodnext);
	service.save(abc);
	service.save(codingMinds);
	
	//service.updateLocationByIndex("BTM phase 2", 2);
	
	//service.updateCourseByName("Java full stack","Xworkz");
	
	//service.deleteByRating(2);
	
//service.findByNameAndCourse("ABC","Type Script");
	service.findByLocationAndRating("RajajniNagar", 5);
//	System.out.println(serv);
	
//	List<InstituteDto> read=service.read();
//	for(InstituteDto listData:read) {
//		System.out.println(listData);
//		
//		
		
	}
}
//}