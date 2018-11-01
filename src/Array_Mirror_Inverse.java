import java.util.Scanner;

/*ARRAYS-IS ARRAY MIRROR INVERSE
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that returns true if the array is mirror-inverse and false otherwise. An array is called mirror-inverse if its inverse is equal to itself.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Inverse the array and print true if array is mirror inverse else print false .


Constraints:
N cannot be Negative. Range of Numbers can be between 0 to N-1.
Sample Input:
5
4
0
2
1
3
Sample Output:
false
*/
public class Array_Mirror_Inverse {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		int[] b = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			int t = a[i] ;
			b[t] = i ;
		}
		
		System.out.println(check(a,b)) ;
		
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
	
	public static boolean check ( int[] a , int[] b )
	{
		for ( int i = 0 ; i < a.length ; i++ )
		{
			if ( a[i] != b[i] )
			{
				return false ;
			}
		}
		
		return true ;		
	}

}
