package gui;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class StudyFrame extends JFrame {
	
	
	public void setDefaultOptions() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(new Point(20, 100));
		setSize(new Dimension(500, 500));
		setVisible(true);
	}
}
