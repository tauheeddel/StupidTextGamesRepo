import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Created by: Minh Nguyen
 */

public class GuessTheDice implements StupidTextGame {
	
	public String getName() {
		return "GuessTheDice";
	}
	
	public void play(Scanner console) {
		System.out.println("                   WELCOME TO THE GUESSTHEDICE GAME");
		Random rand = new Random();
		int num = rand.nextInt(7);
		boolean win = false;
		int guesses = 0;
		
		while (guesses < 3 &&  !win) {
			System.out.println("Choose a number from the dice (1 - 6): ");
			int guess = console.nextInt();
			if (guess == num) {
				win = true;
			}
			guesses++;
		}
		
		if (win) {
			System.out.println("Congratulation! You win");
		} else {
			System.out.println("Unlucky! You lose");
		}
		
	}

}
