package com.xworkz.gamesservice;

import java.util.List;

import com.xworkz.gamesdto.GamesDto;



public interface GamesService {

	public boolean save(GamesDto dto);
	
	public List<GamesDto> read();
	
	public List<GamesDto> findByName(String name);
	
	public GamesDto updateNameByIndex(String name,int index);
	
	public boolean deleteByIndex(int index);
	
	public boolean updatePlayersByName(String name,int players);
	
	public boolean deletetotalTimeByName(int time,String name );
	
	
	
	
}
