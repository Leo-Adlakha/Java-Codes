import java.util.Scanner;

/*ALEX GOES SHOPPING
It is Alex’s birthday and she wants to go shopping. She only has ‘A’ units of money and she wants to spend all of her money. However, she can only purchase one kind of item. She goes to a shop which has ‘n’ types items with prices A0,A1,A2,…,An-1. The shopkeeper claims that he has atleast ‘k’ items she can choose from. Help her find out if the shopkeeper is correct or not.


Input Format:
The first line contains an integer ‘n’ denoting the number of items in the shop. The second line contains ‘n’ space-separated integers describing the respective price of each item. The third line contains an integer ‘q’ denoting the number of queries. Each of the subsequent lines contains two space-separated integers ‘A’ and ‘k’

Constraints:
1<=n,Ai,A<=10^5 where 0<=i<n.
1<=q<=2*n
1<=k<=n
The array may contain duplicate elements.
Output Format:
For each query, print Yes on a new line if the shopkeeper is correct; otherwise, print No instead.

Sample Input:
4
100 200 400 100
5
100 2
200 3
500 4
600 4
800 4
Sample Output:
Yes
Yes
No
No
Yes
Explanation:
In query 1, Alex hai 100 units of money. The shopkeeper claims that she can choose to buy from 2 kinds of items ie item 1 and item 4 each priced at 100.

In query 2, The shopkeeper claims that she can choose to buy from 3 kinds of items ie item 1 and item 4 each priced at 100(she can buy 1 from either of the two) or item 2 priced at 200(she can buy one)

In query 3, she has 500 units of money. She can either buy item 1 or item 4 ( 5 of each kind respectively). Thus, she has only 2 kinds of items to choose from.

In query 5, she has 800 units of money. She can either buy item 1 or item 4 ( 8 of each kind respectively) or item 2(she can buy 4 of these) or item 3(2 of these). Thus, she has 4 kinds of items to choose from.
*/

public class Alex_goes_Shopping {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		int[] prices = takeInput(n) ;
		int queries = scn.nextInt();
		for ( int i = 0 ; i < queries ; i++ )
		{
			int amt = scn.nextInt();
			int possiblecases = scn.nextInt();
			int cases = 0 ;
			for ( int j = 0 ; j < prices.length ; j++ )
			{
				if ( amt % prices[j] == 0 )
				{
					cases++ ;
				}
			}
			if ( cases >= possiblecases )
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
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
	
	public static int findoutcases( int amt, int[] prices )
	{
		int cases = 0 ;
		for ( int i = 0 ; i < prices.length ; i++ )
		{
			if ( amt % prices[i] == 0 )
			{
				cases++ ;
			}
		}
		return cases ;
	}

}
