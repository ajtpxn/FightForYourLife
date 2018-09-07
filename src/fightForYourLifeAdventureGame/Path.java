package fightForYourLifeAdventureGame;

import java.util.Scanner;

public class Path {
	
	private int path = 0;

	public int getPath() {
		return path;
	}

	public void setPath(int path) {
		this.path = path;
	}

	public Path(int path) {
		super();
		this.path = path;
	}

	public void fight() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to ");
		System.out.println("1. Flee ");
		System.out.println("2. Punch ");
		System.out.println("3. Knife ");
		int choice = scanner.nextInt();
		if (choice == 1) {
			
		}
		else if (choice == 2) {
			
		}
		else if (choice == 3) {
			
		}
		else {
			System.out.println("Invalid option. Please choose 1, 2, or 3.");
		}
	}
	
	

}
