import java.util.Scanner;

/*INVERSE OF AN ARRAY
Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array


Input Format:
Enter a number N and take N more inputs

Constraints:
None
Output Format:
Display the values of the inverted array in a space separated manner

Sample Input:
4
1
0
2
3
Sample Output:
1 0 2 3*/

public class Inverse_of_an_Array {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int[] b = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			int t = a[i] ;
			b[t] = i ;
		}
		
		for ( int val : b )
		{
			System.out.print(val + " ");
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
	
}
