package com.xworkz.soaps;

import java.util.List;

import com.xworkz.soaps.dto.SoapsDto;
import com.xworkz.soaps.rrpository.SoapsRepo;
import com.xworkz.soaps.rrpository.SoapsRepoImpl;

public class SoapsRunner {
	public static void main(String[] args) {
		
		SoapsRepo repo=new SoapsRepoImpl();
		
		SoapsDto lux=new SoapsDto(1, "Lux",15.13, "pink", "Rosy", 120.30, 2023, "Bathing soap");
		SoapsDto dove=new SoapsDto(2, "Dove",20.00, "white", "lily", 134.00, 2023, "Bathing soap");
		SoapsDto rin=new SoapsDto(3, "Rin",12.15, "green", "multi fragrance", 160.00, 2023, "cloth washing soap");
		SoapsDto vim=new SoapsDto(4, "Vim Bar",18.00, "yellow", "lemon", 180.00, 2023, "Utensil cleaner soap");
		SoapsDto dettol=new SoapsDto(5, "Dettol",27.00, "orange", "Pine", 75.00, 2023, "Bathing soap");
		SoapsDto medimix=new SoapsDto(6, "Medimix",10.00, "green", "neem", 125.00, 2023, "Bathing soap");
		SoapsDto savlon=new SoapsDto(7, "Savlon",19.00, "Blue", "Sandal", 125.00, 2023, "Bathing soap");
		SoapsDto mamaEarth=new SoapsDto(8, "Mama Earth",35.00, "Purple", "Jasmine", 182.00, 2023, "Face Wash soap");
		SoapsDto fiama=new SoapsDto(9, "Fiama",40.00, "Sky Blue", "Floral", 100.00, 2023, "Bathing soap");
		SoapsDto biotique=new SoapsDto(10, "Biotique",30.00, "Whitish pink", "orange", 134.00, 2023, "Bathing soap");
		
//		repo.save(lux);
//		repo.save(dove);
//		repo.save(rin);
//		repo.save(vim);
//		repo.save(dettol);
//		repo.save(medimix);
//		repo.save(savlon);
//		repo.save(mamaEarth);
//		repo.save(fiama);
//		repo.save(biotique);
		
		
	//	System.out.println(repo.findByNameAndPrice("Fiama", 40.00));
//		repo.updateNameByPrice("he", 30.00);
//		repo.updateNameByPrice("she", 40.00);
		
	//	repo.updateColorAndFragranceByName("Dark Blue","Lavender", "Mama Earth");
		
		repo.updateTypeByid("Body Wash Soap", 7);
		List<SoapsDto> data=repo.read();
		for(SoapsDto d:data) {
			System.out.println(d);
		}
		
		
		
		
		
		
		
		
		
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

