package fightForYourLifeAdventureGame;

import java.util.Scanner;

public class GameLoop {

	public static void main(String[] args) {
		
		
		int playerHealth = 100;
		
		boolean stay = true;
		
		
		while (stay) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Welcome user! Your health is " + playerHealth + ". Please choose a kind of gear: ");
			System.out.println("1. Scuba");
			System.out.println("2. Jet Pack");
			System.out.println("3. No Gear");
			System.out.println("4. Quit");
			int choice = scanner.nextInt();
			if (choice == 1) {
				
				Gear scuba = new Gear(1);
				scuba.play(playerHealth, 1);
			}
			else if (choice == 2) {
				Gear jetPack = new Gear(2);
				jetPack.play(playerHealth, 2);
			}
			else if (choice == 3) {
				Gear noGear = new Gear(3);
				noGear.play(playerHealth, 3);
			}
			else if (choice == 4) {
				stay = false;
				System.out.println("Goodbye!");
			}
			else {
				System.out.println("Invalid option. Please choose 1, 2, or 3.");
			}
			System.out.println("Do you want to play again? (Y)es: ");
			String leave = scanner.next();
			if (leave.equals("y") || leave.equals("Y")) {
			}
			else {
				stay = false;
			}
		}
	}
}
