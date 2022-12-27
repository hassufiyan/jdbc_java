package com.xworkz.mobiledto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class MobileDto {
	
	private String modleName;
	private double price;
	private boolean dualSim;
	private int storageInGb;
	private int ramInGb;


public MobileDto() {
	System.out.println("Default constructor");
}
public MobileDto(String modleName, double price, boolean dualSim, int storageInGb, int ramInGb) {
	super();
	this.modleName = modleName;
	this.price = price;
	this.dualSim = dualSim;
	this.storageInGb = storageInGb;
	this.ramInGb = ramInGb;
}
public String getModleName() {
	return modleName;
}
public void setModleName(String modleName) {
	this.modleName = modleName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public boolean isDualSim() {
	return dualSim;
}
public void setDualSim(boolean dualSim) {
	this.dualSim = dualSim;
}
public int getStorageInGb() {
	return storageInGb;
}
public void setStorageInGb(int storageInGb) {
	this.storageInGb = storageInGb;
}
public int getRamInGb() {
	return ramInGb;
}
public void setRamInGb(int ramInGb) {
	this.ramInGb = ramInGb;
}
@Override
public String toString() {
	return "MobileDto [modleName=" + modleName + ", price=" + price + ", dualSim=" + dualSim + ", storageInGb="
			+ storageInGb + ", ramInGb=" + ramInGb + "]";
}
}












