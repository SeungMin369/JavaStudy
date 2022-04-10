package gui.quiz.gridpuzzle;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridPuzzle2 extends JFrame	{
	
	private ArrayList<JButton> num_Pads;
	private String image_path;
	
	public GridPuzzle2() throws IOException {
		this(3);
	}
	
	public GridPuzzle2(int gameSize) throws IOException {
		super(String.format("숫자퍼즐게임:%dx%d", gameSize, gameSize));
		
		image_path = "./image/gaon.jpg";
		
		ImageIO.read(new File(image_path));
		
		
		JPanel num_panel = new JPanel(new GridLayout(gameSize, gameSize));
		JPanel menu_panel = new JPanel(new BorderLayout());
		
		num_Pads = new ArrayList<>();
		
		
		
		for (int i = 0, len = gameSize * gameSize; i < len; ++i) {
			NumPad new_pad = new NumPad(i, gameSize, num_Pads);
			
			num_Pads.add(new_pad);
			
			num_panel.add(new_pad);
			
		}
		
		ArrayList<ImageIcon> gaon = new ArrayList<>();
		try {
			final BufferedImage source = ImageIO.read(new File("./image/gaon.jpg"));
			source.getScaledInstance(gameSize * 100, gameSize * 100, Image.SCALE_SMOOTH);
			for (int y = 0; y < source.getHeight(); y += 100) {
			    for (int x = 0; x < source.getWidth(); x += 100) {
			    	gaon.add(new ImageIcon(source.getSubimage(x, y, 100, 100)));
			    }
			}
		} catch (IOException e) {
			System.out.println("사진을 찾을 수 없습니다.");
			e.printStackTrace();
		}
//		JPanel panel = new ImagePanel(gaon);
		
		
//		shuffle();
		
		add(num_panel, "Center");
		add(menu_panel, "East");
		
		setResizable(false);
		setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpeg")));
		setBounds(20, 100, 700, 700); // 위치와 사이즈를 합친것
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private void shuffle() {
		for (int i = 0; i < 100; ++i) {
			int ran_x = (int)(Math.random() * num_Pads.size());
			int ran_y = (int)(Math.random() * num_Pads.size());
			
			String temp = num_Pads.get(ran_x).getText();
			num_Pads.get(ran_x).setText(num_Pads.get(ran_y).getText());
			num_Pads.get(ran_y).setText(temp);
		}
	}
	
	
	
	public static void main(String[] args) {
		try {
			new GridPuzzle2(4);
		} catch (IOException e) {
			System.out.println("아이콘을 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
