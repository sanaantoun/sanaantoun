package assignment4comp249;

import java.util.Scanner;

public class CellPhone implements Cloneable{
private long serialNum;
private String brand;
private int year;
private double price;

public CellPhone() {
	
}

public CellPhone(long serialNum, String brand, int year, double price) {
	this.serialNum = serialNum;
	this.brand = brand;
	this.year = year;
	this.price = price;
}

public long getSerialNum() {
	return serialNum;
}

public void setSerialNum(long serialNum) {
	this.serialNum = serialNum;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public CellPhone(CellPhone cellphone, long num) {
this.serialNum = num;
this.brand = cellphone.brand;
this.year = cellphone.year;
this.price = cellphone.price;
}

public CellPhone clone() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a new serial number.");
	long serialNumber = sc.nextLong();
	if(this.serialNum == serialNumber) {
		System.out.println("The serial number that you entered is the same as the previous one. Please enter again.");
		clone();
	}
	return new CellPhone(this, serialNumber);
}

@Override
public String toString() {
	return "CellPhone serial number: " + serialNum + ", brand:" + brand + ", year:" + year + ", price:" + price + "]";
}

public boolean equals(Object other) {
	if(this == null || other == null || this.getClass() != other.getClass())
		return false;
	else
	{
		CellPhone newcell = (CellPhone)other;
		return(this.brand == newcell.brand && this.year == newcell.year && this.price == newcell.price);
	}
}



}
