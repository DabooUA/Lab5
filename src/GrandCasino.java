import java.util.Random;
import java.util.Scanner;

/**
 * @author Serhiy Bardysh
 *
 */
public class GrandCasino {

	public static void main(String[] args) {

		Scanner scnr = new Scanner(System.in);
		int userInput = 0;
		int dieNum1 = 0;
		int dieNum2 = 0;
		String choice = "y";
		System.out.println("Welcome to the Grand Circus Casino!");
		System.out.println();
		System.out.print("How many sides should each die have?: ");

		userInput = scnr.nextInt();
		
		while (choice.equalsIgnoreCase("y")) {		
		
		dieNum1 = rollDice(userInput);
		dieNum2 = rollDice(userInput);
		System.out.println();
		System.out.println(dieNum1);
		System.out.println(dieNum2);
		
		scnr.nextLine();
		
		System.out.println("Roll again?: ");
		choice = scnr.nextLine();
		}
		
		System.out.println("Come back later to try you luck again!!!!");
		scnr.close();
	}

	public static int rollDice(int userInput) {
		
		int roll= 0;
		int nSides = userInput;
		if (nSides >= 3) {
			for (int i = 0; i < userInput; i++) {
				Random rnd = new Random();
				roll = rnd.nextInt(userInput-1)+1;
						}
		} else {
			System.out.println("Error!!! Number needs to be from 3");

		}
		return roll;
	}
}
