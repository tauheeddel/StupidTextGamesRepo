import java.util.Scanner;
public class treeGame implements StupidTextGame{
	
	public String getName() {
		return "treeGame";
	}
	public void play(Scanner console) {
		System.out.print("You are walking through a forest.");
		System.out.print("A tree falls on you and you die.");
	}

}
