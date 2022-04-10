package gui.quiz.gridpuzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;

public class ImageNumPadAction implements ActionListener{
	int left;
	int right;
	int top;
	int bottom;
	
	NumPad numpad;
	List<JButton> numpads;
	
	public ImageNumPadAction(NumPad numpad) {
		this.numpad = numpad;
		this.numpads = numpad.numPads;
		
		int index = numpad.index;
		int gameSize = numpad.gameSize;
		
		this.top	 = index - gameSize >= 0 ? index - gameSize : -1; // -1은 유효하지 않은 값이라는 뜻(국룰)
		this.bottom	 = index + gameSize < gameSize * gameSize ? index + gameSize : -1;
		this.left	 = index % gameSize != 0 ? index - 1 : -1; // 그림 그려보면 안다
		this.right	 = index % gameSize != gameSize - 1 ? index + 1 : -1; // 이것도 그려봐라 새끼야!
	}
	
	private boolean isBlank(int index) {
		return numpads.get(index).getIcon() == null;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (top != -1 && isBlank(top)) {
			numpads.get(top).setIcon(numpad.getIcon());
			numpad.setIcon(null);
			
			numpads.get(top).setText("");
			numpad.setText("E");
			
		} else if (bottom != -1 && isBlank(bottom)) {
			numpads.get(bottom).setIcon(numpad.getIcon());
			numpad.setIcon(null);
			
			numpads.get(bottom).setText("");
			numpad.setText("E");
		} else if (left != -1 && isBlank(left)) {
			numpads.get(left).setIcon(numpad.getIcon());
			numpad.setIcon(null);
			
			numpads.get(left).setText("");
			numpad.setText("E");
		} else if (right != -1 && isBlank(right)) {
			numpads.get(right).setIcon(numpad.getIcon());
			numpad.setIcon(null);
			
			numpads.get(right).setText("");
			numpad.setText("E");
		}
		
	}

}
