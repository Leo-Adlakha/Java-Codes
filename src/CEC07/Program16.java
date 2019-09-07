package CEC07;

//Java program to create a blank text 
//field of definite number of columns. 
import java.awt.event.*; 
import javax.swing.*; 

class Program16 extends JFrame implements ActionListener { 
	// JTextField 
	static JTextField t, t2; 

	// JFrame 
	static JFrame f, error; 

	// JButton 
	static JButton b; 

	// label to diaplay text 
	static JLabel l, l2; 

	// default constructor 
	Program16() 
	{ 
	} 

	// main class 
	public static void main(String[] args) 
	{ 
		// create a new frame to stor text field and button 
		f = new JFrame("textfield"); 

		// create a label to display text 
		l = new JLabel("Give me Two Numbers to divide!!!"); 
		l2 = new JLabel("Answer: ");

		// create a new button 
		b = new JButton("Divide"); 

		// create a object of the text class 
		Program16 te = new Program16(); 

		// addActionListener to button 
		b.addActionListener(te); 

		// create a object of JTextField with 16 columns 
		t = new JTextField(16);
		t2 = new JTextField(16);

		// create a panel to add buttons and textfield 
		JPanel p = new JPanel(); 

		// add buttons and textfield to panel 
		p.add(t); 
		p.add(t2);
		p.add(b); 
		p.add(l);
		p.add(l2);

		// add panel to frame 
		f.add(p); 

		// set the size of frame 
		f.setSize(500, 100); 

		f.show(); 
	} 

	// if the button is pressed 
	public void actionPerformed(ActionEvent e) 
	{ 
		String s = e.getActionCommand(); 
		if (s.equals("Divide")) { 
			
			int a = 1, b = 1;
			
			try {
				
				a = Integer.parseInt(t.getText()) ;
				b = Integer.parseInt(t2.getText()) ;
				
			}catch( NumberFormatException n ) {
				
				error = new JFrame();
				JOptionPane.showMessageDialog(f,"Enter Valid Numbers!!", "alert", JOptionPane.WARNING_MESSAGE);  
				
			}
			
			try {
				
				// set the text of the label to the text of the field 
				l2.setText("Answer: " + (Math.round((double)( a / b ) * 100D) / 100D) ); 
				
			}catch(ArithmeticException a1) {
				
				error = new JFrame();
				JOptionPane.showMessageDialog(f,"Cannot divide a number by 0!!!", "alert", JOptionPane.WARNING_MESSAGE);  
				
			}
			

			// set the text of field to blank 
			t.setText(""); 
			t2.setText("");
		} 
	} 
} 


