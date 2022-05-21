import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("|   |  /^\\  |\\    |   -----    |\\    /|   /^\\   |\\    | ");
		System.out.println("|   | /   \\ | \\   |  |     |   | \\  / |  /   \\  | \\   | ");
		System.out.println("|---| |---| |  \\  |  |         |  \\/  |  |---|  |  \\  |   ");
		System.out.println("|   | |   | |   \\ |  |   --|   |      |  |   |  |   \\ |    ");
		System.out.println("|   | |   | |    \\|  |_____|   |      |  |   |  |    \\|    ");
		
		System.out.println("\n===============Welcome to the HANGMAN game=================");
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Play Game: 1 player or 2 players?");
		String playerNumber = keyboard.nextLine();
		
		String word;
		if (playerNumber.equals("1")) {
			Scanner sc = new Scanner(new File("engmix.txt"));
			

			List <String> wordlist = new ArrayList <>();
			
			while (sc.hasNext()) {
				wordlist.add(sc.nextLine());
			}
			
			Random rdm = new Random();
			
			word = wordlist.get(rdm.nextInt(wordlist.size()));
			
		}
			
		
		
		else {
			System.out.println("Player 1, Choose your word -->");
			word = keyboard.nextLine();
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			System.out.println("Player 2, Start guessing!");
		}
		
		//System.out.println(word);
		
		List<Character> playGuesses = new ArrayList<>();
		
		
		int counterwrong = 0;
		while (true) {
			printMan(counterwrong);
			
			if (counterwrong >= 6) {
				System.out.println("OHH NOO!!! You Lost the game!");
				break;
			}
			
			
		printCurrentWord(word, playGuesses);
		if (!getGuesses(keyboard, word, playGuesses)) {
			counterwrong++;
		}
		
		if (printCurrentWord(word, playGuesses)) {
			System.out.println("\nCONGRATS!!! You have won the game!");
			break;
		 }
		System.out.print("\nEnter the word you think it is -->");
		if(keyboard.nextLine().equals(word)) {
			System.out.println("\nCONGRATS!!! You have won the game!");
			break;
		 }
		else {
			System.out.println("WARNING!!! You have entered the wrong word guess... try again!");
		}
		}
		
	}

	private static void printMan(int counterwrong) {
		System.out.println("  ---------");
		System.out.println(" |         |");
		System.out.println("           |");
		
		
		if (counterwrong >= 1) {
		System.out.println(" O");
		}
		if (counterwrong >= 2) {
		System.out.print("\\ ");
			if (counterwrong >= 3) {
				System.out.println("/");
		}
		else {
			System.out.println("");
		}
}
		
		
		if (counterwrong >= 4) {
			System.out.println(" |");
		}
		if (counterwrong >= 5) {
			System.out.print("/ ");
				if (counterwrong >= 6) {
					System.out.println("\\");
			}
			else {
				System.out.println("");
			}
		}
		System.out.println("");
		System.out.println("");
	}

	private static boolean getGuesses(Scanner keyboard, String word, List<Character> playGuesses) {
		System.out.print("\nPlease enter a letter -->");
		String charguess = keyboard.nextLine();
		playGuesses.add(charguess.charAt(0));
		
		return word.contains(charguess);
		
		
	}

	private static boolean printCurrentWord(String word, List<Character> playGuesses) {
		int counterright=0;
		for (int i=0; i<word.length(); i++) {
			if (playGuesses.contains(word.charAt(i))){
				System.out.print(word.charAt(i));
				counterright++;
			}
			else {
				System.out.print(" - ");
			}
		}
		System.out.println();
		
		return(word.length() == counterright);
	}

}
