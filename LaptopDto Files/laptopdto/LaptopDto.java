package com.xworkz.laptopdto;

public class LaptopDto {
	
private String modelName;
private String brandName;
private double price;
private String operatingSystem;
private String generation;
private int ramInGb;
private int displayInInches;
private boolean screentouch;
private String proccessor;
private String graphic;

public LaptopDto() {
	System.out.println("Default Constructor");
}

public LaptopDto(String modelName, String brandName, double price, String operatingSystem, String generation,
		int ramInGb, int displayInInches, boolean screentouch, String proccessor, String graphic) {
	super();
	this.modelName = modelName;
	this.brandName = brandName;
	this.price = price;
	this.operatingSystem = operatingSystem;
	this.generation = generation;
	this.ramInGb = ramInGb;
	this.displayInInches = displayInInches;
	this.screentouch = screentouch;
	this.proccessor = proccessor;
	this.graphic = graphic;
}

public String getModelName() {
	return modelName;
}

public void setModelName(String modelName) {
	this.modelName = modelName;
}

public String getBrandName() {
	return brandName;
}

public void setBrandName(String brandName) {
	this.brandName = brandName;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getOperatingSystem() {
	return operatingSystem;
}

public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
}

public String getGeneration() {
	return generation;
}

public void setGeneration(String generation) {
	this.generation = generation;
}

public int getRamInGb() {
	return ramInGb;
}

public void setRamInGb(int ramInGb) {
	this.ramInGb = ramInGb;
}

public int getDisplayInInches() {
	return displayInInches;
}

public void setDisplayInInches(int displayInInches) {
	this.displayInInches = displayInInches;
}

public boolean isScreentouch() {
	return screentouch;
}

public void setScreentouch(boolean screentouch) {
	this.screentouch = screentouch;
}

public String getProccessor() {
	return proccessor;
}

public void setProccessor(String proccessor) {
	this.proccessor = proccessor;
}

public String getGraphic() {
	return graphic;
}

public void setGraphic(String graphic) {
	this.graphic = graphic;
}

@Override
public String toString() {
	return "LaptopDto [modelName=" + modelName + ", brandName=" + brandName + ", price=" + price + ", operatingSystem="
			+ operatingSystem + ", generation=" + generation + ", ramInGb=" + ramInGb + ", displayInInches="
			+ displayInInches + ", screentouch=" + screentouch + ", proccessor=" + proccessor + ", graphic=" + graphic
			+ "]";
}







}
















































