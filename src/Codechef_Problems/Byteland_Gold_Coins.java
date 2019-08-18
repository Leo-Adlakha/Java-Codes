package Codechef_Problems;

import java.util.Scanner;

/*Bytelandian gold coins Problem Code: COINS
Add problem to Todo list
Submit

  
All submissions for this problem are available.
In Byteland they have a very strange monetary system.

Each Bytelandian gold coin has an integer number written on it. A coin n can be exchanged in a bank into three coins: n/2, n/3 and n/4. But these numbers are all rounded down (the banks have to make a profit).

You can also sell Bytelandian coins for American dollars. The exchange rate is 1:1. But you can not buy Bytelandian coins.

You have one gold coin. What is the maximum amount of American dollars you can get for it?

Input
The input will contain several test cases (not more than 10). Each testcase is a single line with a number n, 0 <= n <= 1 000 000 000. It is the number written on your coin.

Output
For each test case output a single line, containing the maximum amount of American dollars you can make.

Example
Input:
12
2

Output:
13
2
You can change 12 into 6, 4 and 3, and then change these into 6+
4+3=
13. If you try changing the coin 2 into 3 smaller coins, you will get 1, 0 and 0, and later you can get no more than 1outofthem.Itisbetterjusttochangethe2coindirectlyinto
2.*/

public class Byteland_Gold_Coins {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while ( scn.hasNext() )
		{
			
			int n = scn.nextInt() ;
			System.out.println(ans(n));
			
		}
		
	}

	public static long ans ( long n ) 
	{
		if ( n >= ((n / 2) + (n / 3) + (n / 4)) )
		{
			return n ;
		}
		
		long a2 = ans(n/2);
		long a3 = ans(n/3);
		long a4 = ans(n/4);
		
		return a2 + a3 + a4 ;
		
	}

}
