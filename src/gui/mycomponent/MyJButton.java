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
				// �̺�Ʈ �߻��� ActionEvent �ν��Ͻ��� �ش� �̺�Ʈ ������ �Ѿ�´�.
				System.out.println("����1: " + e.getID()); // ��ư�� ���̵�
				System.out.println("����2: " + e.getModifiers()); 
				System.out.println("����3: " + e.getWhen()); // ���н� Ÿ�� �ð�
				System.out.println("����4: " + e.getActionCommand()); // ��ư�� �پ��ִ� �̸�
				System.out.println("����5: " + e.getSource());  // ���� ��ư�� ���� ����
				
				((MyJButton) e.getSource()).setText("" + ++value);
			}
		});
	}
	
	
}
