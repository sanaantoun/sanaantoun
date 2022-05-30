/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part2
 * March 4 2022
 */


package third;

import first.Airplane;
import second.Helicopter;
import zero.FlyingObjects;

/*
 * creating child class called Multirotor
 */
public class Multirotor extends Helicopter{
	private int Nbrotors;

  /*
   * default constructor 
   */
	public Multirotor() {
		super();
		
	}

  /*
   * parameterized constructor
   */
	public Multirotor(String brand, double price, int horsepower, int Nbcylenders, int Cyear, int PaCap, int Nbrotors) {
		super(brand, price, horsepower, Nbcylenders, Cyear, PaCap);
		this.Nbrotors = Nbrotors;
	}

  /*
   * copy constructor
   */
	public Multirotor(Multirotor multirotor) {
		super(multirotor);
		this.Nbrotors = multirotor.Nbrotors;
	}

	/**
	 * getter for nbrotors
	 * @return nbrotors
	 */
	public int getNbrotors() {
		return Nbrotors;
	}

	/**
	 * setter for nbrotors
	 * @param nbrotors
	 */
	public void setNbrotors(int nbrotors) {
		Nbrotors = nbrotors;
	}
	
	/**
	 * toString method to display multirotor description
	 */
	public String toString() {
		String e = super.toString();
		return e + " The number of rotors of this Multirotor is " + Nbrotors + ".";
	}
	
	/**
	 * equals method to ensure multirotors are different
	 * @param multirotor
	 * @return string
	 */
	public boolean equals(Multirotor multirotor) {
		if(!super.equals(multirotor)) {
			return false;
		}
		else {
			Multirotor other = (Multirotor) multirotor;
			return(this.Nbrotors == other.Nbrotors);
		}
	}
}
