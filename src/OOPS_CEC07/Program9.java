package OOPS_CEC07;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


@SuppressWarnings({ "deprecation", "serial" })
public class Program9 extends Applet {
	
	@Override
	public void paint(Graphics g) 
	{ 
		g.drawString("Hello World", 50, 50); // text, margin-left, margin-right
		g.setColor(Color.red);
	} 

}
