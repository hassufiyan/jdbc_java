package com.xworkz.tree.dto;

public class TreeDto {
	
	private int id;
	private String name;
	private String family;
	private int exsistance;
	private String scientificName;
	
	TreeDto(){
		System.out.println("Default constructor");
	}

	public TreeDto(int id, String name, String family, int exsistance, String scientificName) {
		super();
		this.id = id;
		this.name = name;
		this.family = family;
		this.exsistance = exsistance;
		this.scientificName = scientificName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public int getExsistance() {
		return exsistance;
	}

	public void setExsistance(int exsistance) {
		this.exsistance = exsistance;
	}

	public String getScientificName() {
		return scientificName;
	}

	public void setScientificName(String scientificName) {
		this.scientificName = scientificName;
	}

	@Override
	public String toString() {
		return "TreeDto [id=" + id + ", name=" + name + ", family=" + family + ", exsistance=" + exsistance
				+ ", scientificName=" + scientificName + "]";
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
