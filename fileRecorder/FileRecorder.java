import java.io.*;
import java.util.Scanner;

/**
 * The program creates and writes the necessary inputs of the user such as the name of the football team, the number of players, the rank and the country
 * the team is representing.
 * @author sanaantoun
 */


public class FileRecorder {
	private static Scanner scan= new Scanner(System.in);
	
	public static void writeToFile(PrintWriter writer) {
		System.out.println("Please enter the name of your football team: ");
		String footballteam= scan.next();
		System.out.println("Please enter number of players: ");
		int nbplayer= scan.nextInt();
		System.out.println("Please enter the rank: ");
		String rankchar= scan.next();
		System.out.println("Please enter the name of your country: ");
		String country= scan.next();
		
		writer.write(footballteam+ "\r\n");
		writer.write(nbplayer+ "\r\n");
		writer.write(rankchar+ "\r\n");
		writer.write(country+ "\r\n");
		writer.flush();
		
	}
	
	public static void readFromFile(Scanner read) {
		while (read.hasNextLine()) {
			System.out.println(read.nextLine());
		}
		
	}

	public static void main(String[] args) {
		PrintWriter writer= null;
		System.out.println("Please enter the name of your file: ");
		String filename= scan.nextLine();
		File file= new File(filename);
		if(!file.exists()) {
			try {
				file.createNewFile();
			}
			catch (IOException exception) {
				System.out.println("File could not be created!!!");
				return;
			}
		}
		
		try {
			FileWriter filewriter= null;
			filewriter= new FileWriter(file, true);
			BufferedWriter bufferedwriter= new BufferedWriter(filewriter);
			writer= new PrintWriter(bufferedwriter);
			writeToFile(writer);
			writer.close();
			
		}
		catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		

		try {
			Scanner read=new Scanner(new File(filename));
			readFromFile(read);
			read.close();
			
		}
		catch (FileNotFoundException filenotfoundexception) {
			System.out.println("Cannot read from the given file!!!");
		}
	}

}
