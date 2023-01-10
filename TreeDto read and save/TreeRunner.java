package com.xworkz.tree;

import com.xworkz.tree.dto.TreeDto;
import com.xworkz.tree.repo.TreeRepo;
import com.xworkz.tree.repo.TreeRepoImpl;

public class TreeRunner {

	public static void main(String[] args) {
		
		TreeRepo repo=new TreeRepoImpl();
		
		TreeDto mango= new TreeDto(1, "Mango", "Anacardiaceae", 300, "Mangifera Indica");
		TreeDto neem= new TreeDto(2, "Neem", "Meliaceae", 170, "Azadirachta");
		TreeDto banyan= new TreeDto(3, "Banyan", "Banyan", 200, "Ficus benghalensis");
		TreeDto peepal= new TreeDto(4, "peepal", "Bodhi tree", 180, "ficus religiosa");

		
//		repo.save(mango);
//		repo.save(neem);
//		repo.save(banyan);
//		repo.save(peepal);
		
		repo.read();
	}

}
