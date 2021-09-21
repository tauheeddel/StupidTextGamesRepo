import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LuckyNumber implements StupidTextGame {

    public String getName() {
        return "LuckyNumber";
    }

    public void play(Scanner console) {
        System.out.println("Number should range from 0-9");
        System.out.println("You can enter 100 to stop the game");

        int userNumber = 10;

        List<Integer> listofGuess = new ArrayList();

        listofGuess.add(0);
        listofGuess.add(1);
        listofGuess.add(2);
        listofGuess.add(3);
        listofGuess.add(4);
        listofGuess.add(5);
        listofGuess.add(6);
        listofGuess.add(7);
        listofGuess.add(8);
        listofGuess.add(9);

        while (userNumber != listofGuess.get(0)) {
            
            userNumber = console.nextInt();

            // reshuffle numbers
            Collections.shuffle(listofGuess);

            if (userNumber == 100) {
                System.out.println("The lucky number was " + listofGuess.get(0));
                break;
            }

            if (userNumber == listofGuess.get(0)) {
                System.out.println("Correct Guess!");
                break;
            } else {
                System.out.println("Wrong Guess! Try again next time");
            }

        }

    }

}
