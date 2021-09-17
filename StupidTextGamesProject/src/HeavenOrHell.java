import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Name: Minh Nguyen
 *
 */

public class HeavenOrHell implements StupidTextGame {
	
	public String getName() {
		return "HeavenOrHell";
	}
	
	public void play(Scanner console) {
		String[] pick = {"Heaven", "Hell"};
		Random rand = new Random();
		
		int index = rand.nextInt(pick.length);
		String choice = pick[index];
		
		if (choice.equals("Hell")) {
			System.out.println("Its Hell!!! You die");
		}else {
			System.out.println("ITS Heaven!!! You live");
		}
	}

}
