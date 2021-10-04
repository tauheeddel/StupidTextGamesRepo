import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class StupidTextGameLauncher {

	public static void main(String[] args) {
		//Added a comment by Tauheed
		List<StupidTextGame> games = new ArrayList<>();
		games.add(new UnluckyDiceGame());
		games.add(new ChickenTossGame());
		games.add(new LuckyDiceGame());
		games.add(new Trixiod());
  	games.add(new NumberGuesser());
		games.add(new NumberGuesser());
		games.add(new GuessPrimeGame());
		games.add(new EverbodyWins());
		games.add(new AugiePurityTestNiceVersion());
		games.add(new HigherOrLower());
		games.add(new treeGame());
		games.add(new DungeonEscape());
		games.add(new MayosGame());
		games.add(new WelcomeToHassanGame());
		games.add(new alvaroGame());
		games.add(new BaseballGame());
		games.add(new StupidZombieGame());
		games.add(new SimpleBlackJack());
		games.add(new ChickenCrossRoad());
		games.add(new LuckyNumber());
		games.add(new DungeonEscape());
		games.add(new WrongNumberGame());
		games.add(new WhatTheGame());
		games.add(new TiedShoes());
		games.add(new DungeonEscape());
		games.add(new GetGoodDayQuotesGame());
		games.add(new MotivationalQuotes());
		

		System.out.println("Choose a stupid text game:");

    for (int i = 0; i < games.size(); i++) {
			System.out.println((i+1) + ": " + games.get(i).getName());
		}
		
		Scanner console = new Scanner(System.in);
		int choice = console.nextInt();
		StupidTextGame chosenGame = games.get(choice-1);
		chosenGame.play(console);
	}

}


