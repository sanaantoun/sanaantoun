// -----------------------------------------------------
// Assignment 2
// Question: part 1
// Written by: Sana Antoun 40209806
// In this part of the assignment, i ahd to create five packages for 7 different classes. These classes implemented inheritance
// and many methods and constructors. The goals was to create an two array of flying objects with and without UAV. 
// Further, i also had to create a method called findLeastAndMostExpensiveUAV which was meant to find the least and most expensive
// UAV's in the created arrays. I also had to display the descriptions of the flying objects as well as comparing the objects from
// the same class to check if they are the same or not. In this part, i had to explained whether the code misbehaves or not. 
// -----------------------------------------------------


/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part1
 * March 4 2022
 */

package Driver;

import first.*;
import second.*;
import third.*;
import fourth.*;
import fifth.*;


/*
 * creating a class called Driver
 */
public class Driver {

	public static void main(String[] args) {

	/*
	 * creating objects from each classes	
	 */
    Airplane A1= new Airplane("Boeing", 3000000, 40000);
    Airplane A2= new Airplane("Airbus", 980000, 16000);
    Airplane A3= new Airplane("Safran", 280000, 2000);
    
    Helicopter H1= new Helicopter("Airbus", 700000, 700, 6, 2015, 4);
    Helicopter H2= new Helicopter("Bell", 400000, 124, 4, 2012, 4);
    
    Quadcopter Q1= new Quadcopter("Bell", 400000, 124, 4, 2012, 4, 45);
    Quadcopter Q2= new Quadcopter("Robinson", 500000, 900, 4, 2017, 2, 250);
   
    Multirotor M1= new Multirotor("Robinson", 600000, 950, 4, 2014, 2, 6);
    Multirotor M2= new Multirotor("Robinson", 600000, 950, 4, 2014, 2, 6);
   
    UAV U1= new UAV(50, 500);
    UAV U2= new UAV(70, 650);
    
    AgriculturalDrone AD1= new AgriculturalDrone(100, 1000, "DJI", 200);
    AgriculturalDrone AD2= new AgriculturalDrone(200, 1500, "DJI", 300);
   
    MAV MA1= new MAV(25, 150, "emax", 30);
    MAV MA2= new MAV(30, 200, "DJI", 50);

    /*
     * printing out the created objects
     */
    System.out.println(A1.toString());
    System.out.println(A2.toString());
    System.out.println(A3.toString());
    System.out.println(H1.toString());
    System.out.println(H2.toString());
    System.out.println(Q1.toString());
    System.out.println(Q2.toString());
    System.out.println(M1.toString());
    System.out.println(M2.toString());
    System.out.println(U1.toString());
    System.out.println(U2.toString());
    System.out.println(AD1.toString());
    System.out.println(AD2.toString());
    System.out.println(MA1.toString());
    System.out.println(MA2.toString());
    System.out.println();
    
    /*
     * comparing the airplane objects to check if they are the same 
     */
    System.out.println("Comparing Airplane 1 and Airplane 2: ");
    
    if(A1.equals(A2)) {
		System.out.println("They are the same!");
	}
	else
		System.out.println("Not the same!");
	System.out.println();
	
	/*
	 * comparing the multirotor objects to check if they are the same
	 */
	System.out.println("Comparing Multirotor 1 and multirotor 2: ");
	
	if(M1.equals(M2)) {
		System.out.println("They are the same!");
	}
	else 
		System.out.println("Not the same!");
	System.out.println();
	
	/*
	 * comparing the helicopter objects to check if they are the same
	 */
	System.out.println("Comparing Helicopter 2 and Quadcopter 1: ");
	
	if(H2.equals(Q1)) {
		System.out.println("They are the same!");
	}
	else
		System.out.println("Not the same!");
	System.out.println();
	System.out.println("Comparing AgriculturalDrone 1 and MAV 2: ");
	
	if(AD1.equals(MA2)) {
		System.out.println("They are the same!");
	}
	else
		System.out.println("Not the same!\n");
	
	/*
	 * created more objects for the a second array
	 */
	Airplane A4 = new Airplane("Boeing", 50000000, 500000);
	Airplane A5 = new Airplane("Airbus", 600000000, 700000);
	Helicopter H3 =  new Helicopter("Bell", 600000, 250, 4, 2016, 4);
	Helicopter H4 = new Helicopter("Airbus", 400000, 125, 6, 2013, 4);
	Quadcopter Q3 = new Quadcopter("Textron", 300000, 800, 4, 2017, 2, 150);
	Multirotor M3 = new Multirotor("Robinson", 500000, 900, 4, 2012, 2, 6);
	
	
	/*
	 * creating 2 arrays with flying objects (one with uavs and one without them)
	 */
	Object[] FlyingObjects1 = {A1, A2, A3, H1, H2, Q1, Q2, M1, M2, U1, U2, AD1, AD2, MA1, MA2};
	Object[] FlyingObjects2 = {A1, A2, A3, A4, A5, H1, H2, H3, H4, Q1, Q2, Q3, M1, M2, M3};
	
	/*
	 * displaying the message of trying to find the most and least expensive uav from array 1 with uavs
	 */
	System.out.println("Trying to find the least and most expensive UAV on the first array.");
	Driver.findLeastAndMostExpensiveUAV(FlyingObjects1);
	
	/*
	 * displaying the message of trying to find the most and least expensive uav from array 2 with no uavs
	 */
	System.out.println("\nTrying to find the least and most expensive UAV on the second array.");
	Driver.findLeastAndMostExpensiveUAV(FlyingObjects2);

	
	}
	/*
	 * creating method to find least and most expensive UAV from the array
	 */
	public static void findLeastAndMostExpensiveUAV(Object[] arr) {
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		UAV minprice = null;
		UAV maxprice = null;

		for(int i = 0; i < arr.length; i++) {
			
			
			 if(arr[i] instanceof UAV) {
				/*
				 * create a temporary object and cast it as an UAV to get all its attributes when looking for one in the array
				 */
				UAV tempUAV= (UAV)arr[i];
			
				/*
				 * if statement to check if the UAV has the max price
				 */
				if(tempUAV.getPrice()>max) {
					max=tempUAV.getPrice();
					/*
					 * setting max price to the UAV with the highest price
					 */
					maxprice=tempUAV;
					
					
				}
				
				/*
				 * if statement to check if the UAV has the min price
				 */
				if(tempUAV.getPrice()<min) {
					min=tempUAV.getPrice();
					/*
					 * setting min price to the UAV with the lowest price 
					 */
					minprice=tempUAV;
					
					
				}
			
				
			}
			
			}if(minprice!=null && maxprice!=null) {
		/*
		 * displaying the UAV with the appropriate price		
		 */
		System.out.println("The most expensice UAV is: "+maxprice.toString());
		System.out.println("The least expensive UAV is: "+minprice.toString()); 
	
	}
			if (minprice==null && maxprice==null) {
				/*
				 * message displays if there are no uavs in the array
				 */
				System.out.println("There are no UAV in this array.");
			}
		
		
		
}
	

}  
