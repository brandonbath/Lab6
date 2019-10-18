package co.grandcircus;

import java.util.Scanner;

public class LabNumber6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String contString = "yes";
		while (contString.equalsIgnoreCase("yes")) {

			// ask user to input sides of die
			System.out.println("Please enter the number of sides of the die.");
			int dieSides = scan.nextInt();
			System.out.println("Number of sides per die: " + dieSides + ".");
			
			// calling the generateRandomDieRoll method
			int random1 = generateRandomDieRoll(dieSides);
			int random2 = generateRandomDieRoll(dieSides);

			
			System.out.println("Roll 1 = " + random1 + ".");
			System.out.println("Roll 2 = " + random2 + ".");

			// prompts if user wants to continue or not
			System.out.println("Roll again? (yes/no)");
			contString = scan.next();

		}
		scan.close();
		System.out.println("Goodbye");
	}

	public static int generateRandomDieRoll(int sides) {
		int random = (int) (Math.random() * sides) + 1;
		return random;

	}
}

// Ask the user to ender the number of sides for the dice
// Prompt user to roll dice
// Roll two of those dice
// Ask user if they want to roll again

// Create method called generateRandomDieRoll
// w/ Parameters : specifies number of sides on a die
// and returns random number between 1 and number of sides of die

// Call method generateRandomDieRoll for each die that is rolled (twice)
