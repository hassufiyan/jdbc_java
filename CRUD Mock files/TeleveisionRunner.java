package com.xworkz.television;

import java.util.List;

import com.xworkz.television.dto.TelevisionDto;
import com.xworkz.television.service.TelevisionService;
import com.xworkz.television.service.TelevisionServiceImpl;

public class TeleveisionRunner {

	public static void main(String[] args) {

		TelevisionService service=new TelevisionServiceImpl();
		
		
		TelevisionDto lg=new TelevisionDto("LG",52.345, "Black", "Ultra 4k LED", 49);
		TelevisionDto samsung=new TelevisionDto("Samsung",62.245, "Black", "LED", 65);
		TelevisionDto onePlus=new TelevisionDto("OnePlus",72.235, "Blue", "LED 4K smart TV", 67);
		TelevisionDto onida=new TelevisionDto("onida",23.456, "Black", "Doom", 25);
		TelevisionDto croma=new TelevisionDto("Croma",64.745, "Black", "LED", 72);
		
		
		
		service.save(croma);
		service.save(samsung);
		service.save(onePlus);
		service.save(onida);
		service.save(lg);

		
//	service.findByNameAndSize("samsung", 65);
//	service.findByNameAndSize("croma", 72);
		
	//service.updateSizeByType(81, "LED 4K smart TV");
		
	service.findTypeAndColorByIndex("Doom","Balck", 3);
//		service.deleteByNameAndColor("Croma", "Black");
		
		List<TelevisionDto> r1=service.read();
for(TelevisionDto read1:r1) {
	System.out.println(read1);




}
	}

}
