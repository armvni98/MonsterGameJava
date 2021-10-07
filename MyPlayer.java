package monsterProject;

public class MyPlayer extends MyCreature implements Player, Creature {


	private int healAmount;			


	public MyPlayer() {
		healAmount = 0;
	}

	//SETTERS AND GETTERS
	public int getHealAmount() {
		return healAmount;
	}

	public void setHealAmount(int healAmount) {
		this.healAmount = healAmount;
	}

	public MyPlayer(String name, String description, int hitPoints, int damage, int healAmount) {
		super(name, description, hitPoints, damage);
		this.healAmount = healAmount;


	}

	@Override
	public void heal() {
		// TODO Auto-generated method stub

		setHitPoints(healAmount);

		System.out.println(this.getName() + " is healed by " + this.healAmount);

	}




}


