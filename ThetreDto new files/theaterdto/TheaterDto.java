package com.xworkz.theaterdto;

public class TheaterDto {
	private String name;
	private String location;
	private int noOfSeats;
	private int noOfFloors;
	private boolean praking;	
	private int noOfEntrance;
	private int noOfExits;
	private boolean lift;
	private int noOfShows;
	private String screen;
	
	public TheaterDto(){
		System.out.println("iam a default construtor");
		
	}
	
	public TheaterDto(String name, String location, int noOfSeats, int noOfFloors, boolean praking, int noOfEntrance,
			int noOfExits, boolean lift, int noOfShows, String screen) {
		super();
		this.name = name;
		this.location = location;
		this.noOfSeats = noOfSeats;
		this.noOfFloors = noOfFloors;
		this.praking = praking;
		this.noOfEntrance = noOfEntrance;
		this.noOfExits = noOfExits;
		this.lift = lift;
		this.noOfShows = noOfShows;
		this.screen = screen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfSeats() {
		return noOfSeats;
	}

	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	public int getNoOfFloors() {
		return noOfFloors;
	}

	public void setNoOfFloors(int noOfFloors) {
		this.noOfFloors = noOfFloors;
	}

	public boolean isPraking() {
		return praking;
	}

	public void setPraking(boolean praking) {
		this.praking = praking;
	}

	public int getNoOfEntrance() {
		return noOfEntrance;
	}

	public void setNoOfEntrance(int noOfEntrance) {
		this.noOfEntrance = noOfEntrance;
	}

	public int getNoOfExits() {
		return noOfExits;
	}

	public void setNoOfExits(int noOfExits) {
		this.noOfExits = noOfExits;
	}

	public boolean isLift() {
		return lift;
	}

	public void setLift(boolean lift) {
		this.lift = lift;
	}

	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public String getScreen() {
		return screen;
	}

	public void setScreen(String screen) {
		this.screen = screen;
	}

	@Override
	public String toString() {
		return "TheaterDto [name=" + name + ", location=" + location + ", noOfSeats=" + noOfSeats + ", noOfFloors="
				+ noOfFloors + ", praking=" + praking + ", noOfEntrance=" + noOfEntrance + ", noOfExits=" + noOfExits
				+ ", lift=" + lift + ", noOfShows=" + noOfShows + ", screen=" + screen + "]";
	}
	
	

}
