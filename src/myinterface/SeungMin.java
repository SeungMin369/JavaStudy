package myinterface;

public class SeungMin implements Human {
	double height = 30;
	int weight = 3;
	int age = 0;
	int muscle = 5;

	@Override
	public double height() {
		// TODO Auto-generated method stub
		return height += 7.5;
	}

	@Override
	public int weight() {
		// TODO Auto-generated method stub
		return weight += 4;
	}

	@Override
	public int age() {
		// TODO Auto-generated method stub
		return age += 1;
	}

	@Override
	public int muscle() {
		// TODO Auto-generated method stub
		return muscle += 1;
	}

}
