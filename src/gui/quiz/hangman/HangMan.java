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
								status2.setText("강아지가..죽었어요....");
							}
						}
					}
					hint = String.copyValueOf(hints);
					if (word.toLowerCase().equals(hint.replace("_", "").toLowerCase())) {
						status2.setText("정답입니다." + count + "번 도전했습니다.");
					} 
					status.setText(hint);
					count++;
					
					
				} else {
					status2.setText("알파벳을 입력하세요.");
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
	  	행맨을 만들어보세요
	  	
	  	 1. 어떤 단어가 답인경우 해당 단어의 길이만큼 _출력해준다.
	  	 
	  	  ex) apple이 답인경우 _ _ _ _ _를 출력
	  	  
	  	 2. 사용자가 알파벳을 하나씩 입력하면 해당 알파벳이 포함되어 있다면 _를 알파벳으로 바꾼다
	  	 
	  	  ex) 사용자가 p를 입력했다면 _p p _ _를 출력
	  	  
	  	 3. 사용자가 모든 _를 제거하면 몇번만에 맞췄는지 출력해주세요
	  	 
	  	 4. 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요
	  	 
	  	 똑같은 행맨이지만 _와 정답을 콘솔 대신 프레임에 보기좋게 출력해보세요
	  	 
	  	 keyEvent를 통해 어떤 키가 눌렸는지 확인하여 정답을 체크해주세요.
	  	 
	  	 정답이 틀렸다면 다음 그림으로 넘어가고 행맨이 죽으면 게임오버 시켜주세요.
	 */
	public static void main(String[] args) {
		new HangMan();
		
	}
}
