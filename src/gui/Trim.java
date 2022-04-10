package gui;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Trim {
	public static void main(String[] args) {
		
		try {
			final BufferedImage source = ImageIO.read(new File("./image/gaon.jpg"));
			int idx = 0;
			for (int y = 0; y < source.getHeight(); y += 100) {
			    for (int x = 0; x < source.getWidth(); x += 100) {
			    	ImageIO.write
				    (source.getSubimage(x, y, 100, 100), "png", new File("./image/trimgaon_" + idx++ + ".png"));
			    }
			}
		} catch (IOException e) {
			System.out.println("사진을 찾을 수 없습니다.");
			e.printStackTrace();
		}
		
		
	}
}
