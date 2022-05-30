/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part2
 * March 4 2022
 */

package fifth;

import fourth.UAV;
import zero.FlyingObjects;

/*
 * creating child class called MAV
 */
public class MAV extends UAV{
	/*
	 * attributes
	 */
	private String model;
	private double size;

  /*
   * default constructor 
   */
	public MAV() {
		super();
		
	}

  /*
   * parameterized constructor
   */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}

  /*
   * copy constructor
   */
	public MAV(MAV mav) {
		super(mav);
		this.model =  mav.model;
		this.size = mav.size;
	}

	/**
	 * getter for mav model
	 * @return model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * setter for mav model
	 * @param model
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * getter for mav size
	 * @return size
	 */
	public double getSize() {
		return size;
	}

	/**
	 * setter for mav size
	 * @param size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	
	/**
	 * toString method to display mav description
	 */
	public String toString() {
		String e = super.toString();
		return e + " The model of this MAV is " + model + ", and the size is " + size + ".";
	}
	
	/**
	 * equals method to ensure mavs are different 
	 * @param mav
	 * @return string
	 */
	public boolean equals(MAV mav) {
		if(!super.equals(mav)) {
			return false;
		}
		else {
			MAV other = (MAV) mav;
			return(this.model == other.model && this.size == other.size);
		}
	}
}
