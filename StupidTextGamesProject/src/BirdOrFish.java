import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Name: Minh Nguyen
 *
 */

public class BirdOrFish implements StupidTextGame {
	
	public String getName() {
		return "BirdOrFish";
	}
	
	public void play(Scanner console) {
		String[] pick = {"Bird", "Fish"};
		Random rand = new Random();
		
		int index = rand.nextInt(pick.length);
		String choice = pick[index];
		
		if (choice.equals("Bird")) {
			System.out.println("You can flyyyy");
		}else {
			System.out.println("You can swimmmm");
		}
	}

}
