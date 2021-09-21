/*
 * Nick Gerasch
 */
import java.util.Random;
import java.util.Scanner;

public class SimpleBlackJack implements StupidTextGame{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "BlackJack";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		
		
		int dealer = 0;
		int player = 0;
		boolean win = false;
		boolean dealerWin = false;
		for (int x = 0; x<4; x++) {
			if(x%2 == 0) {
				player+=rand.nextInt(11)+1;
			}else {
				dealer+=rand.nextInt(11)+1;
			}
		}
		if(dealer == 21) {
			System.out.print("Dealer has 21 and Wins.");
			
		}else if(player == 21) {
			System.out.print("Player has 21 and Wins.");
		}
		
		while (player < 21 && !win && !dealerWin) {
			System.out.println("You have "+player+" Dealer has "+ dealer);
			System.out.println("Hit or Stand? ");
			String currentGuess = console.nextLine();
			if (currentGuess.equals("Hit")) {
				int num = rand.nextInt(11) + 1;
				player+=num;
				if(player>21) {
					dealerWin=true;
				}
			}else if(currentGuess.equals("Stand")|| currentGuess.equals("stand")) {
				if (player>dealer && player<=21) {
					System.out.print("Player Wins.");
					win=true;
				}else {
					System.out.print("Dealer Wins");
					dealerWin=true;
				}
			}
			
		}
	}

}
