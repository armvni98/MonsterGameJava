package monsterProject;

public interface Room {
	
	void enter(MyPlayer player);
	
	boolean isComplete();
	
	java.lang.String toString();

}
