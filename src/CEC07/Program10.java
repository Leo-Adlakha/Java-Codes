package CEC07;

import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;


public class Program10 extends Applet implements ActionListener{  
	
	Button b1, b2;  
	TextField tf1, tf2, tf3, tf4;  
  
	public void init(){  
		
		tf1 = new TextField() ;  
		tf2 = new TextField() ;  
		tf3 = new TextField() ;
		tf4 = new TextField() ;
		
		tf1.setBounds(30,40,150,20) ;
		tf2.setBounds(30,70,150,20) ;  
		tf3.setBounds(30,100,150,20) ;
		tf4.setBounds(30,130,150,20);
		  
		b1 = new Button("M") ;  
		b2 = new Button("Y") ;
		b1.setBounds(30,170,75,50);  
		b2.setBounds(105,170,75,50);  
		  
		add(b1);
		add(b2);
		add(tf1);
		add(tf2);
		add(tf3);
		add(tf4);
		
		b1.addActionListener(this);  
		b2.addActionListener(this);  
		  
		setLayout(null);  
	}  
	  
	 public void actionPerformed(ActionEvent e){ 
		 if( e.getSource() == b1 ) {
			 double p = Double.valueOf(tf1.getText()) ;
			 double r = Double.valueOf(tf2.getText()) ;
			 double t = Double.valueOf(tf3.getText()) ;
			 double a = p * Math.pow((1 + ( r/(1200))),t*12) ;
			 
			 tf4.setText("" + (Math.round(a * 100D) / 100D));  			 
		 }
		 else if( e.getSource() == b2 ) {
			 double p = Double.valueOf(tf1.getText()) ;
			 double r = Double.valueOf(tf2.getText()) ;
			 double t = Double.valueOf(tf3.getText()) ;
			 double a = p * Math.pow((1 + ( r/(100))),t) ;
			 
			 tf4.setText("" + (Math.round(a * 100D) / 100D));  			 
		 }
		 
		 tf1.setText("");
		 tf2.setText("");
		 tf3.setText("");
	 } 
	 
	 
	 
	 
} 