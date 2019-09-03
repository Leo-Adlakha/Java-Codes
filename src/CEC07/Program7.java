package CEC07;

import java.util.*;

public class Program7 {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		int m = scn.nextInt() ;
		int n = scn.nextInt() ;
		int m2 = scn.nextInt() ;
		int n2 = scn.nextInt() ;
		
		if( n != m2 ) {
			throw new Exception("Enter valid inputs for matrix multiplication!!!") ;
		}
		
		int[][] a = takeInput(m, n) ;
		int[][] b = takeInput(m2, n2) ;
		
		int[][] c = new int[m][n2] ;
		
		for( int i = 0 ; i < m ; i++ ) {
			
			for( int j = 0 ; j < n2 ; j++ ) {
				
				int value = 0 ;
				
				for( int k = 0 ; k < n ; k++ ) {
					
					value += a[i][k] * b[k][j] ;
					
				}
				
				c[i][j] = value ;

			}
			
		}
		
		for( int i = 0 ; i < m ; i++ ) {
			
			for( int j = 0 ; j < n2 ; j++ ) {
				
				System.out.print(c[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
	}
	
	public static int[][] takeInput(int m, int n) {
		
		int[][] a = new int[m][n] ;
		for( int i = 0 ; i < m ; i++ ) {
			
			for( int j = 0 ; j < n ; j++ ) {
				
				a[i][j] = scn.nextInt() ;
				
			}
			
		}
		
		return a ;
		
	}

}

