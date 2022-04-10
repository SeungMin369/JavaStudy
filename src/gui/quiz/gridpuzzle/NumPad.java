package gui.quiz.gridpuzzle;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NumPad extends JButton implements ActionListener{
	
	List<JButton> numPads;
	ImageIcon image;
	int gameSize;
	int index;
	
	int left;
	int right;
	int top;
	int bottom;
	
	
	public NumPad(int index, int gameSize, List<JButton> numPads) {
		if (index == gameSize * gameSize - 1) {
			this.setText("");
		} else {
			this.setText("" + (index + 1));
		}
		this.setFont(new Font("����", Font.ITALIC|Font.BOLD, 55));
		addActionListener(new ImageNumPadAction(this));
		
		this.gameSize = gameSize;
		this.numPads = numPads;
		this.index	 = index;
		this.image = image;
		this.top	 = index - gameSize >= 0 ? index - gameSize : -1; // -1�� ��ȿ���� ���� ���̶�� ��(����)
		this.bottom	 = index + gameSize < gameSize * gameSize ? index + gameSize : -1;
		this.left	 = index % gameSize != 0 ? index - 1 : -1; // �׸� �׷����� �ȴ�
		this.right	 = index % gameSize != gameSize - 1 ? index + 1 : -1; // �̰͵� �׷����� ������!		
	}
	
	
	private boolean isBlank(int index) {
		return numPads.get(index).getText().equals("");
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		if (top != -1 && isBlank(top)) {
//			numPads.get(top).setText(this.getText());
//			this.setText("");
//		} else if (bottom != -1 && isBlank(bottom)) {
//			numPads.get(bottom).setText(this.getText());
//			this.setText("");
//		} else if (left != -1 && isBlank(left)) {
//			numPads.get(left).setText(this.getText());
//			this.setText("");
//		} else if (right != -1 && isBlank(right)) {
//			numPads.get(right).setText(this.getText());
//			this.setText("");
//		}
//		
//		
//		if (numPads.get(numPads.size() - 1).getText().equals("")) {
//			boolean win = true;
//			for (int i = 1, size = numPads.size(); i < size; ++i) {
//				if (!numPads.get(i - 1).getText().equals("" + i)) {
//					win = false;
//					break;
//				}
//			}
//			System.out.println("win: " + win);
//		}
//		
//	}
}















