// Rachel Montesano

import java.util.Scanner;

public class WrongNumberGame implements StupidTextGame {
	
	public String getName() {
		return "Wrong Number";
	}
	
	public void play(Scanner console) {
		System.out.println("Guess a number between 1 and 10: ");
		int guess = console.nextInt();
		
		if (guess == 10) {
			System.out.println("Sorry! The correct number is 1.");
		} else {
			guess++;
			System.out.println("So close! The correct number is " + guess);
		}
	}
	
}
