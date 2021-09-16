import java.util.Random;
import java.util.Scanner;

public class HigherOrLower implements StupidTextGame
{
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Higher or Lower";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		String s = "y";
		int points = 0;
		while(s.equals("y"))
		{
			int num1 = rand.nextInt(10) + 1;
			int num2 = rand.nextInt(10) + 1;
			
			System.out.println("\n"+num1);
			System.out.println("H or L: ");
			String guess = console.next();
			System.out.println(num2);
			if(guess.equals("H"))
			{
				if(num2>=num1)
				{
					points += 1;
					System.out.println("Points: "+ points);
				}
				else
				{
					s = "n";
					System.out.println("GAME OVER");
				}
			}
			else if(guess.equals("L"))
			{
				if(num2<=num1)
				{
					points += 1;
					System.out.println("Points: "+ points);
				}
				else
				{
					s = "n";
					System.out.println("GAME OVER ");
					System.out.println(" You finished with Points: "+ points);
				}
			}
		}
	}
	
}
