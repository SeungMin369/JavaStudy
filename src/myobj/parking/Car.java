package myobj.parking;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Random;

public class Car {
	static Random ran = new Random();
	static char[] types = {'H', 'Y', 'S', 'N', 'T', 'L', 'B'};
	
	String number;
	char type;
	private LocalDate park_date;
	
	public Car() {
		this.number = String.format("%04d", ran.nextInt(10000));
		this.type = types[ran.nextInt(types.length)];
		this.park_date = 
				LocalDate.of(genRandomYear(),genRandomMonth(), 1);
		this.park_date = 
				park_date.plusDays(ran.nextInt(park_date.lengthOfMonth()));		
			
		
	}
	
	private int genRandomYear() {
		return ran.nextInt(4) + 2017;
	}
	
	private int genRandomMonth() {
		return ran.nextInt(12) + 1;
	}
	
	private int genRandomDate() {
		return ran.nextInt(31) + 1;
	}
	
	public LocalDate getPark_date() {
		return park_date;
	}
	
	@Override
	public String toString() {
		
		return String.format("[%s/%c/%s]", number, type, park_date);
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < 100; ++i) {
			System.out.println(i + ": " + new Car());
		}
	}
}






















