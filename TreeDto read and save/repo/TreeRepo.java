package com.xworkz.tree.repo;

import com.xworkz.tree.dto.TreeDto;

public interface TreeRepo {
	
	
	public TreeDto save(TreeDto dto);
	
	public TreeDto read();

}
