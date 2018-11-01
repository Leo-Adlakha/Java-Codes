import java.util.Scanner;

/*ONLY LADDERS
Take as input N, a number. N is the size of a snakes and ladders board. There are no snakes but we’ve ladders from 1st prime number to last prime number in range, 2nd prime number to 2nd from last prime number and so-on.

a. Write a recursive function which returns the count of different distinct ways this board can be crossed with a normal dice. Print the value returned.

b. Write a recursive function which prints all valid paths (void is the return type for function).


Input Format:
Enter the size of the snake and ladders board N

Constraints:
None
Output Format:
Display the number of ways in which the board can be crossed and also display all the possible ways to cross the board in a comma separated manner

Sample Input:
3
Sample Output:
4
0 1 2 END , 0 1 END , 0 2 END , 0 END , 
Time Limit: 4 sec*/

public class Only_Ladders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		long start = System.currentTimeMillis();
		Scanner scn = new Scanner (System.in) ;
		int end = scn.nextInt();
		getpath(0, end, " ");
//		long ends = System.currentTimeMillis();
//		System.out.println(ends-start);
		
	}
	
	public static int nextprime( int n )
	{
		int prime = n ;
		for ( int i = n + 1 ;; i++ )
		{
			int p = 0 ;
			for ( int j = 2 ; j < i ; j++ )
			{
				if ( i % j == 0 ) 
				{
					p++ ;
				}
			}
			if ( p == 0 )
			{
				prime = i ;
				break ;
			}
		}
	return prime ;
	}

	public static int lastprime( int n )
	{
		int prime = n ;
		for ( int i = n - 1 ; i > 0 ; i-- )
		{
			int p = 0 ;
			for ( int j = 2 ; j < i ; j++ )
			{
				if ( i % j == 0 ) 
				{
					p++ ;
				}
			}
			if ( p == 0 )
			{
				prime = i ;
				break ;
			}
		}
	return prime ;
	}
	
	public static void getpath( int cur, int end, String ans )
	{
		
		if ( cur == end )
		{
			System.out.print( " 0" + ans + "END ,");
			return ;
		}
		if ( cur > end )
		{
			return ;
		}
		for ( int i = 1 ; i <= 6 ; i++ )
		{
			if ( cur + i != end )
			getpath( cur + i, end, ans + (cur + i) + " " );
			else
			getpath( cur + i, end, ans ) ;
		}
		
		if ( nextprime(cur) != lastprime(end) && nextprime(cur) < lastprime(end) )
		{
		getpath(nextprime(cur),lastprime(end), " " ) ;
		}
		else
		{
			return ;
		}
		
	}
	
	
}
