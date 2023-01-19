package com.xworkz.watch.dto;

public class WatchDto {
	
	private int id;
	private String brandName;
	private String color;
	private String type;
	private int price;

	WatchDto(){
		System.out.println("Default constructor");
	}

	public WatchDto(int id, String brandName, String color, String type, int price) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.color = color;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "WatchDto [id=" + id + ", brandName=" + brandName + ", color=" + color + ", type=" + type + ", price="
				+ price + "]";
	}
	
}
