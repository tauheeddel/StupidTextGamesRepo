import java.util.Random;
import java.util.Scanner;

public class StupidZombieGame implements StupidTextGame{

	public String getName() {
		return "Stupid Zombie Game";
	}
	
	public void play(Scanner console) {
		System.out.println("Enter 1 to stab the zombie, Enter 2 to shoot the zombie, or Enter 3 to run away");
		int option = console.nextInt();
		if (option < 1 || option > 3) {
			System.out.println("Please enter a valid option");
			option = console.nextInt();
		}
		if (option == 1) {
			System.out.println("You stabbed the zombie quietly and got away! You Win!");
		} else if (option == 2) {
			System.out.println("You shot the zombie, but more zombies quickly came and you couldn't get away! You Lose!");
		} else {
			System.out.println("Instead of getting violant with the zombie you decided to flee. You Win!... but at what cost?");
		}
	}
}
