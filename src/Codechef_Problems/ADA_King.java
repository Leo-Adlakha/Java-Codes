package Codechef_Problems;

import java.util.Scanner;

public class ADA_King {
	static Scanner scn = new Scanner(System.in) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			int r = scn.nextInt() ;
			int c = scn.nextInt() ;
			int k = scn.nextInt() ;
			System.out.println(findans(r,c,k)) ;
		}
		
	}
	
	public static int findans(int r, int c, int k) {
		
		int down = 0 ;
		int up = 0 ;
		int left = 0 ;
		int right = 0 ;
		if ( r - k <= 0 ) {
			up = r ;
		}
		else {
			up = k + 1;
		}
		if ( r + k > 8 ) {
			down = 8 - r ;
		}
		else {
			down = k ;
		}
		
		if ( c - k < 0 ) {
			left = c ;
		}
		else {
			left = k + 1;
		}
		if ( c + k > 8 ) {
			right = 8 - c ;
		}
		else {
			right = k ;
		}
		
		return (down + up)*(left+right) ;
		
	}

	
}
