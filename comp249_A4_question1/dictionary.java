//purpose of the project is to read a text file and store words
//in another file called subdictionnary in alphabetical order
//with the use of arraylist.

package assignment4comp249;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 
 * @author luizamatan 40212529
 * @author sanaantoun 40209806
 * comp 249
 * Assignment 4
 * April 15 2022
 */

public class dictionary {

	public static void main(String[] args) {
		/**
		 * scanner keyboard for user input 
		 */
		Scanner keyinput = new Scanner(System.in);
		
		/**
		 * scanner for file reader 
		 */
		Scanner sc=null;
		PrintWriter pw = null;
		
		System.out.println("Please enter the name of the file you want to read for the subdictionary:");
		String fileinput= keyinput.next();
		
		/**
		 * open the file to read and create the subdictionary
		 */
		try {
			sc= new Scanner(new FileInputStream(fileinput));
			pw= new PrintWriter(new FileOutputStream("SubDictionary.txt"));
		} catch (FileNotFoundException e){
			System.out.println("Problem opening file!!! Please make sure "+fileinput+" file exists.");
			System.out.println("Program will terminate.");
			System.exit(0);
		}

		catch(IOException e) {
			System.out.println("Problem reading file "+fileinput+"!!!");
			System.out.println("Program will terminate.");
			System.exit(0);
		}
		
		/**
		 * making an arraylist for the words in the subdictionary
		 */
		ArrayList<String> arrlist= new ArrayList<String>();
		/**
		 * number of words found in file
		 */
		int cntr=0;
		
		/**
		 * reads the file entered by user 
		 */
		while(sc.hasNext()) {
			String word= sc.next().toUpperCase();
			boolean flag= true;
			
			/**
			 * check if words in the file contains the following restriction
			 */
			if (word.contains("?")||word.contains(":")||word.contains(",")||word.contains("=")||word.contains(";")||
					word.contains("!")||word.contains(".")||word.contains("'T")||word.contains("'LL")||
					word.contains("'RE")||word.contains("'D")||word.contains("'NT")||word.contains("'VE")||word.contains("'M")||
					word.contains("'N")||word.contains("'S")) {
				
				word=word.replace("?","");
				word=word.replace(":","");
				word=word.replace(",","");
				word=word.replace("=","");
				word=word.replace(";","");
				word=word.replace("!","");
				word=word.replace(".","");
				word=word.replace("'T","");
				word=word.replace("'LL","");
				word=word.replace("'RE","");
				word=word.replace("'D","");
				word=word.replace("'NT","");
				word=word.replace("'VE","");
				word=word.replace("'M","");
				word=word.replace("'N","");
				word=word.replace("'S","");
			}
		
			
			/**
			 * check file to see if it contains a number 
			 */
			if(word.contains("0")||word.contains("1")||word.contains("2")||word.contains("3")||word.contains("4")||word.contains("5")||
					word.contains("6")||word.contains("7")||word.contains("8")||word.contains("9")) {
				flag=false;
			}
			
			/**
			 * check if word in the file has a single character restriction
			 */
			if(word.length()==1) {
				if (!(word.equals("I") || word.equals("A"))) {
			flag=false;
				}
			}
			/**
			 * adding words to subdictionary file if all restriction are met properly
			 */
			if(!(word.equals(""))&& flag==true &&!(arrlist.contains(word))){
				/**
				 * counter will counter the amount of words that will be in the file
				 */
				cntr++;
				arrlist.add(word);
				
			}
		}
		
		
		/**
		 * make sure that the subdictionary is in alphabetic order
		 */
		arrlist.sort(null);
		
		/**
		 * write the words on the subdictionary file 
		 */
		pw.println("The document provided this sub-dictionary, which includes "+cntr+" entries.");
		String firstletter= arrlist.get(0).substring(0,1);
		
		pw.println(firstletter+"\n");
		pw.println("==\n");
		/**
		 * printing the words in order for each first letter
		 */
		for (int i=0; i<arrlist.size();i++) {
			String now= arrlist.get(i);
			
			if (now.substring(0,1).equalsIgnoreCase(firstletter)) {
				pw.println(now+"\n");
			}
			else {
			firstletter= now.substring(0,1);
			pw.println("\n\n"+firstletter+"\n");
			pw.println("==\n");
			pw.println(now+"\n");
		}
		}
		
		sc.close();
		pw.close();
		keyinput.close();
	}

}
