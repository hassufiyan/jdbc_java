package com.xworkz.cars.dto;

public class CarsDto {
	
private String brand;
private double price;
private String color;
private String type;
private int topSpeed;

public CarsDto() {
	System.out.println("Default Constructor");
}

public CarsDto(String brand, double price, String color, String type, int topSpeed) {
	super();
	this.brand = brand;
	this.price = price;
	this.color = color;
	this.type = type;
	this.topSpeed = topSpeed;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public int getTopSpeed() {
	return topSpeed;
}

public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}

@Override
public String toString() {
	return "CarsDto [brand=" + brand + ", price=" + price + ", color=" + color + ", type=" + type + ", topSpeed="
			+ topSpeed + "]";
}


	
	
	
	
	
	
	
	



}
