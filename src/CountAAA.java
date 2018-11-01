import java.util.Scanner;

/*COUNT AAA
Take as input str, a string

a.) Write a recursive function which counts, the number of times “aaa” appears in the string. Print the value returned.

b.) Write a recursive function which counts, the number of times “aaa” appears in the string, but only such instances of “aaa” should be considered which do not overlap. Print the value returned.


Input Format:
Enter a string

Constraints:
None
Output Format:
Display the number of times ''aaa'''appears (1. overlapping allowed , 2. overlapping not allowed)

Sample Input:
aaaaa
Sample Output:
3
1*/

public class CountAAA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ansOver(str,0);
		ansNoOver(str,0);
		
	}
	
	public static void ansOver(String str, int ans )
	{
		if ( str.length() == 2 )
		{
			System.out.println(ans);
			return ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1);
		if ( ch == roq.charAt(0) && ch == roq.charAt(1) )
		{
			ans++ ;
			ansOver(roq, ans) ;
		}
		else
		{
			ansOver(roq, ans);
		}
		
	}	
	public static void ansNoOver(String str, int ans )
	{
		if ( str.length() <= 2 )
		{
			System.out.println(ans);
			return ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1);
		if ( ch == roq.charAt(0) && ch == roq.charAt(1) )
		{
			String roq2 = roq.substring(2) ;
			ans++ ;
			ansNoOver(roq2, ans ) ;
		}
		else
		{
			ansNoOver(roq, ans );
		}
		
	}	

}
