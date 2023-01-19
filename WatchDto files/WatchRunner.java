package com.xworkz.watch;

import java.util.List;

import com.xworkz.watch.dto.WatchDto;
import com.xworkz.watch.service.WatchService;
import com.xworkz.watch.service.WatchServiceImpl;

public class WatchRunner {
	
	public static void main(String[] args) {
		
		WatchService service= new  WatchServiceImpl();
		
		
		WatchDto dto0=new WatchDto(4, "Tissot PRX watch", "Grey","Digital Chain", 6300);
		WatchDto dto1=new WatchDto(5, "Swatch 1907 Bau watch", "Black","ANalogue Chain", 7800);
		WatchDto dto2=new WatchDto(6, "Casio G-Shock DW6900 watch", "Black","Cronography Belt", 9200);
		WatchDto dto3=new WatchDto(7, "Seiko SZSB018 watch", "Black","Analogue Belt", 7652);
		WatchDto dto4=new WatchDto(8, "Orient Sports Diver's watch", "Blue","Smart Digital", 9870);
		
//		service.save(dto);
//		service.save(dto1);
//		service.save(dto2);
//		service.save(dto3);
//		service.save(dto4);
		
	//	System.out.println(service.findByNameAndColor("Orient Sports Diver's watch","Blue" ));
//		System.out.println(service.findByidAndType(8, "Smart Digital"));
//		System.out.println(service.findByidAndType(2, "Analogue Belt"));
		
	//service.updateNameById("Titan orient black",4);	
		
		//service.deleteBycolorandtype("Blue", "Smart Digital");
		
	List<WatchDto>	list=service.saveAll(dto);
	for(WatchDto data:list) {
		System.out.println(data);
	}
		
		
//	List<WatchDto>	data=service.readAll();
//		for(WatchDto d1:data) {
//			System.out.println(d1);
//		}
	}
	}


