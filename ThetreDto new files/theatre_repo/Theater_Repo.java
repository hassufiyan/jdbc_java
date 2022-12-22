package theatre_repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theaterdto.TheaterDto;

public interface Theater_Repo {
	
	public boolean save(TheaterDto theaterdto);
	
	public List<TheaterDto> read();
	
 public TheaterDto findByName(String name);
	}


