// Author: Hoang Nhi
import java.util.Scanner;
import java.util.Random;

public class SimpleCraps implements StupidTextGame{

	public String getName()
	{
		return "Simple Craps";
	}
	
	public void play(Scanner console)
	{
		Random randGen = new Random();
		int firstRoll = randGen.nextInt(6) + 1;
		int secondRoll = randGen.nextInt(6) + 1;
		
		System.out.println("Welcome shooter!!!");
		System.out.println("If you roll 7 or 11, you win.");
		System.out.println("Else, you lose.");
		
		int sum = firstRoll + secondRoll;
		System.out.println("\nYou roll" + sum);
		if (sum == 7 || sum == 11)
			System.out.println("You win !!!");
		else
			System.out.println("LOSER !!!");
		
	}
}
