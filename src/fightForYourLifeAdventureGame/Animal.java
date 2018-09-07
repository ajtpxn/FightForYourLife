package fightForYourLifeAdventureGame;

import java.util.Scanner;

public class Animal {
	
	private int animalHealthAnimal = 0;
	private int playerHealthAnimal = 100;
	private int damage = 0;
	private String name = null;

	public int getHealth() {
		return animalHealthAnimal;
	}

	public void setHealth(int health) {
		this.animalHealthAnimal = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public Animal(int health, int damage, String name) {
		super();
		this.animalHealthAnimal = health;
		this.damage = damage;
		this.name = name;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fight(String name, int playerHealth, int animalHealth) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You see an amazing treasure in the distance \n"
				+ "and start moving toward it but then you encouter a \n" + name
				+ " between you and the treasure. It wants to fight. ");
		Fight fight = new Fight();
		boolean stayFightAnimal = true;
		while (stayFightAnimal) {
			System.out.println("Would you like to ");
			System.out.println("1. Flee ");
			System.out.println("2. Punch ");
			System.out.println("3. Knife ");
			int choice = scanner.nextInt();
			if (choice == 1) {
				stayFightAnimal = fight.flee(playerHealth, animalHealth, damage);
			}
			else if (choice == 2) {
				stayFightAnimal = fight.punch(playerHealth, animalHealth, damage);
			}
			else if (choice == 3) {
				stayFightAnimal = fight.knife(playerHealth, animalHealth, damage);
			}
			else {
				System.out.println("Invalid option. Please choose 1, 2, or 3.");
			}
		}
	}


}
