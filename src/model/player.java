package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class player {
	
	public ArrayList <Shape> playerRightHand;
	public ArrayList <Shape> playerLeftHand;
	private BufferedImage pic = null;
	private Point point ;
	private int score ;
	
	public player(String url, Point p){
		try {
			playerRightHand=new ArrayList();
			playerLeftHand=new ArrayList();
			pic = ImageIO.read(new File(url));
			point = p;
			score = 0 ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

	public void setScore(int sc) {
		score = score + sc;
	}

	public void increamentScore() {
		score++;
	}

	public int getScore() {
		return score;
	}

	
	public Point getPoint() {
		return point;
	}

	public void setPoint(Point p) {
		point = p;
	}


	public BufferedImage getImage() {
		return pic;
	}

	public void setImage(String url) {
		try {
			pic = ImageIO.read(new File(url));
		} catch (IOException e) {
			System.out.println("Image Not Found!");
		}
	}

	public void setLocation(int x, int y) {
		point.setX(x);
		point.setY(y);
	}

	public void setLocationX(int x) {
		
		point.setX(x);
	}

	public void setLocationY(int y) {
		
		point.setY(y);

	}

	public int getLocationX() {
		return point.getX();
	}

	public int getLocationY() {
		return point.getY();
	}

}