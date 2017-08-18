package model;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public abstract  class Shape   {

	public int x =0;
	public int y=0;
	int width=20;
	int INCREMENT=8;
	boolean draw=false;
	 boolean inHand=false;
	 boolean belongToPlayer=false;
	int randomDelayedStart;
	public BufferedImage  image;
	public String type;
	public Shape() throws IOException{
		Random random=new Random();
		randomDelayedStart = random.nextInt(6000)+60;
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double width = screenSize.getWidth();
		x=random.nextInt((int)width);
		this.inHand=false;
		
	}
	public void move(int y) {
		// TODO Auto-generated method stub
			
			if (this.draw ) {
				if(!this.inHand){
                this.y += INCREMENT;
                
				}
           } else  {
                y -= INCREMENT;
            }
        
	}
	public void decreaseDelay() {
		
        if (randomDelayedStart <= 0) {
        	  draw = true;
        } else {
            this.randomDelayedStart -= 1;
        }
    }
	public BufferedImage getImage(){
		return image=this.image;
		
	}
	public void drawShape(Graphics g) throws IOException {
		{
	         if (draw) {
	        	
	             g.drawImage(this.image, this.x,this.y, null);
	             
	         }
	     }
		
	}

}
	
	
	
	

