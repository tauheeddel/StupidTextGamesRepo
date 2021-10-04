import java.util.Random;
import java.util.Scanner;

public class BaseballGame implements StupidTextGame {
	public String getName() {
		return "BaseballGame";
	}
	
	public void play(Scanner console) {
		Scanner console1 = new Scanner(System.in);
		System.out.print("Type a 1 to swing the bat: ");
		String swing = console1.nextLine();
		Random pitch = new Random();
		int location = pitch.nextInt(2);
		if (location == 0 ) {
			System.out.println("Strike!");
		}
		else {
			System.out.println("Home Run!");
		}
	}
}
