  package fly.test;

interface Movable{
	void move(int x, int y);
}

interface Attackable{
	void attack(Unit u);
}

class Unit{
	int currentHP;
	int x;
	int y;
}

interface Fightable extends Movable, Attackable{
	void goahead();
}

class Fighter implements Fightable{

	@Override
	public void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack(Unit u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void goahead() {
		// TODO Auto-generated method stub
		
	}
	
}

public class fighterTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
