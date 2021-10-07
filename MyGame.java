package monsterProject;

public class MyGame implements Game {


	public static void main(String[] args) {										
		MyGame game = new MyGame();
		game.play();


	}	

	public MyPlayer player;
	public MyBattle fight1;
	public MyBattle fight2;
	public MyBattle fight3;
	public MyRoom[] dungeon;
	private MyMonster monster1;
	private MyMonster monster2; 
	private MyMonster monster3;
	private MyRoom room1;
	private MyRoom room2;
	private MyTreasureRoom treasureRoom;

	public MyGame() {


		player = new MyPlayer("Player", "A powerful warrior", 100, 15, 30);				
		monster1 = new MyMonster("Orc","who's covered with green blood", 20,5,0);
		monster2 = new MyMonster("Skeleton","who moves very funny", 40,10,10);
		monster3 = new MyMonster("Fire Dragon","who spits fire with each breath", 100,20,40 );
		fight1 = new MyBattle(player, monster1);
		fight2 = new MyBattle(player, monster2);
		fight3 = new MyBattle(player, monster3);
		room1 = new MyRoom(0,"a room with an unbearable smell",monster1);
		room2 = new MyRoom(1,"a room that is dark and cold",monster2);
		treasureRoom = new MyTreasureRoom(2,"a room with a giant hall with something shiny on the other end",monster3,"a large pile of gold");
		dungeon = new MyRoom[] {room1,room2,treasureRoom};
	}


	@Override
	public void play() {

		if(monster1.isAlive()) {			//MyCreature class
			room1.enter(player);			//MyRoom class
			fight1.run();					//MyBattle class

		}
		if(monster2.isAlive()) {
			room2.enter(player);
			fight2.run();
		}
		if(monster3.isAlive()) {
			treasureRoom.enter(player);
			fight3.run();
		}
		if(monster3.isAlive() == false) {
			System.out.println();
			System.out.print("VICTORY! You defeated all the monsters and found the hidden treasure! ... " + treasureRoom.getTreasure() +"!");
		}
	}
}
