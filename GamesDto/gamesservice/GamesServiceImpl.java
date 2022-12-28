package com.xworkz.gamesservice;

import java.util.List;

import com.xworkz.gamesdto.GamesDto;
import com.xworkz.gamesrepo.GamesRepo;
import com.xworkz.gamesrepo.GamesRepoImpl;



public class GamesServiceImpl implements GamesService {

	GamesRepo repo=new GamesRepoImpl();
	
	@Override
	public boolean save(GamesDto dto) {
		System.out.println("data is in service and sending to repo for saving in database");
		boolean s1=repo.save(dto);
		return true;
	}

	@Override
	public List<GamesDto> read() {
System.out.println("Games data is in service");
		return repo.read();
	}

	@Override
	public List<GamesDto> findByName(String name) {
		System.out.println("data to be found is in service");
		return	repo.findByName(name);
		 
	}

	@Override
	public GamesDto updateNameByIndex(String name, int index) {
		if(name!=null && name.length()>=3 && index>=0) {	
		System.out.println("Game data is in service and sending to repository for updation proccess");
		}
		return	repo. updateNameByIndex(name,index);
		
	}

	@Override
	public boolean deleteByIndex(int index) {
			if(index>=0) {
				System.out.println("data is in service for deletion process");
				boolean delI=repo.deleteByIndex(index);
			}
			
		return false;
	}

	@Override
	public boolean updatePlayersByName(String name, int players) {
		if(name!=null && name.length()>=3 && players>=1) {
			System.out.println("data must be updated in repository");
			GamesDto update=repo.updatePlayersByName(name,players);
		}
		return true;
	}

	@Override
	public boolean deletetotalTimeByName(int time, String name) {
if(time>=3 && name!=null && name.length()>=3) {
	System.out.println("sending the data to repo for deleting toime by name data");
	boolean dt=repo.deletetotalTimeByName(time,name);
}
		return false;
	}
	
	

}
