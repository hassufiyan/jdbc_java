package com.xworkz.soaps.dto;

public class SoapsDto {		
		private int id;
		private String name;
		private double price;
		private String color;
		private String fragrance;
		private double weight;
		private int manufactureDate;
		private String type;
		
		SoapsDto(){
			System.out.println("Default constructor");
			
		}

		public SoapsDto(int id, String name, double price, String color, String fragrance, double weight,
				int manufactureDate, String type) {
			super();
			this.id = id;
			this.name = name;
			this.price = price;
			this.color = color;
			this.fragrance = fragrance;
			this.weight = weight;
			this.manufactureDate = manufactureDate;
			this.type = type;
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

		public String getFragrance() {
			return fragrance;
		}

		public void setFragrance(String fragrance) {
			this.fragrance = fragrance;
		}

		public double getWeight() {
			return weight;
		}

		public void setWeight(double weight) {
			this.weight = weight;
		}

		public int getManufactureDate() {
			return manufactureDate;
		}

		public void setManufactureDate(int manufactureDate) {
			this.manufactureDate = manufactureDate;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return "SoapsDto [id=" + id + ", name=" + name + ", price=" + price + ", color=" + color + ", fragrance="
					+ fragrance + ", weight=" + weight + ", manufactureDate=" + manufactureDate + ", type=" + type + "]";
		}


	}



