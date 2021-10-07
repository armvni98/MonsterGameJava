package monsterProject;

public class MyRoom implements Room{

	private int roomIndex;
	private String description;

	private MyMonster monster;

	public MyRoom () {
		roomIndex = 0;
		description = "";
		monster = null;
	}


	public MyRoom (int roomIndex, String description, MyMonster monster) {
		this.description = description;
		this.roomIndex= roomIndex;
		this.monster= monster;
	}


	//SETTERS AND GETTERS
	public int getRoomIndex() {
		return roomIndex;
	}

	public void setRoomIndex(int roomIndex) {
		this.roomIndex = roomIndex;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public MyMonster getMonster() {
		return monster;
	}

	public void setMonster(MyMonster monster) {
		this.monster = monster;
	}

	@Override
	public boolean isComplete() {

		if (monster.isAlive() == false) {
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public void enter(MyPlayer player) {

		if (monster.isAlive()) {
			System.out.println(player.getName() + ", You've entered a " + this.description 
					+ ", and has a " + monster.getName() + ", " + monster.getDescription()); //FIXED ERROR NUMBER2		}
			// TODO Auto-generated method stub

		}




	}
}
