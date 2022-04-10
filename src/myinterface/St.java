package myinterface;

public class St implements FootballPlayer {
	int reinforce;
	int speed;
	int acceleration;
	int agility;
	int struggle;
	@Override
	public int reinforce() {
		// TODO Auto-generated method stub
		return reinforce++;
	}
	@Override
	public int speed() {
		// TODO Auto-generated method stub
		return speed += 3;
	}
	@Override
	public int acceleration() {
		// TODO Auto-generated method stub
		return acceleration += 3;
	}
	@Override
	public int agility() {
		// TODO Auto-generated method stub
		return agility += 4;
	}
	@Override
	public int struggle() {
		// TODO Auto-generated method stub
		return struggle += 2;
	}
	

}
