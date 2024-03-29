package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class S10_KeyEvent extends StudyFrame{
	
	public S10_KeyEvent() {
		super();
		
		JLabel status = new JLabel("stable");
		
		JTextArea ta = new JTextArea("기본값");
		ta.setBounds(20 ,20 ,220 ,220);
		
		
		// KeyTyped로는 어떤 키보드가 눌렸는지 알 수 없다 (VK_DEFINED)
		// 어떤 키가 눌렸는지 알기 위해서는 KeyPressed이벤트를 이용해야 한다
		
		// 대신 KeyTyped는 어떤 값이 입력되었는지 알 수 있다
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar() +  "Value Typed");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				status.setText(e.getKeyCode() +  "Key Prassed");
				System.out.println(e.getKeyCode() +  "Key Prassed");
			}
		});
//		ta.addKeyListener(new KeyListener() {
//			
//			@Override
//			public void keyTyped(KeyEvent e) {
//				ta.setText(e.getKeyCode() + "Key Typed");
//				
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) { //떼었을때
//				ta.setText("key Released");
//				
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) { // 눌렸을떄
//				ta.setText("key Pressed");
//				
//			}
//		});
		
		
		add(ta, "Center");
		add(status, "North");
	}
	
	
	public static void main(String[] args) {
		// 키보드가 눌렸을 때 발생하는 이벤트를 컴포넌트에 추가할 수 있다
		S10_KeyEvent frame = new S10_KeyEvent();
		frame.setDefaultOptions();
		
	}
}
