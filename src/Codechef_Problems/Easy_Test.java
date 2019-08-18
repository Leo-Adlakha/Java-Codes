package Codechef_Problems;

import java.util.Scanner;

public class Easy_Test {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(3.4,2.8));
		
	}

	public static double add ( double a, double b )
	{
		return a + b ;
	}
	
	public static void display ( int[] a )
	{

		for ( int i = 0 ; i < a.length ; i++ )
		{
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

	public static int[] takeInput(int n) 
	{
		
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	}


}
