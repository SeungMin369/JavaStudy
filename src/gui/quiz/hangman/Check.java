package gui.quiz.hangman;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Check  implements KeyListener{
	String word;
	JLabel status;
	public Check() {
		this.word = HangMan.word;
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		(e.getKeyChar() + "");
		word.contains(e);
		
		
		status.setText("");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
