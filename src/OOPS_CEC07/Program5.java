package OOPS_CEC07;

import java.util.*;

public class Program5 {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = scn.nextLine() ;
		int flag = 1 ;
		for( int i = 0 ; i < str.length() / 2 ; i++ ) {
			if( str.charAt(i) != str.charAt(str.length() - i - 1)) {
				System.out.println("Not a palindrome!!");
				flag = 0 ;
				break ;
			}
		}
		if( flag == 1 ) {
			System.out.println("It is a palindrome!!");
		}
		
	}

}
