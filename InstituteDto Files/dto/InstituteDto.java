package com.xworkz.institue.dto;

public class InstituteDto {
	
	private String name;
	private String course;
	private int noOffStudents;
	private int noOfStaffs;
	private String location;
	private int stars;
	
	InstituteDto(){
		System.out.println("default constructor");

	
	
}

	public InstituteDto(String name, String course, int noOffStudents, int noOfStaffs, String location, int stars) {
		super();
		this.name = name;
		this.course = course;
		this.noOffStudents = noOffStudents;
		this.noOfStaffs = noOfStaffs;
		this.location = location;
		this.stars = stars;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getNoOffStudents() {
		return noOffStudents;
	}

	public void setNoOffStudents(int noOffStudents) {
		this.noOffStudents = noOffStudents;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	@Override
	public String toString() {
		return "InstituteDto [name=" + name + ", course=" + course + ", noOffStudents=" + noOffStudents
				+ ", noOfStaffs=" + noOfStaffs + ", location=" + location + ", stars=" + stars + "]";
	}
}
