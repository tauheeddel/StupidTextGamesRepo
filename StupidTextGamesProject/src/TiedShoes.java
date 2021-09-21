import java.util.Random;
import java.util.Scanner;

public class TiedShoes  implements StupidTextGame {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TiedShoes";
	}

	@Override
	public void play(Scanner console) {
		// TODO Auto-generated method stub
		Random shoes = new Random();
		int status = shoes.nextInt(2);
		if(status == 0 || status == 2) {
			System.out.println("shoes are untied.");
		}else {
			System.out.println("shoes are tied.");
		}

		
	}
	
	
	

}
