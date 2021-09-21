/**
 * created by: Viet Nguyen 19
 */
import java.util.Random;
import java.util.Scanner;

public class GetGoodDayQuotesGame implements StupidTextGame{

	public String getName() {
		return "Get Good Day Quotes";
	}
	
	public void play(Scanner console) {
		System.out.print("What is your name? ");
		console.nextLine();
		String userName = console.nextLine();
		System.out.println("Hi " + userName + ", your quote today is:");
		getQuotes();
		System.out.println();
		
		System.out.println("Have a great day! See you again.");
		
	}
	
	private void getQuotes() {
		Random myRand = new Random();
		String[] quotes = {
				"We all make a beauty so wonderfully true.\r\n"
				+ "We are special and different, and just the same, too!",
				"Seven, Richie thought. That's the magic number. There has to be seven of us. That's the way it's supposed to be.",
				"Good luck is a residue of preparation.",
				"It really is better to be lucky than to be good.",
				"Sometimes, you haven't been lucky enough to experience the luck, Because you are truly blessed to experience the blessings.",
				"Today it is hard to live, because everything depends on luck.\r\n"
				+ "Things that were happening in our lives daily.\r\n"
				+ "Are now opportunities.",
				"Lucky are those who can choose how to spend their time and who to spend it with.",
				"To reach the future, man needs to be clever and more important than this he must be lucky!",
				"And here’s wishing you the very best for all the new ventures, that life has in store for you.",
				"It’s kind of fun to do the impossible. All the best."
		};
		System.out.println(quotes[myRand.nextInt(quotes.length)]);
	}
}
