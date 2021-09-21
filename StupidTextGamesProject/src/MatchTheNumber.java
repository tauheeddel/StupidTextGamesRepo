import java.util.Scanner;
import java.util.Random;

/**
 * 
 * @author Minh Nguyen
 *
 */
public class MatchTheNumber implements StupidTextGame{
	
	public String getName() {
		return "MatchTheNumber";
	}
	
	public void play(Scanner console) {
		Random rand = new Random();
		int num = rand.nextInt(100);
		System.out.println("Choose number 1: ");
		int num1 = console.nextInt();
		System.out.println("Choose number 2: ");
		int num2 = console.nextInt();
		if ((num1 + num2) > num) {
			System.out.println("You Winnn!");
		}else {
			System.out.println("You Loseee!");
		}
	}
}
