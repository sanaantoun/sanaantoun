package vaccineBooking;

//------------------------------------------------------
//Assignment  #2 question#2
//Written by: Sana Antoun 40209806 
//For COMP 248 Section T - Fall 2021 - Due Date: October 19, 2021
//The purpose of this program is to take user input and book covid vaccines for their desired preferences such as time, location, and dosage. 
//This program was build using loops and if conditions.

import java.util.Scanner;

public class vaccinebooking {

	public static void main(String[] args) {
		  
		  //keyboard for user input
		  Scanner inp= new Scanner (System.in);
		 
		  //naming variables
		  int choicevax, location, time, dose; 
		  String tryagain, clinicname = null, doseoutput, apttime = null;
		 
		   
		  //Welcome message
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  System.out.println("   Welcome to Covid19 Vaccine Appointment Program!");
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  //Choice of vaccine from 1-7
		  System.out.println("Here is the Covid-19 vaccine menu:");
		  System.out.println("    1. Pfizer");
		  System.out.println("    2. Moderna"); 
		  System.out.println("    3. AstraZeneca");
		  System.out.println("    4. Johnson&Johnson");
		  System.out.println("    5. Sinovac");
		  System.out.println("    6. Gamaleya");
		  System.out.println("    7. Exit");
		  System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		  
		  //user enters choice of vaccine
	      System.out.print("\nPlease enter your choice (1-7): ");
		  choicevax= inp.nextInt();
		  
		  //while loop for choices that are not in the menu (not 1-7), informing user it is a wrong input
		  while (choicevax < 1 || choicevax > 7)
		  { System.out.println("\nThat is a wrong input. Please try again!");
		    System.out.print("Please enter your choice (1-7): ");
		    choicevax= inp.nextInt();
		  }
		  
		  //while loop for choices that are not available (5-7), informing user it is a wrong input
		  while (choicevax ==5 || choicevax ==6 || choicevax ==7)
		    { if (choicevax ==5)
		       { System.out.println("Sorry, Sinovac is not available now!");
		         System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
		       }
		    
		      else if (choicevax ==6)  
		           { System.out.println("Sorry, Gamaleya is not available now!");
		             System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
		           }
		    
		      else if (choicevax ==7)
		              { System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
		              }
		    
		    //keyboard for user to retry and put the right choice
		    tryagain= inp.next();
		    
		    //user can enter yes to retry and shall be provided with all the options over again
		    if (tryagain.equalsIgnoreCase("yes"))
		     {
		    	System.out.print("\nPlease enter your choice (1-7): ");
		    	choicevax= inp.nextInt();
		    
		    //if user inputs the wrong choice will try again
		    while (choicevax < 1 || choicevax > 7)
			    { System.out.println("\nThat is a wrong input. Please try again!");
			      System.out.print("Please enter your choice (1-7): ");
			      choicevax= inp.nextInt();
			    }
		      }
		    
		    //user can enter no to quit, it will exit the program
		    else if (tryagain.equalsIgnoreCase("no"))
		      //farewell message
		    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
             
		      //exit the program
		      System.exit(0);
		      }
		    
		    }
		    
