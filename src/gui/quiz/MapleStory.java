package gui.quiz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

import gui.quiz.maple.RollButton;

public class MapleStory extends JFrame {
	/*
	  	������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� ��������.
	  	
	  	�� ���� +1 ~ +7
	  	���� ���� +1 ~ +7
	  	��ø ���� +1 ~ +7
	  	��� ���� +1 ~ +7
	  	���ݷ� ���� +1 ~ +3
	*/
	
	public MapleStory() {
		super("��ǳ �̾߱�");
		setLayout(null);
		
		RollButton rollBtn = new RollButton();
		add("roll", rollBtn);
		
		add("stat1", rollBtn.getRanBtns().get(0));
		add("stat2", rollBtn.getRanBtns().get(1));
		add("stat3", rollBtn.getRanBtns().get(2));
		
		
		setLocation(20, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MapleStory();
	}

}
