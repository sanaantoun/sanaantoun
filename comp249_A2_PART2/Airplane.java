/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part2
 * March 4 2022
 */

package first;

import zero.FlyingObjects;

/*
 * creating child class called Airplane
 */
public class Airplane extends FlyingObjects{
/*
 * attributes
 */
protected String brand;
protected double price;
protected int horsepower;

/*
 * default constructor 
 */
public Airplane() {
	super();
	
}

/*
 * parameterized constructor 
 */
public Airplane(String brand, double price, int horsepower) {
	this.brand = brand;
	this.price = price;
	this.horsepower = horsepower;
}

/*
 * copy constructor
 */
public Airplane(Airplane airplane) {
	super(airplane);
	this.brand = airplane.brand;
	this.price = airplane.price;
	this.horsepower = airplane.horsepower;
}
/**
 * getter for airplane brand
 * @return brand
 */
public String getBrand() {
	return brand;
}

/**
 * setter for aiplane brand
 * @param brand
 */
public void setBrand(String brand) {
	this.brand = brand;
}

/**
 * getter for airplane price
 * @return price
 */
public double getPrice() {
	return price;
}

/**
 * setter aiplane price
 * @param price
 */
public void setPrice(double price) {
	this.price = price;
}

/**
 * getter for aiplane horsepower
 * @return horsepower
 */
public int getHorsepower() {
	return horsepower;
}

/**
 * setter for aiplane horsepower
 * @param horsepower
 */
public void setHorsepower(int horsepower) {
	this.horsepower = horsepower;
}

/**
 * toString method to return the airplane description
 */
public String toString() {
	String nameOfClass= getClass().getName().substring(getClass().getName().indexOf(".")+1).toLowerCase();
	return "This "+nameOfClass+" is manufactured by " + brand + ". It costs " + price + "$, and has a horsepower of " + horsepower + ".";
}

/**
 * equals method to ensure aiplanes are different 
 * @param airplane
 * @return string
 */
public boolean equals(Airplane airplane) {
	if(airplane == null || !(airplane instanceof Airplane)) {
		return false;
	} else {
	Airplane other = (Airplane) airplane;
	return(this.brand == other.brand && this.price == other.price && this.horsepower == other.horsepower);
	}
}




}
