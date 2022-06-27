package a1352;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.io.FileInputStream;
import java.io.PrintWriter;


public class covid {
	/**
	 * 
	 *@author Sana Antoun and Cleopatr-Aliak Manoukian
	 * COMP 352 Assignment 1
	 * receive a file, gather/sort info in right order and reprints on a new file. We need to re-arrange the reservations based on 
	 * the date and slot of the reservations. 
	 */
	
	//main method 
	public static void main(String[] args) {
		
		
		PrintWriter pw = null;
		Scanner scanner = null;
		Scanner scan = null;
		
		// try-catch methods to read the files 
		try {
			scanner = new Scanner(new FileInputStream("reserve10.txt"));
			scan = new Scanner(new FileInputStream("reserve10.txt"));
			pw = new PrintWriter(new FileOutputStream("out.txt"));

		    }
		
		catch (FileNotFoundException e) {
			System.out.println("File was not found.");	
			System.out.println("Program will terminate");
			System.exit(0);
		  }		
		
		
		int rows = sizeOfRows(scanner);
		String rDate[] = new String[rows], rSlot[] = new String[rows], rMedicare[] = new String[rows];
		//storing date, slot, medicare in rows 
		storingInArray(rDate, rSlot, rMedicare, scan);
		
		//obtaining the current date 
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		LocalDateTime now = LocalDateTime.now();  
		String date = dtf.format(now); 
		
		// rearrangeReservations given info from the file 
		int active = rearrangeReservations(rDate, rSlot, rMedicare, date, rDate.length);
		System.out.println(active);
		
		// printing out all the info for the active user
		displayReservations(rDate, rSlot, rMedicare, active);
		
		//printing out the sorted reservations ascending order by date/slot
		System.out.println("");
		System.out.println("Past reservations in increasing order");
		System.out.println("");
		System.out.println(displayPastReservationsIncreasingOrder(rDate, rSlot, rMedicare, rDate.length - active, rDate.length - active));
		
		//printing out the sorted reservations decreasing order by date/slot
		System.out.println("");
		System.out.println("Past reservations in decreasing order\n");
		System.out.println(displayPastReservationsDecreasingOrder(rDate, rSlot, rMedicare, rDate.length - active));
		
		// writing the list to the file 
		print(date, active, rDate, rSlot, rMedicare, pw);
		pw.close();
		scan.close();
		scanner.close();
	}
	
	
	//sizeOfRows method to stay in check with the numbers of rows
	static int sizeOfRows(Scanner scanner) {
		
		int rows = 0;
		
		while(scanner.hasNextLine()) 
		{
			scanner.nextLine();
			rows++;
		}
		return rows;
	}
	
	
	//storingInArray method stores the data such as date, slot and medicare in its own place
	static void storingInArray(String[] rDate, String[] rSlot, String[] rMedicare, Scanner scanner) {
		
		int rows = 0;
		String str = "";
		
		while(scanner.hasNextLine()) 
		{
			str = scanner.nextLine();
			String[] s = str.split(",");
			rDate[rows]  = s[0];
			rSlot[rows]  = s[1];
			rMedicare[rows]  = s[2];
			rows++;
		}
	}
	
