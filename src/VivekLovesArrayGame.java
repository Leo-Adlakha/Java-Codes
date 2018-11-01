import java.util.Scanner;

/*VIVEK LOVES ARRAY GAME
Vivek loves to play with array . One day Vivek just came up with a new array game which was introduced to him by his friend Ujjwal. The rules of the game are as follows:

Initially, there is an array, A , containing 'N' integers.

In each move, Vivek must divide the array into  two non-empty contiguous parts such that the sum of the elements in the left part is equal  to the sum of the elements in the right part. If Vivek can make such a move, he gets '1' point; otherwise, the game ends.

After each successful move, Vivek have to discards either the left part or the right part and continues playing by using 
the remaining partition as array 'A'.

Vivek loves this game and wants your help getting the best score possible. Given 'A', can you find and print the maximum number of points he can score?


Input Format:
First line of input contains an integer T denoting number of test cases. Each further Test case contains first line an integer 'N' , the size of array 'A'. After that 'N' space separated integers denoting the elements of array.

Constraints:
1 <= T <= 10
1 <= N <= 17000
1 <= A[i] <= 10^9
Output Format:
For each test case, print Vivek's maximum possible score on a new line.

Sample Input:
3
3
3 3 3
4
2 2 2 2
7
4 1 0 1 1 0 1
Sample Output:
0
2
3
Time Limit: 4 sec*/

public class VivekLovesArrayGame {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {

	int t = scn.nextInt() ;
	for ( int i = 0 ; i < t ; i++ )
	{
	int n = scn.nextInt();
	int[] arr = takeinput(n);
	System.out.println(myscore(arr, 0, arr.length - 1));
	}	
	}
	
	public static int[] takeinput( int n )
	{
		int[] a = new int[n];
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt();
		}
		return a ;
	
	}
	

	public static int[] copy( int[] a, int start, int end )

	{
		int[] b = new int[end + 1];
		for ( int i  = start ; i < end + 1 ; i++ )
		{
			b[i] = a[i] ;
		}
		return b ;
	
	}
	
	public static int sum ( int[] a, int start, int end )
	{
		int sum = 0 ; 
		for ( int i = start ; i <= end ; i++ )
		{
			sum += a[i] ;
		}
		
		return sum ;
	}
	
	public static int myscore( int[] a, int si, int ei )
	{
		
		int fh = 0 ;
		int sh = 0 ;
		
		for ( int i = si ; i < ei ; i++ )
		{
			int sum1 = sum(a,si,i) ;
			int sum2 = sum(a,i+1,ei) ;
			
			if ( sum1 == sum2 )
			{
				fh = myscore(a,si,i) ;
				sh = myscore(a,i+1,ei) ;
				
				return Math.max(fh, sh) + 1 ;
			}
		}
		
		return 0 ;
		
	}
	
}
