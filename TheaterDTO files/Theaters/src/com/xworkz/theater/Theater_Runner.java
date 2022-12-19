package com.xworkz.theater;


import java.util.ArrayList;
import java.util.List;

import com.xworkz.theater_service.TheaterService;
import com.xworkz.theater_service.Theater_Service_impl;
import com.xworkz.theaterdto.TheaterDto;

public class Theater_Runner {

	public static void main(String[] args) {



Theater_Service_impl services=new Theater_Service_impl();

TheaterDto dto=new TheaterDto();

dto.setName("Urvashi");
dto.setLift(false);
dto.setLocation("sudhama Nagar");
dto.setNoOfEntrance(4);
dto.setNoOfExits(4);
dto.setNoOfFloors(3);
dto.setNoOfSeats(450);
dto.setPraking(true);
dto.setNoOfShows(3);
dto.setScreen("56*28 feet");

TheaterDto dto1=new TheaterDto();
dto1.setName("lakshmi");
dto1.setLift(true);
dto1.setLocation("mysore road");
dto1.setNoOfEntrance(2);
dto1.setNoOfExits(2);
dto1.setNoOfFloors(3);
dto1.setNoOfSeats(500);
dto1.setPraking(true);
dto1.setNoOfShows(3);
dto1.setScreen("60*30 feet");

TheaterDto dto2=new TheaterDto();
dto2.setName("savitri");
dto2.setLift(true);
dto2.setLocation("kanakpra road");
dto2.setNoOfEntrance(2);
dto2.setNoOfExits(2);
dto2.setNoOfFloors(3);
dto2.setNoOfSeats(550);
dto2.setPraking(true);
dto2.setNoOfShows(3);
dto2.setScreen("56*32 feet");

TheaterDto dto3=new TheaterDto();
dto3.setName("pooja");
dto3.setLift(true);
dto3.setLocation("RR nagar");
dto3.setNoOfEntrance(3);
dto3.setNoOfExits(2);
dto3.setNoOfFloors(2);
dto3.setNoOfSeats(560);
dto3.setPraking(true);
dto3.setNoOfShows(3);
dto3.setScreen("62*24 feet");

TheaterDto dto4=new TheaterDto();
dto4.setName("inox lido");
dto4.setLift(true);
dto4.setLocation("old madras road,ulsur");
dto4.setNoOfEntrance(3);
dto4.setNoOfExits(3);
dto4.setNoOfFloors(2);
dto4.setNoOfSeats(750);
dto4.setPraking(true);
dto4.setNoOfShows(3);
dto4.setScreen("58*24 feet");

TheaterDto dto5 =new TheaterDto("Rajeswahri", "murgeshpalya", 660, 2, true, 4, 3, false, 4, "52*30 feet");
TheaterDto dto6 =new TheaterDto("Gopalan Cinemas", "nagavarapalya", 780, 2, true, 4, 4, false, 4, "59*30 feet");
TheaterDto dto7 =new TheaterDto("swagath poornima", "udhamanagar", 540, 3, true, 2, 4, false, 3, "51*27 feet");
TheaterDto dto8 =new TheaterDto("PVR Oriaon mall", "Dr.Rajkumar road", 580,1, true, 2, 2, false, 5, "63*34 feet");
TheaterDto dto9 =new TheaterDto("Balaji", "Tavreker", 430, 2, true, 2, 3, false, 4, "59*30 feet");
TheaterDto dto10 =new TheaterDto("PVR THE CINEMA GT World", "GT World", 500, 2, true, 3, 4, false, 3, "60*24 feet");
TheaterDto dto11 =new TheaterDto("lavanya", "St.Jhons road", 380, 3, true, 1, 3, false, 2, "56*30 feet");
TheaterDto dto12=new TheaterDto("PVR MSR ELements mall ", "Thanisandra", 800, 2, true, 2, 2, false, 3, "64*32 feet");
TheaterDto dto13 =new TheaterDto("Sandhya Digital 4k", "old madivala", 350, 2, true, 2, 2, false, 3, "49*22 feet");
TheaterDto dto14 =new TheaterDto("Cauvery", "sankey road", 460, 2, true, 4, 4, false, 4, "58*29 feet");
	
services.save(dto);
services.save(dto1);
services.save(dto2);
services.save(dto3);
services.save(dto4);
services.save(dto5);	
services.save(dto6);
services.save(dto7);
services.save(dto8);
services.save(dto9);
services.save(dto10);
services.save(dto11);
services.save(dto12);
services.save(dto13);
services.save(dto14);

List<TheaterDto> list=new ArrayList<TheaterDto>();
list.add(dto);
list.add(dto1);
list.add(dto2);
list.add(dto3);	
list.add(dto4);
list.add(dto5);
list.add(dto6);
list.add(dto7);
list.add(dto8);
list.add(dto9);
list.add(dto10);
list.add(dto11);
list.add(dto12);
list.add(dto13);
System.out.println(list.add(dto14));
	
	
TheaterDto theatreList=services.read(dto12);
System.out.println(theatreList);
			
	}
	
	
}
