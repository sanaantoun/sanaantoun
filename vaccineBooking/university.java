package vaccineBooking;

//------------------------------------------------------
//Assignment  #2 question#1
//Written by: Sana Antoun 40209806 
//For COMP 248 Section T - Fall 2021 - Due Date: October 19, 2021
//The purpose of this program is to take information about Concordia University students (either new student or already enrolled students) 
//and check if they have their vaccine passport.

import java.util.Scanner;
import java.util.Random;

public class university {

	public static void main(String[] args) {
		
	  //keyboard
	  Scanner inp= new Scanner (System.in);
	   
		 
	  //Welcome message
	  System.out.println("++++++++++++++++++++++++++++++++++++++++++");
	  System.out.println("   Welcome to Concordia University");
	  System.out.println("++++++++++++++++++++++++++++++++++++++++++\n");
	
	  //asking if they are a new student
	  System.out.print("Are you a new student at Concorida? (yes or no)");
	  String positive = "yes";
	  String negative = "no";
	  String answer= inp.next(); 
    
	  //if-else statement if they are new students
	  if (answer.equals(positive))
    {
  	  //student name
		  System.out.print("\nPlease enter your name (Last name, Firstname seperated by comma) ");
        String name= inp.next();
  	  int index = name.indexOf(",");
  	  
  	  //student date of birth
  	  System.out.print("\nPlease enter your date of birth: ");
  	  String birth= inp.next();
  	
  	  //check if student has the vaccine passport
  	  System.out.print("\nDo you have covid19 vaccine passport? (true or false): ");
  	  boolean passport= inp.nextBoolean();
  	  
  	  //student department
  	  System.out.print("\nPlease enter your department: "); 
  	  String department= inp.next();
    
  	  {
  		  
  	  //if-else statement for student with vaccine passport 
  	  if (passport==true)
  	    {
  		  //printing the name with capitalized first letters
  		  System.out.println("\nCongratulations, "+name.valueOf(name.charAt(index+1)).toUpperCase()+name.substring(index+2)+" "
  		  +name.valueOf(name.charAt(0)).toUpperCase()+name.substring(1, index)+"!"+" You have successfully registered at Concordia University!");
      	  
  		  //generate 7 digit random Student id
      	  int studentid= 1000000 + new Random().nextInt(9999999);
      	  System.out.println("\nYour student ID is "+studentid+"."); 
      	  
      	  //farewell message
      	  System.out.print("\nThank you for using this Program!");
  	    }
  	  
  	  //if-else statement for student without vaccine passport 	
  	  else if (passport==false)
  	  
  	      {
  		    //printing the name with capitalized first letters
              System.out.println("\nCongratulations, "+name.valueOf(name.charAt(index+1)).toUpperCase()+name.substring(index+2)+" "
  		    +name.valueOf(name.charAt(0)).toUpperCase()+name.substring(1, index)+"!"+" You have successfully registered at Concordia University!");
      	    
              //generate 7 digit random Student id
      	    int studentid= 1000000 + new Random().nextInt(9999999);
      	    System.out.println("\nYour student ID is "+studentid+".");
      	    
      	    //farewell message
      	    System.out.println("\n Hope you will get your vaccine passport soon! Take care!");
      	    System.out.print("\nThank you for using this Program!");
  	      }
  	   }
     }
	  
	  //if-else statement if they are not new students
    else if (answer.equals(negative))
   {    
  	  //farewell message
        System.out.print("\nWelcome back! Hope you are having a great semester!");	
        System.out.print("\n\nThank you for using this Program!");
   }  
        
    inp.close();
    
} 
}//end of question
	  
