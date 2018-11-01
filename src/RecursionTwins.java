import java.util.Scanner;

/*RECURSION-TWINS
Take as input str, a string. A “twin” is defined as two instances of a char separated by a char. E.g. "AxA" the A's make a “twin”. “twins” can overlap, so "AxAxA" contains 3 “twins” - 2 for A and 1 for x. Write a function which recursively counts number of “twins” in a string. Print the value returned.


Input Format:
Enter the string

Constraints:
None
Output Format:
Display the number of twins

Sample Input:
AXAXA
Sample Output:
3*/

public class RecursionTwins {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		boolean[] bl = new boolean[256] ;
		ans(str,0,bl);
		
	}

	public static void ans(String str, int ans, boolean[] visited )
	{
		if ( str.length() == 2 )
		{
			System.out.println(ans);
			return ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1);
		if ( ch == roq.charAt(1) && !visited[ch] )
		{
			ans++ ;
			visited[ch] = true ;
			ans(roq, ans, visited) ;
		}
		else
		{
			ans(roq, ans , visited );
		}
		
	}		

	
}
