// Authors: Jason Szara, Sam Cregan

import java.util.Random;
import java.util.Scanner;

public class CoinFlip implements StupidTextGame {
	
	public String getName() {
		return "CoinFlip";
	}
	
	public void play(Scanner console) {
		Random coin = new Random();
		int flip = coin.nextInt(2);
		if (flip == 0) {
			System.out.println("Tails, you win.");
		} else {
			System.out.println("Heads, you lose.");
		}
	}
	

}
