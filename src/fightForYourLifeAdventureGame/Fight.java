package fightForYourLifeAdventureGame;

public class Fight {
	
	private int damageMultiplied = 0;
	
	public boolean flee(int playerHealthFight, int animalHealthFight, int damage) {
		damageMultiplied = 5*damage;
		playerHealthFight = playerHealthFight - damageMultiplied;
		animalHealthFight = animalHealthFight - 0;
		System.out.println("Player Health Fight: " + playerHealthFight);
		System.out.println("Animal Health Fight: " + animalHealthFight);
		System.out.println("You did 0 damage");
		System.out.println("The animal did "+ damageMultiplied + " damage");
		if (playerHealthFight <= 0 ) {
			System.out.println("You died!");
			return false;
		}
		else if (animalHealthFight <= 0) {
			System.out.println("You won and got the treasure!");
			return false;
		}
		else {
			System.out.println("stay");
			return true;
		}
	}
	public boolean punch(int playerHealthFight, int animalHealthFight, int damage) {
		damageMultiplied = 2*damage;
		playerHealthFight = playerHealthFight - damageMultiplied;
		animalHealthFight = animalHealthFight - 20;
		System.out.println("Player Health: " + playerHealthFight);
		System.out.println("Animal Health: " + animalHealthFight);
		System.out.println("You did 20 damage");
		System.out.println("The animal did "+ damageMultiplied + " damage");
		if (playerHealthFight <= 0 ) {
			System.out.println("You died!");
			return false;
		}
		else if (animalHealthFight <= 0) {
			System.out.println("You won and got the treasure!");
			return false;
		}
		else {
			System.out.println("stay");
			return true;
		}
	}
	public boolean knife(int playerHealthFight, int animalHealthFight, int damage) {
		playerHealthFight = playerHealthFight - 1*damage;
		animalHealthFight = animalHealthFight - 60;
		System.out.println("Player Health: " + playerHealthFight);
		System.out.println("Animal Health: " + animalHealthFight);
		System.out.println("You did 60 damage");
		System.out.println("The animal did "+ damage + " damage");
		if (playerHealthFight <= 0 ) {
			System.out.println("You died!");
			return false;
		}
		else if (animalHealthFight <= 0) {
			System.out.println("You won and got the treasure!");
			return false;
		}
		else {
			System.out.println("stay");
			return true;
		}
	}

}
