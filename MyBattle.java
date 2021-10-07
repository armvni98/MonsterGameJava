package monsterProject;

import java.util.Scanner;

public class MyBattle implements Battle {
	private MyPlayer player;
	private  MyMonster monster;
	Scanner scnr = new Scanner(System.in);
	private String input;


	public MyBattle(MyPlayer player, MyMonster monster) {

		this.player = player;
		this.monster = monster;

	}

	public void run() {		
		System.out.println("");
		System.out.println("A battle will begin... " + player.getName() + " vs " + monster.getName());

		while(monster.isAlive() == true && player.isAlive() == true) {
			System.out.println("-------------------------------------------------------------");
			System.out.println(player.getName() + ": " + player.getHitPoints() + " vs " + monster.getName() + ": " + monster.getHitPoints());
			System.out.println(player.getName() + "'s turn.....");
			System.out.println("Would you like to Attack(a) or Heal(h) ");
			System.out.println("-------------------------------------------------------------");

			input = scnr.next();
			if(input.equalsIgnoreCase("a")) {
				player.attack(monster);
				monster.takeDamage(player.getDamage());


				if (monster.isAlive() == true) {					 
					System.out.println("------------------------------------------------------");   
					System.out.println(monster.getName() + "'s turn....");
					System.out.println("------------------------------------------------------");

					if(monster.canEnrage()) {
						monster.enrage();
						monster.attack(player);
						player.takeDamage(monster.getDamage());
					}
					else {
						monster.attack(player);

						player.takeDamage(monster.getDamage());
					}
				}


			}

			else if (input.equalsIgnoreCase("h")) {
				player.heal();

			}

			else {

				System.out.println("-------------------------------------------");
				System.out.println("That's not a valid input");
				System.out.println("--------------------------------------------");  

			}


			if(monster.isAlive() == false) {
				System.out.println("---------------------------------------------");
				System.out.println("Creature has DIED");
				System.out.println("---------------------------------------------");
				//If monster dies, you continue the battle until you reach treasure room
			} 
			else if (player.isAlive() == false) {
				// if player is dead print you lose
				System.out.println("-------------------------------------------------------"); 
				System.out.println("You've been DESTROYED");
				System.out.println("--------------------------------------------------------");

			} 

		}
	}
}