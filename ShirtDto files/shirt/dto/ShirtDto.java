package com.xworkz.shirt.dto;

public class ShirtDto {
	
	private int id;
	private double price;
	private String brandName;
	private String color;
	private int size;
	private boolean hasPocket;

public ShirtDto() {
	System.out.println("Default constructor");
}

public ShirtDto(int id, double price, String brandName, String color, int size, boolean hasPocket) {
	super();
	this.id = id;
	this.price = price;
	this.brandName = brandName;
	this.color = color;
	this.size = size;
	this.hasPocket = hasPocket;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getBrandName() {
	return brandName;
}

public void setBrandName(String brandName) {
	this.brandName = brandName;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getSize() {
	return size;
}

public void setSize(int size) {
	this.size = size;
}

public boolean isHasPocket() {
	return hasPocket;
}

public void setHasPocket(boolean hasPocket) {
	this.hasPocket = hasPocket;
}

@Override
public String toString() {
	return "ShirtDto [id=" + id + ", price=" + price + ", brandName=" + brandName + ", color=" + color + ", size="
			+ size + ", hasPocket=" + hasPocket + "]";
}















}
