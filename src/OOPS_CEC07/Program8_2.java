package OOPS_CEC07;

import java.util.Stack ;

public class Program8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "((A+B)*C)-D" ;
		intopost(str);
	}
	
public static void intopost(String str) {
		
		Stack<Character> s = new Stack<>() ;
		for ( int i = 0 ; i < str.length() ; i++ ) {
			
			if ( str.charAt(i) == '(' ){
				s.push('(');
			}
			else if ( str.charAt(i) == ')' ) {
				while ( s.peek() != '(' ) {
					System.out.print(s.pop());
				}
				s.pop(); 
			}
			else if ( str.charAt(i) == '*' || str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' ) {
				s.push(str.charAt(i)) ;
			}
			else {
				System.out.print(str.charAt(i));
			}
			
		}
		
		while ( !s.isEmpty() ) {
			System.out.print(s.pop());
		}
		
	}

}
