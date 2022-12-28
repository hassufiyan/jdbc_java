package com.xworkz.games;

import java.util.List;

import com.xworkz.gamesdto.GamesDto;
import com.xworkz.gamesservice.GamesService;
import com.xworkz.gamesservice.GamesServiceImpl;

public class GamesRunner {
	public static void main(String[] args) {
		
	
	
	GamesService service=new GamesServiceImpl();
	
	GamesDto cricket=new GamesDto("Cricket", 15,6, false, "Sachin Tendulkar", "Wankhade stadium in Mumbai");
	GamesDto footBall=new GamesDto("FootBall", 11,3 , false, "Lionel Messi", "Education City in Qatar");
	GamesDto tennis=new GamesDto("Tennis", 2, 3, true, "Roger Federer", "Arthur Ashe stadium in New York");
	GamesDto chess=new GamesDto("Chess", 11, 6, false, "GM Magnus Carisen", "KSCA Stadium in Banglore");
	GamesDto golf=new GamesDto("Golf", 2, 2, false, "Tiger Woods", "Sydney Golf Club in Australia");
	
	
	service.save(footBall);
	service.save(cricket);
	service.save(tennis);
	service.save(chess);
	service.save(golf);
	
	
	service.findByName("FootBall");

service.updateNameByIndex("Crcik", 1);
	service.updateNameByIndex("soccer", 0);
	
	service.deleteByIndex(3);
	
	service.updatePlayersByName("Golf",3);
	
	service.deletetotalTimeByName(3, "Tennis");

	List<GamesDto> listDto=service.read();
	for( GamesDto data:listDto) {
		System.out.println(data);
	}
	
	
	}
}
