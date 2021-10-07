package monsterProject;
public class MyCreature implements Creature {

	private String name;
	private String description;
	private int hitPoints;
	private int damage;
	private MyRoom room;


	public MyCreature() {
		name = "";
		description = "";
		hitPoints = 0;
		damage = 0;
		room = null;
	}
	public MyCreature (String name, String description,int hitPoints, int damage ) {
		this.name = name;
		this.description = description;
		this.hitPoints = hitPoints;
		this.damage = damage;
	}

	public MyRoom getRoom() {
		return room;
	}
	public void setRoom(MyRoom room) {
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getHitPoints() {
		return hitPoints;
	}
	public void setHitPoints(int hitPoints) {
		this.hitPoints = this.hitPoints + hitPoints;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	@Override
	public String toString() {
		return String.format( "name %15s, description %20s, hitPoints %03d, damage %02d", name, description, hitPoints, damage);
	}


	public void attack(MyCreature creature) {
		System.out.println(this.getName() +" attacks " + creature.getName() + " dealing damage: " +this.getDamage());
	}
	@Override
	public void takeDamage(int damage) {

		if (damage>hitPoints) {
			damage = hitPoints;
		}

		this.hitPoints = this.hitPoints - damage;
		if (this.hitPoints < 0) {
			this.hitPoints = 0;
		}

		System.out.println(getName()+ " has lost " + damage + " health");
	}

	@Override
	public boolean isAlive() {
		if(hitPoints>0) {
			return true;
		}
		return false;
	}
}