	//swap method switches values from the arrays (date, slot, medicare)
	static void swap (String[] array1, String[] array2, String[] array3, int i, int j) {
		//for array1
		String tempo = array1[i];  
		array1[i] = array1[j];
		array1[j] = tempo;
        
		//for array 2
        tempo = array2[i];  
        array2[i] = array2[j];
        array2[j] = tempo;
        
        //for array 3
        tempo = array3[i];  
        array3[i] = array3[j];
        array3[j] = tempo;
     }  
	
	
	//sorting method will sort the content of the arrays on if it is a past one or an active one 
	static void sort (String[] array1, String[] array2, String[] array3, String date) {
		
		
		String fDate[] = new String[array1.length];
		String fSlot[] = new String[array1.length];
		String fMedicare[] = new String[array1.length];
		
		int counter = 0;
		int seperator = array1.length;
		
		
		// sorting with bubble sort
		for(int i = 0; i<array1.length; i++)   
        {  
            for (int j = i+1; j<array1.length; j++)   
            {  
               if(array1[i].compareTo(array1[j])>0)   
               {   
                   swap(array1, array2, array3, i, j);
                }  
             }  
          }
		for (int i = 0; i < array1.length; i++) {
			if(array1[i].compareTo(date) == 1 || array1[i].compareTo(date) == 0) {
				if(counter == 0) {
					seperator = i;  
				}
				fDate[counter] = array1[i];
				fSlot[counter] = array2[i];
				fMedicare[counter] = array3[i];
				counter++;
			}
		}
		
		//add to array their position
		for (int i = seperator-1; i >= 0; i--) {
			fDate[counter] = array1[i];
			fSlot[counter] = array2[i];
			fMedicare[counter] = array3[i];
			counter++;
		}
		
		//recheck if its in the right order
		for (int i = 0; i < array1.length-1; i++) {
			for (int j = i+1; j < fMedicare.length; j++) {
				//if active swap position
				if(fDate[i].equals(fDate[j]) && Integer.parseInt(fSlot[i]) > Integer.parseInt(fSlot[j]) && i <= counter-seperator) {
					swap(fDate, fSlot, fMedicare, i, j);
				
					
				//if old swap position
				}else if(fDate[i].equals(fDate[j]) && Integer.parseInt(fSlot[i]) < Integer.parseInt(fSlot[j]) && i > counter-seperator) {
					swap(fDate, fSlot, fMedicare, i, j);
				}
			}
			
		}
		
		// add info to the array
		for (int i = 0; i < array1.length; i++)
		{
			array1[i] = fDate[i];
			array2[i] = fSlot[i];
			array3[i] = fMedicare[i];
		}
	}
	

	//sort list from the end to beginning 
	static int rearrangeReservations(String[] rDate, String[] rSlot, String[] rMedicare, String date, int res) {
		
	
		if (rDate.length == res ) {
		sort(rDate, rSlot, rMedicare, date);
		}
	
		if(res == 0) {
			return 6;
		}

		if(rDate[res-1].compareTo(date) > 0) {
			return res;

		}
		else 
		{ 
			return rearrangeReservations(rDate, rSlot, rMedicare, date, res-1);
		}
		
	}

	//displayReservation method displays info in ascending order
	static void displayReservations(String[] rDate, String[] rSlot, String[] rMedicare, int fRes) {
		
		System.out.println("Active reservations :\n");
		
		for (int i = 0; i < fRes; i++) {
			System.out.println(rDate[i] + "/" + rSlot[i] + "/" + rMedicare[i]);
		} 
	}
	
	//displayPastReservationsIncreasingOrder method displays info in ascending order
	static String displayPastReservationsIncreasingOrder(String[] rDate, String[] rSlot, String[] rMedicare, int yes, int y) {
		
		if(yes == 0) 
		{
			return "";
		}
		else
		{
			System.out.println(rDate[rDate.length - (y-(yes-1))] + "/" + rSlot[rDate.length - (y-(yes-1))]);
			
			return displayPastReservationsIncreasingOrder(rDate, rSlot, rMedicare, yes-1,y);
		}
		
	}
	

	//displayPastReservationsDecreasingOrder method displays info in decreasing order 
	static String displayPastReservationsDecreasingOrder(String[] rDate, String[] rSlot, String[] rMedicare, int yes) {
		
		if(yes == 0) 
		{
			return "";
		}
		else
		{
			System.out.println(rDate[rDate.length - yes] + "/" + rSlot[rDate.length - yes]);
			
			return displayPastReservationsDecreasingOrder(rDate, rSlot, rMedicare, yes-1);
		}
		
	}

	//print method prints to the file
	static void print(String date, int active, String rDate[], String rSlot[], String rMedicare[], PrintWriter pw) {
		
		pw.println("Current Date:" + date);
		pw.println("Date\t\tSlot\tMedicare");
		
		for (int i = 0; i < active; i++) {
			pw.println(rDate[i]+"\t"+rSlot[i]+"\t"+rMedicare[i]);
		}
		pw.println("--------------------------------");
		for (int i = active; i < rDate.length; i++) 
		{
			pw.println(rDate[i]+"\t"+rSlot[i]+"\t"+rMedicare[i]);
			}
		
		pw.close();
	}
		


}
