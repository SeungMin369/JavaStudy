package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.StudyFrame;

public class GridPuzzle extends StudyFrame {
	/*
	  	16칸 짜리 퍼즐 게임 만들어라
	*/
	static ArrayList<JButton> btns1 = new ArrayList<>();
	static ArrayList<JButton> btns2 = new ArrayList<>();
	
	public GridPuzzle() {
		super();
		
			
		setLayout(new BorderLayout());
		
		
		JPanel center_panel = new JPanel();
//		JPanel south_panel = new JPanel();
		
		add(center_panel, "Center");
//		add(south_panel, "South");
		
		center_panel.setLayout(new GridLayout(4, 4));
//		south_panel.setLayout(new GridLayout(1, 4));
		
		for (int i = 0; i < 15; ++i) {
			JButton btn = new JButton("" + i);
			btns1.add(btn);
			btns1.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(e.getActionCommand());
					JButton btn = new JButton("");
					
					if (btns1.get(num + 4).equals("")) {
						center_panel.add(btns1.get(num), num + 4);
						center_panel.add(btn, num);
					} else if (btns1.get(num - 4).equals("")) {
						center_panel.add(btns1.get(num), num - 4);
						center_panel.add(btn, num);
					} else if (btns1.get(num + 1).equals("")) {
						center_panel.add(btns1.get(num), num + 1);
						center_panel.add(btn, num);
					} else if (btns1.get(num - 1).equals("")) {
						center_panel.add(btns1.get(num), num - 1);
						center_panel.add(btn, num);
					}
					
				}
			});
			center_panel.add(btns1.get(i));
		}
		
		btns1.add(new JButton(""));
		btns1.get(15).setBackground(new Color((int)(Math.random() * 0x000000)));
		
		center_panel.add(btns1.get(15));
		
		for (int i = 0; i < 15; ++i) {
			btns1.get(i).addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int num = Integer.parseInt(e.getActionCommand());
					JButton btn = new JButton("");
					
					if (num < 13 && btns1.get(num + 4).equals("")) {
						center_panel.add(btns1.get(num), num + 4);
						center_panel.add(btn, num);
					} else if (num > 4 && btns1.get(num - 4).equals("")) {
						center_panel.add(btns1.get(num), num - 4);
						center_panel.add(btn, num);
					} else if (btns1.get(num + 1).equals("")) {
						center_panel.add(btns1.get(num), num + 1);
						center_panel.add(btn, num);
					} else if (btns1.get(num - 1).equals("")) {
						center_panel.add(btns1.get(num), num - 1);
						center_panel.add(btn, num);
					}
				}
			});
		}
		
//		JButton btn1 = new JButton("UP");
//		JButton btn2 = new JButton("Dawn");
//		JButton btn3 = new JButton("LEFT");
//		JButton btn4 = new JButton("RIGHT");
//		south_panel.add(btn1);
//		south_panel.add(btn2);
//		south_panel.add(btn3);
//		south_panel.add(btn4);
		
//		south_button.doClick(); // 버튼을 프로그램적으로 클릭한다.
		
		
		
		
		
		
	}
	
	 class move implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int num = Integer.parseInt(e.getActionCommand());
			if (num >= 1 && num <= 16) {
				if (btns1.get(num + 4).equals("")) {
					Collections.swap(btns1, num, num + 4);
				} else if (btns1.get(num - 4).equals("")) {
					Collections.swap(btns1, num, num - 4);
				} else if (btns1.get(num + 1).equals("")) {
					Collections.swap(btns1, num, num + 1);
				} else if (btns1.get(num - 1).equals("")) {
					Collections.swap(btns1, num, num - 1);
				}
			}
//			for (int i = 0; i < btns1.size(); ++i) {
//				center_panel.removeAll();
//				center_panel.add(btns1.get(i));
//			}
		}
			
		
		
	}
	
	public static void main(String[] args) {
		GridPuzzle frame = new GridPuzzle();
		frame.setDefaultOptions();
		
	}
	
	
	
	
}
