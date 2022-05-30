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
 * creating child class called Helicopter
 */
public class Helicopter extends Airplane{
	/*
	 * attributes
	 */
	private int Nbcylenders;
	private int Cyear;
	private int PaCap;
	
	/*
	 * default constructor 
	 */
  public Helicopter() {
		super();
		
	}

  /*
   * parameterized constructor
   */
	public Helicopter(String brand, double price, int horsepower, int Nbcylenders, int Cyear, int PaCap) {
		super(brand, price, horsepower);
		this.Nbcylenders = Nbcylenders;
		this.Cyear = Cyear;
		this.PaCap = PaCap;
	}

  /*
   * copy constructor
   */
	public Helicopter(Helicopter helicopter) {
		super(helicopter);
		this.Nbcylenders = helicopter.Nbcylenders;
		this.Cyear = helicopter.Cyear;
		this.PaCap = helicopter.PaCap;
	}

	/**
	 * getter for heli #cylenders
	 * @return nbcylenders
	 */
	public int getNbcylenders() {
		return Nbcylenders;
	}

	/**
	 * setter for heli #cylenders
	 * @param nbcylenders
	 */
	public void setNbcylenders(int nbcylenders) {
		Nbcylenders = nbcylenders;
	}

	/**
	 * getter for heli cyear
	 * @return cyear
	 */
	public int getCyear() {
		return Cyear;
	}

	/**
	 * setter for heli cyear
	 * @param cyear
	 */
	public void setCyear(int cyear) {
		Cyear = cyear;
	}

	/**
	 * getter for heli pacap
	 * @return pacap
	 */
	public int getPaCap() {
		return PaCap;
	}

	/**
	 * setter for heli pacap
	 * @param paCap
	 */
	public void setPaCap(int paCap) {
		PaCap = paCap;
	}
	
	/**
	 * toString method to display helicopter description
	 */
	public String toString() {
		String a = super.toString();
		return a + " The number of cylenders is " + Nbcylenders + ". This helicopter was created in " + Cyear + ", and the passenger capacity is " + PaCap + ".";
	}
	
	/**
	 * equals method to ensure helicopters are different 
	 * @param helicopter
	 * @return string
	 */
	public boolean equals(Helicopter helicopter) {
		if(!super.equals(helicopter)) {
			return false;
		}
		else {
			Helicopter other = (Helicopter) helicopter;
			return(this.Nbcylenders == other.Nbcylenders && this.Cyear == other.Cyear && this.PaCap == other.PaCap);
		}
	}
} 
