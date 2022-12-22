package theatre_repo;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.theaterdto.TheaterDto;

public class Theater_Rep_Impl implements Theater_Repo {

	ArrayList<TheaterDto> list=new ArrayList<TheaterDto>();
	public boolean save(TheaterDto theaterdto) {
		System.out.println("DTO is recived from service and storing in database");
		list.add(theaterdto);
		return true;
	}

	@Override
	public List<TheaterDto> read() {

		return list;
		
	}

	@Override
	public TheaterDto findByName(String name) {
	
	 //for(TheaterDto dt:list)
	 //{
	// if(dt.getName().equals(name)) {
		//	 System.out.println("the details of entered theater is..");
			// System.out.println(dt);
		// }
		
		 
		return null;
	 }
		
}
	
	
	
	
	


