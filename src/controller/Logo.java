package controller;


	import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JApplet; 
	  
 
	public class Logo extends JApplet {
	    public void init() 
	    { 
	        // set size 
	        setSize(400, 400); 
	  
	        repaint(); 
	    } 
	  
	   

		// paint the applet 
	    public void paint(Graphics g) 
	    { 
	        
	    Color c = Color.BLUE;
			//	g.drawRect(100,100, 100, 200);
	    	g.setColor(c);
	    	g.fillRect(50, 100, 125, 25);
	    	g.fillRect(100, 100, 25, 200);
	    	
	    	c = Color.RED;
	    	
	    	g.setColor(c);
	    	g.fillArc(175,100, 125, 200, 0, 360);
	    	
	    	c = Color.BLACK;
	    	
	    	Font font = new Font("Serif",Font.PLAIN, 30);
			g.setFont(font );
			g.setColor(c);
			g.fillOval(210, 150, 15, 15); 
			g.fillOval(250, 150, 15, 15); 
			g.drawArc(210, 250, 50, 20, 180, 180); 
			g.drawArc(210, 250, 50, 20, 160, 160); 
	    	g.drawString("Top Quiz", 250, 350);
	    	int x[] = { 170, 190, 200, 210, 270, 310 }; 
	    	  
	        // y coordinates of vertices 
	        int y[] = { 160, 130, 70, 60, 50, 30 }; 
	  
	        // number of vertices 
	        int numberofpoints = 6; 
	  
	        // set the color of line drawn to blue 
	        g.setColor(Color.BLACK); 
	  
	        // draw the polygon using drawPolygon function 
	        g.fillPolygon(x, y, numberofpoints); 

	    } 
	}

