package myobj;

import java.util.Random;


public class Sheep implements Comparable<Sheep>{
	
	private static Random ran = new Random();
	
	public int sheep_Num;
	public int height;
	public int weight;
	private static int num = 0;
	public Sheep() {
		sheep_Num = num++;
		height = ran.nextInt(120 + 40);
		weight = ran.nextInt(130 + 50);
		
		
	}
	
	public String toString() {
		return String.format("%d번 양의 키: %d, 몸무게:%d\n",sheep_Num ,height ,weight);
		
	}
	@Override
	public int compareTo(Sheep o) {
		
		return this.height - o.height != 0 ? 
				this.height - o.height : this.sheep_Num - o.sheep_Num;
	}
	

}

