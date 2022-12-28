package com.xworkz.gamesrepo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.gamesdto.GamesDto;
import com.xworkz.gamesservice.GamesService;

public class GamesRepoImpl implements  GamesRepo{

	List<GamesDto> database=new ArrayList<GamesDto>();

	@Override
	public boolean save(GamesDto dto) {
		System.out.println("Games data is in repository for saving in database");
		database.add(dto);
		System.out.println("Games data has been added to database");
		return true;
	}

	@Override
	public List<GamesDto> read() {
		System.out.println("reading data from database");
		return database;
	}

	@Override
	public List<GamesDto> findByName(String name) {
		if(name!=null && name.length()>=3) {
			for(GamesDto ls:database) {
				if(ls.getGameName().equals(name)){
					System.out.println("data is found from database");
					System.out.println(ls);
					return database;
				}
				
			}
		}
		return null;
	}

	@Override
	public GamesDto updateNameByIndex(String name, int index) {
		GamesDto d1=database.get(index);
		System.out.println("data has been fetched from database");
		d1.setGameName(name);
		if(d1.getGameName().equals(name)) {
			System.out.println(d1);
		}
		return null;
	}

	@Override
	public boolean deleteByIndex(int index) {
		System.out.println("deleting the data from database");
		database.remove(index);
		return false;
	}

	@Override
	public GamesDto updatePlayersByName(String name, int players) {
		for (int i = 0; i < database.size(); i++) {
			GamesDto db=database.get(i);
			System.out.println("database has been fetched from database");
			if(db.getGameName().equals(name)) {
			db.setNoOfPlayers(players);
			System.out.println("updated players in database");
				System.out.println("name is matching and found in database");
				database.set(i, db);
							}
			
		}
		return null;
	}

	@Override
	public boolean deletetotalTimeByName(int time, String name) {
	Iterator<GamesDto> itr =database.iterator();
	
	while(itr.hasNext()) {
		 GamesDto del=itr.next();
		 if(del.getGameName().equals(name)) {
			 database.remove(del);
			 System.out.println("data has been deleted from the database");
		 }
	}
		return true;
	}

}