		  do
		  {
			  //user decides to choose option 1 for vaccine choice
			  if (choicevax== 1)  
			{ 
			   do 
			   {
			     System.out.println("Your choice is: Pfizer.");
			     //giving option to choose a desired location
			     System.out.println("\nPlease choose the location of vaccine Pfizer:");
			     System.out.println("		1 - Pharmaprix");
			     System.out.println("		2 - Jean Coutu");
			     System.out.print("Please enter your choice: ");
			     location= inp.nextInt();
			    
			       if (location== 1)
			        {
			    	   clinicname= "Pharmaprix";
			        }

			       else if (location== 2)
			        {
			    	   clinicname= "Jean Coutu";
			        }

			       if (location== 1 || location== 2)
                  {
			    	   clinicname= "Quit";
                  }
			            
			       
			     //time slots available for the appointment
				 String time1= ("		1 - 2:00 - 2:15");
			     String time2= ("		2 - 2:20 - 2:35");
			     String time3= ("		3 - 2:40 - 2:55");
				 String time4= ("		4 - 3:00 - 3:15");
				 String time5= ("		5 - Quit"); 
			      
				 System.out.println("\nPlease choose the time slots :");
			     System.out.println(time1);
			     System.out.println(time2);
			     System.out.println(time3);
			     System.out.println(time4);
			     System.out.println(time5);
			     
			     //giving user to choose a desired time slot
			     System.out.print("Please enter your choice (1-5): ");
			     time= inp.nextInt();
			     
			     if (time== 1)
			    	 {
			    	   apttime= "2:00 - 2:15";
			    	 }
			     else if (time== 2)
			    	 {
			    	   apttime= "2:20 - 2:35";
			    	 }
			     else if (time== 3)
			    	 {
			    	   apttime= "2:40 - 2:55";
			    	 }
			     else if (time== 4)
			    	 {
			    	   apttime= "3:00 - 3:15";
			    	 }
			     
			     
			     while (time== 5)
			     {
			    	//user chose a unavailable time slot
			    	System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			    	tryagain= inp.next();	
			     
			    	//user can enter yes to retry and shall be provided with all the options over again
				    if (tryagain.equalsIgnoreCase("yes"))
				     {
				    	System.out.print("\nPlease enter your choice (1-7): ");
				    	choicevax= inp.nextInt();
				    
				    //if user inputs the wrong choice will try again
				    while (choicevax < 1 || choicevax > 7)
					    { System.out.println("\nThat is a wrong input. Please try again!");
					      System.out.print("Please enter your choice (1-7): ");
					      choicevax= inp.nextInt();
					    }
				    
				    while (choicevax ==5 || choicevax ==6 || choicevax ==7)
				    { if (choicevax ==5)
				       { System.out.println("Sorry, Sinovac is not available now!");
				         System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
				       }
				    
				      else if (choicevax ==6)  
			           { System.out.println("Sorry, Gamaleya is not available now!");
			             System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			           }
			    
			          else 
			              { System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			              }
			    
			    //keyboard for user to retry and put the right choice
			    tryagain= inp.next();
			    
			    //user can enter yes to retry and shall be provided with all the options over again
			    if (tryagain.equalsIgnoreCase("yes"))
			     {
			    	System.out.print("\nPlease enter your choice (1-7): ");
			    	choicevax= inp.nextInt();
			    
			    	while (choicevax < 1 || choicevax > 7)
				    { System.out.println("\nThat is a wrong input. Please try again!");
				      System.out.print("Please enter your choice (1-7): ");
				      choicevax= inp.nextInt();
				    }
			     }
			    
				    
			    else if (tryagain.equalsIgnoreCase("no"))
				      //farewell message
				    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
		               
				      //exit the program
				      System.exit(0);
				    }
				    
			    else {
                     System.out.println("\nThat is a wrong input. Please try again!");
                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                     tryagain = inp.next();
                   }
				    
				    
			    }//while loop end
				     
		    
		     }//end if statement    
				    
				 else if (tryagain.equalsIgnoreCase("no"))
					      //farewell message
					    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
			               
					      //exit the program
					      System.exit(0);
					    }
					    
				 else {
	                     System.out.println("\nThat is a wrong input. Please try again!");
	                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
	                     tryagain = inp.next();
	                     }
				    
				    //get out of loop
			        time=10;

			     }//end while loop
			
			   }
			      while (choicevax== 1);
			   
