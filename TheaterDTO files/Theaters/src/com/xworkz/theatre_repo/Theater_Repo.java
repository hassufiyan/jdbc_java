package theatre_repo;

import java.util.ArrayList;

import com.xworkz.theaterdto.TheaterDto;

public interface Theater_Repo {
	
	public boolean save(TheaterDto theaterdto);
	
	public boolean read(TheaterDto theaterdto);
	
ArrayList<TheaterDto> findByName(); 
	}


