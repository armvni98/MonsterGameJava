//ALL DONE
package monsterProject;

public class MyMonster extends MyCreature implements Monster {
	private boolean isEnraged =false;;
	private int enrageThreshold;

	public MyMonster() {
		enrageThreshold = 0;
		isEnraged = false;
	}

	public MyMonster(String name, String description, int hitPoints, int damage, int enrageThreshold ) {
		super(name, description,hitPoints,damage);
		this.enrageThreshold = enrageThreshold;

	}

	public void setEnraged(boolean isEnraged) {
		this.isEnraged = isEnraged;
	}

	public int getEnrageThreshold() {
		return enrageThreshold;
	}

	public void setEnrageThreshold(int enrageThreshold) {
		this.enrageThreshold = enrageThreshold;
	}

	
	public void enrage() {
		if(!isEnraged && this.getHitPoints()>0)	{
			setDamage(getDamage() * 2);
			isEnraged = true;
			System.out.println("THE " + getName().toUpperCase() +  " HAS ENRAGED!");
			System.out.println();

		}
	}

	//This method returns true if monster hitPoints falls below this.enrageThreshold.

	public boolean canEnrage() {
		if (getHitPoints() < enrageThreshold) {


			System.out.println("HIT POINTS:" + getHitPoints() + "   |   ENRAGETHRESHOLD:" + enrageThreshold );
			System.out.println();
			return true;
		}
		return false;
	}

}


