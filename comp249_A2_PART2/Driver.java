// -----------------------------------------------------
// Assignment 2
// Question: part 2
// Written by: Sana Antoun 40209806
// In this part of the assignment, i was required to expand the implementation fron part 1. Therefore i had to create a new driver 
// where i had to copy the flying objects into a new array by only using the copy constructor and a method called FlyingObjects.
// To add, i also had to conclude whether the code works correctly or if it misbehaves.
// -----------------------------------------------------


/**
 * Sana Antoun 40209806
 * COMP249
 * Assignment #2 part2
 * March 4 2022
 */

package Driver;

import first.*;
import second.*;
import third.*;
import fourth.*;
import fifth.*;
import zero.*;

/*
 * creating class called Driver
 */
public class Driver{
	
	/*
	 * creating a copy method to copy the array of flying objects
	 */
	public static void copyFlyingObjects(FlyingObjects[] arr) {
		FlyingObjects[] copyarr= new FlyingObjects[arr.length];
		
		/*
		 * for loop to copy the flying objects
		 */
		for (int i=copyarr.length-1; i>=0; --i) {
			FlyingObjects a= arr[i];
			if (a!= null) {
				copyarr[i]= new FlyingObjects(a);
				System.out.println(copyarr[i].toString());
			}
		}
		
	}

	public static void main(String[] args) {
		
		/*
		 * creating flying objects
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
	     * creating an array of the flying objects created above
	     */
	    FlyingObjects[] FlyingObjects = {A1, A2, A3, H1, H2, Q1, Q2, M1, M2, U1, U2, AD1, AD2, MA1, MA2};
	    
	    /*
	     * displaying the original objects before copying
	     */
	    System.out.println("The original objects: \n");
	    for (int i=0; i<FlyingObjects.length; i++) {
	    	System.out.println(FlyingObjects[i].toString());
	    }
	    /*
	     * displaying the copied objects
	     */
	    System.out.println("\n\nThe copied objects: \n"); 
	    Driver.copyFlyingObjects(FlyingObjects);
	   
	
		

	}

}
