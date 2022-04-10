package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;

public class MyMapleStory extends JButton {
	
	int value;
	
	public static String slot1;
	public static String slot2;
	public static String slot3;
	
	
	static Random ran = new Random();
	
	public MyMapleStory() {
		super();
		
		setText("±¼¸®±â!" + value);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				int str = ran.nextInt(7) + 1;
				int INT = ran.nextInt(7) + 1;
				int dex = ran.nextInt(7) + 1;
				int luk = ran.nextInt(7) + 1;
				int atk = ran.nextInt(3) + 1;
				ArrayList<Integer> ab = new ArrayList<>();
				for (int i = 0; i < 3; ++i) {
					int num = ran.nextInt(5) + 1;
					if (num == 1) {
						ab.add(str);
					} else if (num == 2) {
						ab.add(INT);
					} else if (num == 3) {
						ab.add(dex);
					} else if (num == 4) {
						ab.add(luk);
					} else if (num == 5) {
						ab.add(atk);
					}
				}
				
				slot1 = "" + ab.get(0);
				slot2 = "" + ab.get(1);
				slot3 = "" + ab.get(2);
				
				
				((JButton) e.getSource()).setText("" + ++value + "¹ø ±¼¸®¼Ë½À´Ï´Ù.");
				
				
			}
		});
	}
}
