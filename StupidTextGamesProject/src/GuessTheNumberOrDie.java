import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Created by Minh Nguyen
 */

public class GuessTheNumberOrDie implements StupidTextGame {
	public String getName() {
		return "GuessTheNumberOrDie";
	}
	
	public void play(Scanner console) {
		Random rand = new Random();
		int num = rand.nextInt(10);
		boolean win = false;
		int guesses = 0;
		
		while (guesses < 3 &&  !win) {
			System.out.println("Choose a number between 0 - 10");
			int guess = console.nextInt();
			if (guess == num) {
				win = true;
			}
			guesses++;
		}
		
		if (win) {
			System.out.println("You win!");
		} else {
			System.out.println("You die!");
		}
		
	}

}
