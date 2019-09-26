/**
 * @author Trang Hoang
 */
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame implements StupidTextGame{

	@Override
	public String getName() {
		return "Random Number";
	}

	@Override
	public void play(Scanner console) {
		Random rand = new Random();		
		int number = rand.nextInt(50) + 1;
		System.out.println("Guess a number from 1 to 50");
		int guess = console.nextInt();
		while(guess != number) {
			System.out.println("You guess wrong");
			System.out.println("Guess a number from 1 to 50");
			guess = console.nextInt();
		}
		System.out.println("You WIN");
	}

}
