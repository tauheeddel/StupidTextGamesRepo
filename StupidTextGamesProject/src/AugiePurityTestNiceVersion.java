import java.util.Random;
import java.util.Scanner;

public class AugiePurityTestNiceVersion implements StupidTextGame {
	
	public String getName() {
		return "Augie Purity Test (Nice Version)";
	}
	
	public void play(Scanner console) {
		System.out.print("Enter Your Name: ");
		String userName = console.next();
		
		
		Random rand = new Random();
		int randChoice = rand.nextInt(5) + 1;
		String question = "Random Q: ";
		String scoredAnswer = "";
		
		switch(randChoice) {
		case 1:
			question += "Held hands romantically?";
			scoredAnswer = "Y";
			break;
		case 2:
			question += "Been on a date?";
			scoredAnswer = "Y";
			break;
		case 3:
			question += "Danced without leaving room for Jesus?";
			scoredAnswer = "Y";
			break;
		case 4:
			question += "Kissed a non-family member?";
			scoredAnswer = "Y";
			break;
		case 5:
			question += "?";
			scoredAnswer = "N";
			break;
		}
		
		System.out.println("Answer with [Y/N]");
		System.out.println(question);
		String answer = console.next();
		if (answer.equals(scoredAnswer)) {
			System.out.println("Ok " + userName + " I got chu! 100/100");
		} else {
			System.out.println("Nice " + userName + "! Hope you keep that way :>");
		}
	}
}
