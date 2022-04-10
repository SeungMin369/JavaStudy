package gui.myhandler;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class Move implements ActionListener{
	ArrayList<JButton> btns;
	
	public Move(ArrayList<? extends JButton > btns) {
		this.btns = (ArrayList<JButton>) btns;
	}
	private void move() {
		for (JButton btn : btns) {
			
			
			
			
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		move();
		
	}
}
