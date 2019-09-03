package CEC07;

import java.util.* ;

public class Program4 {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		if( n == 0 ) {
			System.out.println("0");
		}
		else if( n == 1 ) {
			System.out.println("0 1");
		}
		else {
			System.out.print("0 1");
			int a = 0 ;
			int b = 1 ;
			for ( int i = 2 ; i <= n ; i++ ) {
				
				int c = a + b ;
				System.out.print(" " + c);
				a = b ;
				b = c ;
				
			}
		}
		
		
	}

}
