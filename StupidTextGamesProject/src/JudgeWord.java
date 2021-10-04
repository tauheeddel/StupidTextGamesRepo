/*
 * @author AJ Carmine
 */
import java.util.Random;
import java.util.Scanner;
public class JudgeWord implements StupidTextGame {
	public String getName() {
		return "Judge Word";
	}
	public void play(Scanner console) {
		System.out.println("enter a word");
		Scanner scanner = new Scanner(System.in); 
		String word; 
		word = scanner.nextLine();
		if (word.charAt(0) == 'a') {
				System.out.println("I like your word");
		}
		else {
			System.out.println("I don't like your word");
		}

	}

}
