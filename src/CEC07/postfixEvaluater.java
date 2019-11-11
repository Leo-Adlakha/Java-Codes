package CEC07;

import java.util.Scanner;

public class postfixEvaluater  
{ 
	static Scanner scn = new Scanner(System.in) ;

	public static void main(String[] args) throws Exception { 
		
		String str = scn.next() ; 
//		(6 + ((( 7 * ( 9 / 3 )) * 4) / 3 ))
//		6793/*4*3/+
		System.out.println(ans(str)); 
		
	} 
	
	public static int ans(String exp) throws Exception
	{ 
		Stack s = new Stack(); 
		
		for ( int i = 0 ; i < exp.length() ; i++ ) { 
			
			char c = exp.charAt(i); 
			
			if(Character.isDigit(c)) {
				
				s.push(c - 48); 
				
			}
			else
			{ 
				
				int val1 = s.pop(); 
				int val2 = s.pop(); 
				
				switch(c) { 
				
				case '+': 
					s.push(val2+val1); 
					break; 
					
				case '-': 
					s.push(val2- val1); 
					break; 
					
				case '/': 
					s.push(val2/val1); 
					break; 
					
				case '*': 
					s.push(val2*val1); 
					break; 
				
				} 
			} 
		} 
		
		return s.pop();	
	} 
} 