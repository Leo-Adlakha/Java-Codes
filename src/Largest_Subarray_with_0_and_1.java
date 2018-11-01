import java.util.Scanner;

/*LARGEST SUBARRAY WITH 0 AND 1
You are given a Given an array containing only 0s and 1s, find the largest subarray which contain equal no of 0s and 1s.


Input Format:
The first line consists of number of test cases T. For each test case, consists an integer n as length of the array and next line contains n space separated integers.

Constraints:
1 <= T <= 10 
1 <= n <= 10000000
Output Format:
Print the starting index and final index of the required largest subarray. If there is no subarray then print None.

Sample Input:
2
7
1 0 0 1 0 1 1
4
1 1 1 1
Sample Output:
0 5
None 
Explanation:
For first test case largest subarray lies between index 0 to 5.

Time Limit: 1 sec
*/

public class Largest_Subarray_with_0_and_1 {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		showoutput(a);
		
		}
	}
	
	public static int[] takeInput( int n )
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
		
	}
	
	public static void showoutput ( int[] a )
	{
		
		int si = 0 ;
		int ei = 0 ;
		int tsi ;
		int tei ;
		int count0 ;
		int count1 ;
		int diff = 0 ;
		
		for ( int i = 0 ; i < a.length ; i++ ) 
		{
			for ( int j = i ; j < a.length ; j++ )
			{
				tsi = i ;
				tei = j ;
				count0 = 0 ;
				count1 = 0 ;
				for ( int k = i ; k <= j ; k++ )
				{
					if ( a[k] == 0 )
					{
						count0++ ;
					}
					else
					{
						count1++ ;
					}
				}
				if ( count0 == count1 && tei - tsi > diff )
				{
					si = tsi ;
					ei = tei ;
					diff = ei - si ;
				}
								
			}
			
		}
		
		if ( si == 0 && ei == 0 )
		{
			System.out.println("None");
		}
		else
		{
			System.out.println(si + " " + ei );
		}
		
		
	}

}
