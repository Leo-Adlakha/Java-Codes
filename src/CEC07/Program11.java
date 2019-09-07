package CEC07;

import java.applet.*;  
import java.awt.*;  
import java.awt.event.*;


public class Program11 extends Applet implements ActionListener{  
	
	Button b1, b2, b3, b4, b5;  
	TextField tf1, tf2, tf3;  
  
	public void init(){  
		
		tf1 = new TextField() ;  
		tf2 = new TextField() ;  
		tf3 = new TextField("Answer") ;
		
		tf1.setBounds(30,70,150,20) ;
		tf2.setBounds(30,40,150,20) ;  
		tf3.setBounds(30,100,150,20) ;
		  
		b1 = new Button("+") ;  
		b2 = new Button("-") ;
		b3 = new Button("*") ;
		b4 = new Button("/") ;
		b5 = new Button("AC") ;
		b1.setBounds(30,150,30,50);  
		b2.setBounds(60,150,30,50);  
		b3.setBounds(90,150,30,50);  
		b4.setBounds(120,150,30,50);  
		b5.setBounds(150,150,30,50);  
		  
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(tf1);
		add(tf2);
		add(tf3);
		
		b1.addActionListener(this);  
		b2.addActionListener(this);  
		b3.addActionListener(this);  
		b4.addActionListener(this);  
		b5.addActionListener(this);  
		  
		setLayout(null);  
	}  
	  
	 public void actionPerformed(ActionEvent e){ 
		 if( e.getSource() == b1 ) {
			 tf3.setText("" + (Integer.valueOf(tf1.getText()) + Integer.valueOf(tf2.getText())));  			 
		 }
		 else if( e.getSource() == b2 ) {
			 tf3.setText("" + (Integer.valueOf(tf2.getText()) - Integer.valueOf(tf1.getText())));  			 
		 }
		 else if( e.getSource() == b3 ) {
			 tf3.setText("" + (Integer.valueOf(tf2.getText()) * Integer.valueOf(tf1.getText())));  			 
		 }
		 else if( e.getSource() == b4 ) {
			 tf3.setText("" + (Integer.valueOf(tf2.getText()) / Integer.valueOf(tf1.getText())));  			 
		 }
		 else if( e.getSource() == b5 ) {
			 tf3.setText("");  			 
		 }
		 
		 tf1.setText("");
		 tf2.setText("");
	 } 
	 
	 
	 
	 
} 