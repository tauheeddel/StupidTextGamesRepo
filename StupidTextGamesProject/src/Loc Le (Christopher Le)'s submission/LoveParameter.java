import java.util.Scanner;

public class LoveParameter {
	public static void main(String[] args) {
		
		Scanner name_input = new Scanner(System.in);
		String name;
		int point = 0; 
		System.out.println("Enter your name: ");
		name = name_input.nextLine();
		
		System.out.println("Welcome to Love parameter game, " + name + "!");
		
		Scanner first = new Scanner(System.in); 
		String first_name; 
		String second_name;
		
		System.out.println("Please enter the first person's name: "); 
		first_name = first.nextLine();
		
		Scanner second = new Scanner(System.in); 
		System.out.println("Please enter the second person's name: ");
		second_name = second.nextLine(); 
		
		int first_len = first_name.length();
		int second_len = second_name.length();
		
		String[] string_first = first_name.split("");
		String[] string_second = second_name.split("");
		
		String S1 = string_first[0].toLowerCase();
		String S2 = string_second[0].toLowerCase();
		
		System.out.println(first_len);
		System.out.println(second_len);
		if (first_len == second_len) { 
			point += 20; 
		}
		
		if (S1 == "a" || S1 == "e" || S1 == "i" || S1 == "o" || S1 == "u") {
			point += 5;
		} else {
			point += 2.5;
		} 
		
		if (S2 == "a" || S2 == "e" || S2 == "i" || S2 == "o" || S2 == "u") {
			point += 5;
		} else {
			point += 2.5;
		}
		
		System.out.println("Your couple's love score is: " + point);
		
		
		
		
		
		

		
	}	
}

