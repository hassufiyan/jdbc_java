<<<<<<< HEAD
package com.xworkz.television.dto;

public class TelevisionDto {
	
	String modelName;
	double price;
	String color;
	String type;
	int sizeInInches;
	
	TelevisionDto(){
		System.out.println("Default constructor");
	}

	public TelevisionDto(String modelName, double price, String color, String type, int sizeInInches) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.color = color;
		this.type = type;
		this.sizeInInches = sizeInInches;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
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

	public int getSizeInInches() {
		return sizeInInches;
	}

	public void setSizeInInches(int sizeInInches) {
		this.sizeInInches = sizeInInches;
	}

	@Override
	public String toString() {
		return "TelevisionDto [modelName=" + modelName + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", sizeInInches=" + sizeInInches + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
=======
package com.xworkz.television.dto;

public class TelevisionDto {
	
	String modelName;
	double price;
	String color;
	String type;
	int sizeInInches;
	
	TelevisionDto(){
		System.out.println("Default constructor");
	}

	public TelevisionDto(String modelName, double price, String color, String type, int sizeInInches) {
		super();
		this.modelName = modelName;
		this.price = price;
		this.color = color;
		this.type = type;
		this.sizeInInches = sizeInInches;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
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

	public int getSizeInInches() {
		return sizeInInches;
	}

	public void setSizeInInches(int sizeInInches) {
		this.sizeInInches = sizeInInches;
	}

	@Override
	public String toString() {
		return "TelevisionDto [modelName=" + modelName + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", sizeInInches=" + sizeInInches + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
>>>>>>> e2424ffadd2223dd193b3585addd8a357f51bf23
