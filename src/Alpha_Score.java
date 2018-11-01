import java.util.Scanner;

/*ALPHA SCORE
You are climbing up using stairs where a number is written on each stair. At each step we define the alpha score as sum of all the numbers previously seen on the stairs which are smaller than the present number. Alpha score of the whole journey is defined as the sum of all the alpha scores at each step. Print the alpha score of whole journey modulus 1000000007.


Input Format:
First line contains a single integer n denoting the number of stairs. Next line contains n space separated integers denoting the numbers written on stairs.

Constraints:
1 <= n <= 10^5
Every number written on stair lies between [0,10^9]
Output Format:
Single integer denoting the alpha score of the journey modulus 1000000007.

Sample Input:
5
1 5 3 6 4
Sample Output:
15
Time Limit: 5 sec*/

public class Alpha_Score {

	static Scanner scn = new Scanner (System.in) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		int[] a = takeInput(n) ;
		int ultimatealpha = 0 ;
		for ( int i = 1 ; i < a.length ; i++ )
		{
			int alpha = 0 ;
			for ( int j = i - 1 ; j >= 0 ; j-- )
			{
				if ( a[j] < a[i] )
				{
					alpha += a[j] ;
				}
			}
			ultimatealpha += alpha ;
		}
		System.out.println(ultimatealpha);
		
		
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
