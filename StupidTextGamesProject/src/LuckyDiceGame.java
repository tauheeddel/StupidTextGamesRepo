import java.util.Random;
import java.util.Scanner;

public class LuckyDiceGame implements StupidTextGame {

	@Override
	public String getName() {
		return "Lucky Dice Game";
	}

	@Override
	public void play(Scanner console) {
		Random randGen = new Random();		
		int roll = randGen.nextInt(6) + 1;
		System.out.println("You rolled " + roll);
		if (roll < 3) {
			System.out.println("Good and small, you win!");
		} else {
			System.out.println("Good and big, you win!");
		}	
	}

}
