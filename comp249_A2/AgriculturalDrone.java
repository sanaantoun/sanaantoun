/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part1
 * March 4 2022
 */

package fifth;

import fourth.UAV;

/*
 * creating child class called AgriculturalDrone
 */
public class AgriculturalDrone extends UAV{
	private String brand;
	private int Ccap;

	 /*
	   * default constructor 
	   */
	public AgriculturalDrone() {
		super();
		
	}

	/*
	   * parameterized constructor
	   */
	public AgriculturalDrone(double weight, double price, String brand, int Ccap) {
		super(weight, price);
		this.brand = brand;
		this.Ccap = Ccap;
	}

	/*
	   * copy constructor
	   */
	public AgriculturalDrone(AgriculturalDrone agriculturaldrone, UAV uav) {
		super(uav);
		this.brand = agriculturaldrone.brand;
		this.Ccap = agriculturaldrone.Ccap;
	}

	/**
	 * getter for ag brand
	 * @return brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * setter for ag brand
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * getter for ag ccap
	 * @return Ccap
	 */
	public int getCcap() {
		return Ccap;
	}

	/**
	 * setter for ag ccap
	 * @param ccap
	 */
	public void setCcap(int ccap) {
		Ccap = ccap;
	}
	
	/**
	 * toString method to display ag description
	 */
	public String toString() {
		String e = super.toString();
		return e + " This Agricultural Drone is manufactured by " + brand + ", and the carry capacity is " + Ccap + ".";
	}
	
	/**
	 * equals method to ensure ags are different 
	 * @param agriculturaldrone
	 * @return string
	 */
	public boolean equals(AgriculturalDrone agriculturaldrone) {
		if(!super.equals(agriculturaldrone)) {
			return false;
		}
		else {
			AgriculturalDrone other = (AgriculturalDrone) agriculturaldrone;
			return(this.brand == other.brand && this.Ccap == other.Ccap);
		}
	}
}
