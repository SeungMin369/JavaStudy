package gui.quiz.hangman;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import gui.mypanel.ImagePanel;



public class HangMan extends JFrame{
	String word;
	String place = "";
	String hint;
	int count;
	int cnt = 0;
	public HangMan() {
		super("HangMan");
		
		word = "apple";
		
		for (int i = 0; i < word.length(); ++i) {
			place += "_";
		}
		hint = place;
		
		JLabel status = new JLabel(place);
		JLabel status2 = new JLabel();
		
		
		JTextArea ta = new JTextArea();
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
		for (int i = 1; i <= 7; ++i) {
			icons.add(new ImageIcon("./image/HangDog/HangDog_" + i + ".jpg"));
		}
		JLabel label = new JLabel(icons.get(cnt));
		
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char[] hints;
				char[] words_lower = word.toLowerCase().toCharArray();
				char[] words_upper = word.toUpperCase().toCharArray();
				hints = hint.toCharArray();
				if (Character.isAlphabetic(e.getKeyChar())) {
					for (int i = 0; i < words_lower.length; ++i) {
						if (words_lower[i] == e.getKeyChar()) {
							hints[i] = e.getKeyChar();
						} else if (words_upper[i] == e.getKeyChar()) {
							hints[i] = e.getKeyChar();
						}
					}
					if (hint.equals(String.copyValueOf(hints))) {
						boolean checkalpha = true;
						for (int i = 0; i < words_lower.length; ++i) {
							if (e.getKeyChar() == words_lower[i]) {
								checkalpha = false;
							} else if (e.getKeyChar() == words_upper[i]) {
								checkalpha = false;
							}
						}
						if (checkalpha) {
							label.setIcon(icons.get(++cnt % icons.size()));
							if (cnt == 6) {
								status2.setText("��������..�׾����....");
							}
						}
					}
					hint = String.copyValueOf(hints);
					if (word.toLowerCase().equals(hint.replace("_", "").toLowerCase())) {
						status2.setText("�����Դϴ�." + count + "�� �����߽��ϴ�.");
					} 
					status.setText(hint);
					count++;
					
					
				} else {
					status2.setText("���ĺ��� �Է��ϼ���.");
				}			
			}
		});
		
		
		ta.setBounds(0 ,20 ,100 ,20);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(new Point(20, 100));
		setSize(new Dimension(700, 700));
		setVisible(true);
		
		add(ta);
		add(status, "North");
		add(status2, "South");
		add(label, "Center");
	}
	
	/*
	  	����� ��������
	  	
	  	 1. � �ܾ ���ΰ�� �ش� �ܾ��� ���̸�ŭ _������ش�.
	  	 
	  	  ex) apple�� ���ΰ�� _ _ _ _ _�� ���
	  	  
	  	 2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϸ� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�
	  	 
	  	  ex) ����ڰ� p�� �Է��ߴٸ� _p p _ _�� ���
	  	  
	  	 3. ����ڰ� ��� _�� �����ϸ� ������� ������� ������ּ���
	  	 
	  	 4. �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���
	  	 
	  	 �Ȱ��� ��������� _�� ������ �ܼ� ��� �����ӿ� �������� ����غ�����
	  	 
	  	 keyEvent�� ���� � Ű�� ���ȴ��� Ȯ���Ͽ� ������ üũ���ּ���.
	  	 
	  	 ������ Ʋ�ȴٸ� ���� �׸����� �Ѿ�� ����� ������ ���ӿ��� �����ּ���.
	 */
	public static void main(String[] args) {
		new HangMan();
		
	}
}
