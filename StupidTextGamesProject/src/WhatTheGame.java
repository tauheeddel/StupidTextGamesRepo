// Name: Azee Nguyen

import java.util.*;

public class WhatTheGame implements StupidTextGame {
	
	public String getName() {
		return "WhatTheGame";
	}

	public void play(Scanner input) {

		System.out.print("Write something: ");

		String something = input.nextLine();

		System.out.println("Well, well, now we have " + something + " here!");

		Scanner answer = new Scanner(System.in);
		System.out.print("Do you want to have some fun with " + something + "? (Y/N)");
		String response = answer.nextLine().toLowerCase();

		if (response.equalsIgnoreCase("y")) {
			System.out.println("Tada, endgame!");
			System.exit(0);
		} else if (response.equalsIgnoreCase("n")) {
			System.out.println("Tada, endgame!");
			System.exit(0);
		} else {
			System.out.println("Boo !!, go away");
			System.exit(0);
		}

	}

}