import java.util.Scanner;

/*PAIR OF ROSES
Deepak has limited amount of money which he can spend on his girlfriend. So he decided to buy two roses for her. Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount of money on buying roses. As he wishes to spend all the money, he should choose a pair of roses whose prices when summed up are equal to the money that he has. Help Deepak choose such a pair of roses for his girlfriend.
NOTE: If there are multiple solutions print the solution that minimizes the difference between the prices i and j. After each test case you must print a blank line.


Input Format:
First line indicates the number of test cases. Then, in the next line, the number of available roses, N is given. Next line will have N integers, representing the price of each rose, a rose costs less than 1000001. Then there is another line with an integer M, representing how much money Deepak has. There is a blank line after each test case.

Constraints:
1≤ T ≤100
2 ≤ N ≤ 10000
Price[i]<1000001
Output Format:
For each test case you must print the message: ‘Deepak should buy roses whose prices are i and j.’, where i and j are the prices of the roses whose sum is equal do M and i ≤ j. You can consider that it is always possible to find a solution, if there are multiple solutions print the solution that minimizes the difference between the prices i and j. After each test case you must print a blank line.

Sample Input:
2
2
40 40
80

5
10 2 6 8 4
10
Sample Output:
Deepak should buy roses whose prices are 40 and 40.
Deepak should buy roses whose prices are 4 and 6.
Explanation:
Find two such kind of price of roses which has sum up equal to Deepak's Money.

Time Limit: 3 sec*/

public class Pair_of_Roses {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt() ;
			int[] a = takeInput(n) ;
			int target = scn.nextInt() ;
			findpair(a, target) ;
			
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

	public static void findpair ( int[] a, int t )
	{
		int diff = Integer.MAX_VALUE ;
		int t1 = 0 ; 
		int t2 = 0 ;
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			for ( int j = i + 1 ; j < a.length ; j++ )
			{
				if ( a[i] + a[j] == t )
				{
					if ( a[i] > a[j] )
					{
						if ( a[i] - a[j] < diff )
						{
							t1 = a[j] ;
							t2 = a[i] ;
						}
					}
					else
					{
						if ( a[j] - a[i] < diff )
						{
							t1 = a[i] ;
							t2 = a[j] ;
						}
					}
				}
			}
		}
		
		System.out.println("Deepak should buy roses whose prices are " + t1 + " and " + t2 + ".");
	}

}
