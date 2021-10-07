package monsterProject;

public class MyTreasureRoom extends MyRoom implements Room {

	private String treasure;

	public String getTreasure() {
		return treasure;
	}

	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}

	public MyTreasureRoom(int roomIndex, String description, MyMonster monster, String treasure) {
		super(roomIndex, description, monster);
		this.treasure = treasure;
	}

	public void	enter​(MyPlayer player) {

		if (getMonster().isAlive()) {
			System.out.println(player.getName() + " This Room is " + this.getDescription() + " and has " + this.getMonster());	
		}
		// When all of the monsters are dead, you proceed to the treasure room
		else {
			System.out.print("You explored the room and found the hidden treasure! " + this.treasure);
		}


	}

}


