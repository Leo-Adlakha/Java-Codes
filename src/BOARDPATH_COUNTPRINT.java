import java.util.Scanner;

/*BOARDPATH(COUNT , PRINT)
Take as input N, a number. N is the size of a snakes and ladder board (without any snakes and ladders). Take as input M, a number. M is the number of faces of the dice.

a. Write a recursive function which returns the count of different ways the board can be traveled using the dice. Print the value returned.

b. Write a recursive function which prints dice-values for all valid paths across the board (void is the return type for function).


Input Format:
Enter a number N (size of the board) and number M(number of the faces of a dice)

Constraints:
None
Output Format:
Display the number of paths and print all the paths in a space separated manner

Sample Input:
3
3
Sample Output:
4
111 12 21 3 
Time Limit: 4 sec
*/

public class BOARDPATH_COUNTPRINT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
		System.out.println(getboardpathways(0, n,m )) ;
		getboardpathans(0, n, m, "") ;
	}

	public static void getboardpathans (int cur, int n , int m , String ans )
	{
		
		if ( cur == n )
		{
			System.out.print(ans + "\t");
			return ;
		}
		
		for ( int i = 1 ; i <= m && cur + i <= n ; i++ )
		{
			getboardpathans(cur + i, n, m, ans + i );
		}
		
		return ;
		
		
		
	}
	
	public static int getboardpathways (int cur, int n , int m )
	{
		
		if ( cur == n )
		{
			return 1 ;
		}
		
		int ways = 0 ;
		
		for ( int i = 1 ; i <= m && cur + i <= n ; i++ )
		{
			ways += getboardpathways(cur + i, n, m);
		}
		
		return ways ;
		
		
		
	}
	
	
}
