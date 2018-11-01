import java.util.Scanner;

/*ARRAYS-TARGET SUM TRIPLETS
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all triplets of numbers which sum to target.


Input Format:
First line contains input N. Next N lines contains the elements of array and N+1 line contains target number.

Constraints:
Length of Array should be between 1 and 1000.
Output Format:
Print all the triplet present in the array.

Sample Input:
9
5
7
9
1
2
4
6
8
3
10
Sample Output:
1, 2 and 7
1, 3 and 6
1, 4 and 5
2, 3 and 5
Explanation:
Arrays = {5, 7, 9, 1, 2, 4, 6 ,8 ,3}. Target number = 10. Find any three number in the given array which sum to target numbers.
*/

public class Array_Target_Sum_Triplet {

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
				for ( int k = j + 1 ; k < a.length ; k++ )
				{
				if ( a[i] + a[j] + a[k] == t )
				{
					int max = findmax(a[i], a[j], a[k] ) ;
					int min = findmin(a[i], a[j], a[k] ) ;
					int mod = findmod(a[i], a[j], a[k] ) ;
					System.out.println(min + ", " + mod + " and " + max );
				}
				}
			}
		}
		
	}
	
	public static int findmax( int a, int b, int c )
	{
		if ( a >= b)
		{
			if ( a >= c )
			{
				return a ;
			}
			else
			{
				return c ;
			}
		}
		else
		{
			if ( b >= c )
			{
				return b ;
			}
			else
			{
				return c ;
			}
		}
		
	}
	public static int findmin( int a, int b, int c )
	{
		if ( a <= b)
		{
			if ( c >= a )
			{
				return a ;
			}
		}
		else
		{
			if ( c >= b )
			{
				return b ;
			}
		}
		if ( c <= b)
		{
			if ( c <= a )
			{
				return c ;
			}
		}
		
			return 0 ;	
		
	}

	public static int findmod ( int a , int b , int c )
	{
		int max = findmax(a,b,c) ;
		int min = findmin(a,b,c) ;
		if ( a == max && b == min )
		{
			return c ;
		}
		else if ( a == max && c == min )
		{
			return b ;
		}
		else if ( b == max && c == min )
		{
			return a ;
		}
		else if ( b == max && a == min )
		{
			return c ;
		}
		else if ( c == max && b == min )
		{
			return a ;
		}
		else if ( c == max && a == min )
		{
			return b ;
		}
		
		return 0 ;
	}
	
}
