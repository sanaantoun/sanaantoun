/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part2
 * March 4 2022
 */


package second;

import first.*;
import zero.FlyingObjects;

/*
 * creating child class called Quadcopter
 */
public class Quadcopter extends Helicopter {
	private int Maxspeed;

  /*
   * default constructor 
   */
	public Quadcopter() {
		super();
	
	}

  /*
   * parameterized constructor
   */
	public Quadcopter(String brand, double price, int horsepower, int Nbcylenders, int Cyear, int PaCap, int Maxspeed) {
		super(brand, price, horsepower, Nbcylenders, Cyear, PaCap);
		this.Maxspeed = Maxspeed;
	}
	
	/*
	 * copy constructor
	 */
  public Quadcopter(Quadcopter quadcopter) {
		super(quadcopter);
		this.Maxspeed = quadcopter.Maxspeed;
	}

  /**
   * getter for maxspeed
   * @return maxspeed
   */
	public int getMaxspeed() {
		return Maxspeed;
	}

	/**
	 * setter for maxspeed
	 * @param maxspeed
	 */
	public void setMaxspeed(int maxspeed) {
		Maxspeed = maxspeed;
	}
	
	/**
	 * toString method to display quadcopter description
	 */
	public String toString() {
		String e = super.toString();
		return e + " The maximum flying speed of this Quadcopter is " + Maxspeed + ".";
	}
	
	/**
	 * equals method to ensure quadcopters are different
	 * @param quadcopter
	 * @return string
	 */
	public boolean equals(Quadcopter quadcopter) {
		if(!super.equals(quadcopter)) {
			return false;
		}
		else {
			Quadcopter other = (Quadcopter) quadcopter;
			return(this.Maxspeed == other.Maxspeed);
		}
	}
	
}
