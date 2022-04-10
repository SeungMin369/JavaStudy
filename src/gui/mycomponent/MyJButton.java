package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyJButton extends JButton{
	
	int value;
	
	public MyJButton() {
		super();
		
		setText("" + value);
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent 인스턴스에 해당 이벤트 정보가 넘어온다.
				System.out.println("정보1: " + e.getID()); // 버튼의 아이디
				System.out.println("정보2: " + e.getModifiers()); 
				System.out.println("정보3: " + e.getWhen()); // 유닉스 타입 시간
				System.out.println("정보4: " + e.getActionCommand()); // 버튼에 붙어있던 이름
				System.out.println("정보5: " + e.getSource());  // 누른 버튼에 대한 정보
				
				((MyJButton) e.getSource()).setText("" + ++value);
			}
		});
	}
	
	
}
