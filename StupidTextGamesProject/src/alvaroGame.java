import java.util.Scanner;
import java.util.Random;

public class alvaroGame implements StupidTextGame {
	
	public String getName() {
		return "LotteryNumChecker";
	}
	
	public void play(Scanner console) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery number");
		int yourNumber = input.nextInt();
		
		Random randGen = new Random();	
		int lotteryNumber = randGen.nextInt(100) + 1;
		if (lotteryNumber == yourNumber) {
			System.out.println("Congratulations! You won the lottery");
		} else {
			System.out.println("We are sorry, you did not win!");
		}
		
	
	}
	
	
}
