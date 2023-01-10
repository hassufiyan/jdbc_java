package com.xworkz.bags.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Setter
@ToString

public class BagsDto {
	
	public BagsDto(int id, String name, double price, String color, double capacity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.color = color;
		this.capacity = capacity;
	}
	private int id;
	private String name;
	private double price;
	private String color;
private double capacity;
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
public double getCapacity() {
	return capacity;
}
public void setCapacity(double capacity) {
	this.capacity = capacity;
}
@Override
public String toString() {
	return "BagsDto [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", capacity=" + capacity
			+ "]";
}
	
}
