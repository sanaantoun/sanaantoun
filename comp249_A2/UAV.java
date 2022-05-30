/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part1
 * March 4 2022
 */

package fourth;

/*
 * creating class called UAV
 */
public class UAV {
	/*
	 * attributes
	 */
	protected double weight;
	protected double price;

  /*
   * default constructor 
   */
	public UAV() {
		super();
		
	}

  /*
   * parameterized constructor
   */
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}

  /*
   * copy constructor
   */
	public UAV(UAV uav) {
		this.weight = uav.weight;
		this.price = uav.price;
	}

	/**
	 * getter for uav weight
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}

	/**
	 * setter for uav weight
	 * @param weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}

	/**
	 * getter for uav price
	 * @return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * setter for uav price
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * toString method to return uav description
	 */
	public String toString() {
		String nameOfClass= getClass().getName().substring(getClass().getName().indexOf(".")+1).toLowerCase();
		return"The weight of this "+nameOfClass+ " is " + weight + ", and the price is " + price + ".";
	}
	
	/**
	 * euqals method to ensure uavs are different 
	 * @param uav
	 * @return string
	 */
	public boolean equals(UAV uav) {
		if(uav == null || !(uav instanceof UAV)) {
			return false;
		}
		else {
			UAV other = (UAV) uav;
			return(this.weight == other.weight && this.price == other.price);
		}
	}
}