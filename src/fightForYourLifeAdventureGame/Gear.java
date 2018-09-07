package fightForYourLifeAdventureGame;

import java.util.Scanner;

public class Gear {
	
	private int animalType = 0;

	public int getType() {
		return animalType;
	}

	public void setType(String type) {
		this.animalType = animalType;
	}

	public Gear(int type) {
		super();
		this.animalType = animalType;
	}
	
	public static void play(int playerHealth, int arena) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose a level of difficulty: ");
		System.out.println("1. Easy ");
		System.out.println("2. Hard ");
		System.out.println("3. Very Hard ");
		int choice = scanner.nextInt();
		String easyAnimalName = null;
		String hardAnimalName = null;
		String veryHardAnimalName = null;
		if ( arena == 1 ) {
			easyAnimalName = "clown fish";
			hardAnimalName = "shark";
			veryHardAnimalName = "octopus";
		}
		else if (arena == 2 ) {
			easyAnimalName = "chikadee";
			hardAnimalName = "owl";
			veryHardAnimalName = "eagle";
		}
		else if (arena == 3 ) {
			easyAnimalName = "pika";
			hardAnimalName = "giraffe";
			veryHardAnimalName = "lion";
		}
		if (choice == 1) {
			Animal easyAnimal = new Animal(10, 1, easyAnimalName);
			easyAnimal.fight(easyAnimal.getName(), playerHealth, easyAnimal.getHealth());
		}
		else if (choice == 2) {
			Animal hardAnimal = new Animal(49, 49, hardAnimalName);
			hardAnimal.fight(hardAnimal.getName(), playerHealth, hardAnimal.getHealth());
		}
		else if (choice == 3) {
			Animal veryHardAnimal = new Animal(100, 100, veryHardAnimalName);
			veryHardAnimal.fight(veryHardAnimal.getName(), playerHealth, veryHardAnimal.getHealth());
		}
		else {
			System.out.println("Invalid option. Please choose 1, 2, or 3.");
		}
		
	}

	
	

}