			   if (choicevax== 10) 
			    {
				   //asking user to input which dose they are getting
				   System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				   dose= inp.nextInt();
				   
				   if (dose== 1)
				   {
					   doseoutput= "1st dose";
				   }
				    else 
				    {
				    	doseoutput= "2nd dose";
				    }
				   
				   //confirmation message
				   System.out.println("\nYour booked appointment is: Pfizer, "+doseoutput+".");
				   System.out.println("Your schedule is: "+apttime+" @ "+clinicname+".");
				   System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!");
	 
			    }

		  }//end of vax 1 option
			
			
		    
		   //begin vax 2 option
			if (choicevax== 2)  
			{ 
			   do 
			   {
			     //giving user the choice to choose desired location
				 System.out.println("Your choice is: Morderna.");
			     System.out.println("\nPlease choose the location of vaccine Moderna:");
			     System.out.println("		1 - Pharmaprix");
			     System.out.println("		3 - Uniprix CLinique");
			     System.out.println("		4 - Health Center");
			     System.out.print("Please enter your choice: ");
			     location= inp.nextInt();
			    
			       if (location== 1)
			        {
			    	   clinicname= "Pharmaprix";
			        }

			       else if (location== 3)
			         {
			    	   clinicname= "Uniprix Clinique";
			         }
			       
			       else if (location== 4)
			          {
			    	   clinicname= "Health Center";
			          }

			       else
                     {
			    	   clinicname= "Quit";
                     }
			      
			       if (location== 1 || location== 3 || location== 4)
			           {
			    	   choicevax= 20;
			          }
			       
			       
			       while (location< 1 || location== 2 || location>4)
			       {
			    	   System.out.println("\nThat is a wrong input. Please try again!");
					   System.out.print("Please enter your choice: ");
					   location= inp.nextInt();
			       }
			       
			     //time slots available for the appointment
				 String time1= ("		1 - 2:00 - 2:15");
			     String time2= ("		2 - 2:20 - 2:35");
			     String time3= ("		3 - 2:40 - 2:55");
				 String time4= ("		4 - 3:00 - 3:15");
				 String time5= ("		5 - Quit"); 
			      
				 System.out.println("\nPlease choose the time slots :");
			     System.out.println(time1);
			     System.out.println(time2);
			     System.out.println(time3);
			     System.out.println(time4);
			     System.out.println(time5);
			     
			     //giving user the choice to choose desired time slots
			     System.out.print("Please enter your choice (1-5): ");
			     time= inp.nextInt();
			     
			     if (time== 1)
			    	 {
			    	   apttime= "2:00 - 2:15";
			    	 }
			     else if (time== 2)
			    	 {
			    	   apttime= "2:20 - 2:35";
			    	 }
			     else if (time== 3)
			    	 {
			    	   apttime= "2:40 - 2:55";
			    	 }
			     else if (time== 4)
			    	 {
			    	   apttime= "3:00 - 3:15";
			    	 }
			     
			     
			     while (time== 5)
			     {
			    	//user chose an unavailable option, ask to try again
			    	System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			    	tryagain= inp.next();	
			     
			    	//user can enter yes to retry and shall be provided with all the options over again
				    if (tryagain.equalsIgnoreCase("yes"))
				     {
				    	System.out.print("\nPlease enter your choice (1-7): ");
				    	choicevax= inp.nextInt();
				    
				    //if user inputs the wrong choice will try again
				    while (choicevax < 1 || choicevax > 7)
					    { System.out.println("\nThat is a wrong input. Please try again!");
					      System.out.print("Please enter your choice (1-7): ");
					      choicevax= inp.nextInt();
					    }
				    
				    while (choicevax ==5 || choicevax ==6 || choicevax ==7)
				    { if (choicevax ==5)
				       { System.out.println("Sorry, Sinovac is not available now!");
				         System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
				       }
				    
				      else if (choicevax ==6)  
			           { System.out.println("Sorry, Gamaleya is not available now!");
			             System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			           }
			    
			          else 
			              { System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			              }
			    
			    //keyboard for user to retry and put the right choice
			    tryagain= inp.next();
			    
			    //user can enter yes to retry and shall be provided with all the options over again
			    if (tryagain.equalsIgnoreCase("yes"))
			     {
			    	System.out.print("\nPlease enter your choice (1-7): ");
			    	choicevax= inp.nextInt();
			    
			    	while (choicevax < 1 || choicevax > 7)
				    { System.out.println("\nThat is a wrong input. Please try again!");
				      System.out.print("Please enter your choice (1-7): ");
				      choicevax= inp.nextInt();
				    }
			     }
			    
				    
			    else if (tryagain.equalsIgnoreCase("no"))
				      //farewell message
				    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
		               
				      //exit the program
				      System.exit(0);
				    }
				    
			    else {
                     System.out.println("\nThat is a wrong input. Please try again!");
                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                     tryagain = inp.next();
                   }
				    
				    
			    }//while loop end
				     
		    
		     }//end if statement    
				    
				 else if (tryagain.equalsIgnoreCase("no"))
					      //farewell message
					    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
			               
					      //exit the program
					      System.exit(0);
					    }
					    
				 else {
	                     System.out.println("\nThat is a wrong input. Please try again!");
	                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
	                     tryagain = inp.next();
	                     }
				    
				    //get out of loop
			        time=10;

			     }//end while loop
			
			   }
			      while (choicevax== 2);
			   
			   if (choicevax== 20) 
			    {
				   //asking user to input which dose they will be taking
				   System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				   dose= inp.nextInt();
				   
				   if (dose== 1)
				   {
					   doseoutput= "1st dose";
				   }
				    else 
				    {
				    	doseoutput= "2nd dose";
				    }
				   
				   //confirmation message
				   System.out.println("\nYour booked appointment is: Moderna, "+doseoutput+".");
				   System.out.println("Your schedule is: "+apttime+" @ "+clinicname+".");
				   System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!");
	 
			    }

		  }//end of vax 2 option
		    
			  
			//begin vax 3 option
			if (choicevax== 3)  
			{ 
			   do 
			   {
			     //giving user the choice to choose desired location
				 System.out.println("Your choice is: AstraZeneca.");
			     System.out.println("\nPlease choose the location of vaccine AstraZeneca:");
			     System.out.println("		2 - Jean Coutu");
			     System.out.println("		3 - Uniprix CLinique");
			     System.out.print("Please enter your choice: ");
			     location= inp.nextInt();
			    
			       if (location== 2)
			        {
			    	   clinicname= "Jean Coutu";
			        }

			       else if (location== 3)
			         {
			    	   clinicname= "Uniprix Clinique";
			         }
			  
			       else
                     {
			    	   clinicname= "Quit";
                     }
			      
			       if (location== 2 || location== 3)
			           {
			    	   choicevax= 30;
			          }
			       
			       
			       while (location< 2 || location> 3)
			       {
			    	   System.out.println("\nThat is a wrong input. Please try again!");
					   System.out.print("Please enter your choice: ");
					   location= inp.nextInt();
			       }
			       
			     //time slots available for the appointment
				 String time1= ("		1 - 2:00 - 2:15");
			     String time2= ("		2 - 2:20 - 2:35");
			     String time3= ("		3 - 2:40 - 2:55");
				 String time4= ("		4 - 3:00 - 3:15");
				 String time5= ("		5 - Quit"); 
			      
				 System.out.println("\nPlease choose the time slots :");
			     System.out.println(time1);
			     System.out.println(time2);
			     System.out.println(time3);
			     System.out.println(time4);
			     System.out.println(time5);
			     
			     //giving user the choice to choose desired time slots
			     System.out.print("Please enter your choice (1-5): ");
			     time= inp.nextInt();
			     
			     if (time== 1)
			    	 {
			    	   apttime= "2:00 - 2:15";
			    	 }
			     else if (time== 2)
			    	 {
			    	   apttime= "2:20 - 2:35";
			    	 }
			     else if (time== 3)
			    	 {
			    	   apttime= "2:40 - 2:55";
			    	 }
			     else if (time== 4)
			    	 {
			    	   apttime= "3:00 - 3:15";
			    	 }
			     
			     
			     while (time== 5)
			     {
			    	//user chose an unavailable option, ask to try again
			    	System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			    	tryagain= inp.next();	
			     
			    	//user can enter yes to retry and shall be provided with all the options over again
				    if (tryagain.equalsIgnoreCase("yes"))
				     {
				    	System.out.print("\nPlease enter your choice (1-7): ");
				    	choicevax= inp.nextInt();
				    
				    //if user inputs the wrong choice will try again
				    while (choicevax < 1 || choicevax > 7)
					    { System.out.println("\nThat is a wrong input. Please try again!");
					      System.out.print("Please enter your choice (1-7): ");
					      choicevax= inp.nextInt();
					    }
				    
				    while (choicevax ==5 || choicevax ==6 || choicevax ==7)
				    { if (choicevax ==5)
				       { System.out.println("Sorry, Sinovac is not available now!");
				         System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
				       }
				    
				      else if (choicevax ==6)  
			           { System.out.println("Sorry, Gamaleya is not available now!");
			             System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			           }
			    
			          else 
			              { System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			              }
			    
			    //keyboard for user to retry and put the right choice
			    tryagain= inp.next();
			    
			    //user can enter yes to retry and shall be provided with all the options over again
			    if (tryagain.equalsIgnoreCase("yes"))
			     {
			    	System.out.print("\nPlease enter your choice (1-7): ");
			    	choicevax= inp.nextInt();
			    
			    	while (choicevax < 1 || choicevax > 7)
				    { System.out.println("\nThat is a wrong input. Please try again!");
				      System.out.print("Please enter your choice (1-7): ");
				      choicevax= inp.nextInt();
				    }
			     }
			    
				    
			    else if (tryagain.equalsIgnoreCase("no"))
				      //farewell message
				    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
		               
				      //exit the program
				      System.exit(0);
				    }
				    
			    else {
                     System.out.println("\nThat is a wrong input. Please try again!");
                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                     tryagain = inp.next();
                   }
				    
				    
			    }//while loop end
				     
		    
		     }//end if statement    
				    
				 else if (tryagain.equalsIgnoreCase("no"))
					      //farewell message
					    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
			               
					      //exit the program
					      System.exit(0);
					    }
					    
				 else {
	                     System.out.println("\nThat is a wrong input. Please try again!");
	                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
	                     tryagain = inp.next();
	                     }
				    
				    //get out of loop
			        time=10;

			     }//end while loop
			
			   }
			      while (choicevax== 3);
			   
			   if (choicevax== 30) 
			    {
				   //asking user to input which dose they will be taking
				   System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				   dose= inp.nextInt();
				   
				   if (dose== 1)
				   {
					   doseoutput= "1st dose";
				   }
				    else 
				    {
				    	doseoutput= "2nd dose";
				    }
				   
				   //confirmation message
				   System.out.println("\nYour booked appointment is: AstraZeneca, "+doseoutput+".");
				   System.out.println("Your schedule is: "+apttime+" @ "+clinicname+".");
				   System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!");
	 
			    }

		  }//end of vax 3 option  
		    
			//begin vax 4 option
			if (choicevax== 4)  
			{ 
			   do 
			   {
			     //giving user the choice to choose desired location
				 System.out.println("Your choice is: Johnson & Johnson.");
			     System.out.println("\nPlease choose the location of vaccine AstraZeneca:");
			     System.out.println("		4 - Health Center");
			     System.out.print("Please enter your choice: ");
			     location= inp.nextInt();
			    
			       if (location== 4)
			        {
			    	   clinicname= "Health Center";
			        }
			       
			       else
                     {
			    	   clinicname= "Quit";
                     }
			      
			       if (location== 4)
			           {
			    	   choicevax= 40;
			           }
			       
			       
			       while (location< 4 || location>4)
			       {
			    	   System.out.println("\nThat is a wrong input. Please try again!");
					   System.out.print("Please enter your choice: ");
					   location= inp.nextInt();
			       }
			       
			     //time slots available for the appointment
				 String time1= ("		1 - 2:00 - 2:15");
			     String time2= ("		2 - 2:20 - 2:35");
			     String time3= ("		3 - 2:40 - 2:55");
				 String time4= ("		4 - 3:00 - 3:15");
				 String time5= ("		5 - Quit"); 
			      
				 System.out.println("\nPlease choose the time slots :");
			     System.out.println(time1);
			     System.out.println(time2);
			     System.out.println(time3);
			     System.out.println(time4);
			     System.out.println(time5);
			     
			     //giving user the choice to choose desired time slots
			     System.out.print("Please enter your choice (1-5):");
			     time= inp.nextInt();
			     
			     if (time== 1)
			    	 {
			    	   apttime= "2:00 - 2:15";
			    	 }
			     else if (time== 2)
			    	 {
			    	   apttime= "2:20 - 2:35";
			    	 }
			     else if (time== 3)
			    	 {
			    	   apttime= "2:40 - 2:55";
			    	 }
			     else if (time== 4)
			    	 {
			    	   apttime= "3:00 - 3:15";
			    	 }
			     
			     
			     while (time== 5)
			     {
			    	//user chose an unavailable option, ask to try again
			    	System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			    	tryagain= inp.next();	
			     
			    	//user can enter yes to retry and shall be provided with all the options over again
				    if (tryagain.equalsIgnoreCase("yes"))
				     {
				    	System.out.print("\nPlease enter your choice (1-7): ");
				    	choicevax= inp.nextInt();
				    
				    //if user inputs the wrong choice will try again
				    while (choicevax < 1 || choicevax > 7)
					    { System.out.println("\nThat is a wrong input. Please try again!");
					      System.out.print("Please enter your choice (1-7): ");
					      choicevax= inp.nextInt();
					    }
				    
				    while (choicevax ==5 || choicevax ==6 || choicevax ==7)
				    { if (choicevax ==5)
				       { System.out.println("Sorry, Sinovac is not available now!");
				         System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
				       }
				    
				      else if (choicevax ==6)  
			           { System.out.println("Sorry, Gamaleya is not available now!");
			             System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			           }
			    
			          else 
			              { System.out.println("\nYour appointment is not booked successfully! Would you like to try again? (yes or no)"); 
			              }
			    
			    //keyboard for user to retry and put the right choice
			    tryagain= inp.next();
			    
			    //user can enter yes to retry and shall be provided with all the options over again
			    if (tryagain.equalsIgnoreCase("yes"))
			     {
			    	System.out.print("\nPlease enter your choice (1-7): ");
			    	choicevax= inp.nextInt();
			    
			    	while (choicevax < 1 || choicevax > 7)
				    { System.out.println("\nThat is a wrong input. Please try again!");
				      System.out.print("Please enter your choice (1-7): ");
				      choicevax= inp.nextInt();
				    }
			     }
			    
				    
			    else if (tryagain.equalsIgnoreCase("no"))
				      //farewell message
				    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
		               
				      //exit the program
				      System.exit(0);
				    }
				    
			    else {
                     System.out.println("\nThat is a wrong input. Please try again!");
                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
                     tryagain = inp.next();
                   }
				    
				    
			    }//while loop end
				     
		    
		     }//end if statement    
				    
				 else if (tryagain.equalsIgnoreCase("no"))
					      //farewell message
					    { System.out.println("\nThank you for using the Covid19 Vaccine Appointment Program!");
			               
					      //exit the program
					      System.exit(0);
					    }
					    
				 else {
	                     System.out.println("\nThat is a wrong input. Please try again!");
	                     System.out.println("Your appointment is not booked successfully! Would you like to try again? (yes or no)");
	                     tryagain = inp.next();
	                     }
				    
				    //get out of loop
			        time=10;

			     }//end while loop
			
			   }
			      while (choicevax== 4);
			   
			   if (choicevax== 40) 
			    {
				   //asking user to input which dose they will be taking
				   System.out.print("Please enter the 1st or 2nd vaccine shot (1 or 2): ");
				   dose= inp.nextInt();
				   
				   if (dose== 1)
				   {
					   doseoutput= "1st dose";
				   }
				    else 
				    {
				    	doseoutput= "2nd dose";
				    }
				   
				   //confirmation message
				   System.out.println("\nYour booked appointment is: Johnson & Johnson, "+doseoutput+".");
				   System.out.println("Your schedule is: "+apttime+" @ "+clinicname+".");
				   System.out.println("\nThank you for using Covid19 Vaccine Appointment Program!");
	 
			    }

		  }//end of vax 4 option  
			  
	 } while (choicevax== 1 || choicevax== 2 || choicevax== 3);
		
		  //close keyboard
		  inp.close();
	}

}	//end of question 

