// Author: Jon Cathcart
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors implements StupidTextGame {

	@Override
	public String getName() {
		
		return "RockPaperScissors";
	}

	@Override
	public void play(Scanner console) {
		Random rand = new Random();
		
		List<String> list = new ArrayList<String>();
		list.add("Rock");
		list.add("Paper");
		list.add("Scissors");
		int rounds = 0;
		boolean win = false;
		
		
		while (win == false) {
			System.out.println("Pick Rock, Paper or Scissors ");
			String symbol = console.next();
			String randNum = list.get(rand.nextInt(list.size()));
			if (symbol == "Rock" && randNum == "Rock") {
				rounds++;
				System.out.println("You picked " + symbol + ", Computer chose " + randNum);
				win = true;
			}
			else if (symbol == "Paper" && randNum == "Paper") {
				rounds++;
				System.out.println("You picked " + symbol + ", Computer chose " + randNum);
				win = true;
			}
			else if (symbol == "Scissors" && randNum == "Scissors") {
				rounds++;
				System.out.println("You picked " + symbol + ", Computer chose " + randNum);
				win = true;
			}
			else {
				System.out.println("You picked " + symbol + ", Computer chose " + randNum + ". Try Again");
				rounds++;
			}
		}
		System.out.println("You won in " + rounds + "rounds!");
	}
	
	
}
