package CEC07;

import java.awt.*;  
import java.awt.event.*;  
import java.applet.*;  

public class Program12 extends Applet implements MouseMotionListener{  
  
	public void init() {  
		
		addMouseMotionListener(this);  
		setBackground(Color.red);  
	
	}  
	  
	public void mouseDragged(MouseEvent me) {  
		
		Graphics g=getGraphics();  
		g.setColor(Color.white);  
		g.fillOval(me.getX(),me.getY(),20,20); 
		 
	}
	
	public void mouseMoved(MouseEvent me) {
		
		
		
	}  
	  
}