package gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S04_ActionListender extends JFrame {
	int count;
	public S04_ActionListender() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		btns.add(new JButton());
		btns.add(new gui.mycomponent.MyJButton()); //�̸� ��ư �������� �س��� ����� �� �ִ�.
		//gui.mycomponent.MyJButton ���� ��ư �������� �������� 
		
		btns.get(0).setText("�ȳ��ϼ���");
		btns.get(0).setFont(new Font("�ü�ü", Font.PLAIN, 35));
		
		add(btns.get(0), "Center");
		add(btns.get(1), "East");
		
		// �׼� �����ʸ� �߰��� ������Ʈ�� ���� �̺�Ʈ�� �߻��� ������ actionPerformed �޼��带 ȣ���Ѵ�.
		btns.get(0).addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				btns.get(1).setText("¥��~");
			}
		});
//		int count;
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				btns.get(1).setText("" + count++);
				
			}
		});
		
		setLocation(20, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		new S04_ActionListender();
	}
}
