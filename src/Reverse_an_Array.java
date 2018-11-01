import java.util.Scanner;

/*ARRAYS-REVERSE AN ARRAY
Take as input N, the size of array. Take N more inputs and store that in an array. Write a function that reverses the array. Print the values in reversed array.

1.It reads a number N.
2.Take Another N numbers as input and store them in an Array.
3.Reverse the elements in the Array.
4.Print the reversed Array.


Constraints:
N cannot be Negative. Range of Numbers can be between -1000000000 to 1000000000.
Sample Input:
5
0
4
6
8
9
Sample Output:
9
8
6
4
0*/

public class Reverse_an_Array {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		
		for ( int i = 0 ; i < n/2 ; i++ )
		{
			int t = a[i] ;
			a[i] = a[n-i-1] ;
			a[n-i-1] = t ;
		}
		
		for ( int val : a )
		{
			System.out.println(val);
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
