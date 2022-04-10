package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S09_Menu extends StudyFrame{
	int cnt;
	
	public S09_Menu() {
		super();
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
		icons.add(new ImageIcon("./image/지네.jpg"));
		icons.add(new ImageIcon("./image/kiwi.jpg"));
		icons.add(new ImageIcon("./image/goldkiwi.jpg"));
		icons.add(new ImageIcon("./image/펭수.jpg"));
		icons.add(new ImageIcon("./image/anord.jpg"));
		icons.add(new ImageIcon("./image/멸치.jpg"));
		
		JLabel label = new JLabel(icons.get(cnt));
		
		JMenuBar bar = new JMenuBar();
		
		JMenu main = new JMenu("Main Menu");
		JMenu sub = new JMenu("Sub Menu");
		
		JMenuItem main_item1 = new JMenuItem("New");
		JMenuItem main_item2 = new JMenuItem("Load");
		JMenuItem main_item3 = new JMenuItem("Save");
		
		JMenuItem sub_item1 = new JMenuItem("Update");
		JMenuItem sub_item2 = new JMenuItem("Delete");
		
		main_item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons.get(1));
				
			}
		});
		
		main_item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons.get(2));
				
			}
		});
		
		main_item3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons.get(3));
				
			}
		});
		
		sub_item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons.get(4));
				
			}
		});
		sub_item2.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons.get(5));
		
			}
		});
		
		
		main.add(main_item1);
		main.add(main_item2);
		main.add(main_item3);
		main.add(sub);
		
		sub.add(sub_item1);
		sub.add(sub_item2);
		
		bar.add(main);
		
		setJMenuBar(bar);
		
		add(label , "Center");
		
		// 클래스를 분할해서 깔끔하게 쓰는 방법도 있다
		class MenuItemListender implements ActionListener {
			String path;
			
			public MenuItemListender(String path) {
				this.path = path;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon(path));
				
			}
			
		}
		
//		sub_item1.addActionListener(new MenuItemListender("./image/지네.jpg"));
		
		
		
		
		
		
		
	}

	public static void main(String[] args) {
		S09_Menu frame = new S09_Menu();
		frame.setDefaultOptions();
	}
}
