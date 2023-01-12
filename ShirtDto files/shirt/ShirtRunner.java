package com.xworkz.shirt;

import java.util.List;

import com.xworkz.shirt.dto.ShirtDto;
import com.xworkz.shirt.repository.ShirtRepo;
import com.xworkz.shirt.repository.ShirtRepoImpl;

public class ShirtRunner {

	public static void main(String[] args) {

		ShirtRepo repo=new ShirtRepoImpl();
		
ShirtDto fly=new ShirtDto(1, 1500.90, "FLying Machine", "Blue", 44, false);
ShirtDto peter=new ShirtDto(2, 2500.00, "Peter England", "White Chex", 48, true);
ShirtDto van=new ShirtDto(3, 3000.00, "Van Heusen", "Black", 60, true);		
ShirtDto suprDry=new ShirtDto(4, 2400.89, "SuperDry", "Green", 42, false);		
ShirtDto polo=new ShirtDto(5, 4000.50, "US POLO", "Yellow", 40,false);		
		
	//	repo.save(fly);
//		repo.save(peter);
//		repo.save(van);
//		repo.save(suprDry);
//		repo.save(polo);

//System.out.println(repo.findByName("SuperDry"));

//repo.updatePriceByName(3200.00,"Peter England");

//repo.deleteByColor("Yellow");
repo.deleteSizeByName(42,"SuperDry");


List<ShirtDto> data=repo.readAll();		
for(ShirtDto d1:data) {
	System.out.println(d1);
}



	}

}
