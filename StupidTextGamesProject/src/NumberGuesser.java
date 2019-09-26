/**
 * 
 * @author Jordan Thompson
 *
 */
import java.util.Random;
import java.util.Scanner;


public class NumberGuesser implements StupidTextGame {

	public String getName() {
		return "Number Guesser";
	}
	
	public void play(Scanner console) {
		Random rand = new Random();
		
		int num = rand.nextInt(100) + 1;
		int guesses = 0;
		boolean win = false;
		
		while (guesses < 3 && !win) {
			System.out.println("Guess a number between 0 and 100: ");
			int currentGuess = console.nextInt();
			if (currentGuess == num) {
				win = true;
			}
		}
		
		if (win) {
			System.out.println("You guessed the number!");
		} else {
			System.out.println("You did not guess the number! Try Again!");
		}
	}
	
}
