import java.util.Scanner;

/*ARRAYS-TARGET SUM PAIRS
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.


Constraints:
Length of the arrays should be between 1 and 1000.
Sample Input:
5
1
3
4
2
5
5
Sample Output:
1 and 4
2 and 3
Explanation:
Find any pair of elements in the array which has sum equal to target element and print them.*/

public class Array_Target_Sum_Pairs {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int target = scn.nextInt();
		displayans(a,target) ;
		
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

	public static void displayans( int[] a, int t ) 
	{
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			for ( int j = i + 1 ; j < a.length ; j++ )
			{
				if ( a[i] + a[j] == t )
				{
//					if ( a[i] < a[j] )
					    System.out.println(a[i] + " and " + a[j] );
//					else
//						System.out.println(a[j] + " and " + a[i]);
				}
			}
		}
		
	}
	
}
