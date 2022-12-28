package com.xworkz.gamesdto;

public class GamesDto {
	
	private String gameName;
	private int noOfPlayers;
	private int totalTimeInHours;
	private boolean isIndoor;
	private String goatPlayer;
	private String gameLocation;
	
	public  GamesDto() {
		System.out.println("Default constructor");
		
	}

	public GamesDto(String gameName, int noOfPlayers, int totalTime, boolean isIndoor, String goatPlayer,
			String gameLocation) {
		super();
		this.gameName = gameName;
		this.noOfPlayers = noOfPlayers;
		this.totalTimeInHours = totalTime;
		this.isIndoor = isIndoor;
		this.goatPlayer = goatPlayer;
		this.gameLocation = gameLocation;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public int getNoOfPlayers() {
		return noOfPlayers;
	}

	public void setNoOfPlayers(int noOfPlayers) {
		this.noOfPlayers = noOfPlayers;
	}

	public int getTotalTime() {
		return totalTimeInHours;
	}

	public void setTotalTime(int totalTime) {
		this.totalTimeInHours = totalTime;
	}

	public boolean isIndoor() {
		return isIndoor;
	}

	public void setIndoor(boolean isIndoor) {
		this.isIndoor = isIndoor;
	}

	public String getGoatPlayer() {
		return goatPlayer;
	}

	public void setGoatPlayer(String goatPlayer) {
		this.goatPlayer = goatPlayer;
	}

	public String getGameLocation() {
		return gameLocation;
	}

	public void setGameLocation(String gameLocation) {
		this.gameLocation = gameLocation;
	}

	@Override
	public String toString() {
		return "GamesDto [gameName=" + gameName + ", noOfPlayers=" + noOfPlayers + ", totalTime=" + totalTimeInHours
				+ ", isIndoor=" + isIndoor + ", goatPlayer=" + goatPlayer + ", gameLocation=" + gameLocation + "]";
	}
	
	
	
	
	
	

}
