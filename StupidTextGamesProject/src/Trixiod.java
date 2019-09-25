import java.util.Random;
import java.util.Scanner;

public class Trixiod implements StupidTextGame {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Trixoid";
	}

	@Override
	public void play(Scanner console) {
		Random randGen = new Random();		
		int randomnum = randGen.nextInt(100);
		if (randomnum < 50) {
			System.out.println("You are under 50");
		} else {
			System.out.println("You are above 50");
		}	

	}

}
