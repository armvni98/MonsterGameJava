package monsterProject;

public interface Creature {

	void attack(MyCreature creature);
	
	void takeDamage(int damage);
	
	boolean isAlive();
	
	java.lang.String toString();
}
