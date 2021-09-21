// @author Katelyn Dennis
import java.util.Scanner;

public class EverbodyWins implements StupidTextGame{

	public String getName() {
		return "Everbody Wins";
	}
	
	public void play(Scanner console) {
		System.out.println("I lied, nobody wins.");
		System.out.println("You lose :)");
	}
}
