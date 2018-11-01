import java.util.Scanner;

/*RECURSION-CONVERT STRING TO INTEGER
Take as input str, a number in form of a string. Write a recursive function to convert the number in string form to number in integer form. E.g. for “1234” return 1234. Print the value returned.


Input Format:
Enter a number in form of a String

Constraints:
None
Output Format:
Print the number after converting it into integer

Sample Input:
1234
Sample Output:
1234*/

public class StringtoINTEGER {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(convert(str, 0));
	}

	public static int convert ( String str, int ans )
	{
		if ( str.length() == 0 )
		{
			return 0;
		}
		
		char ch = str.charAt(0);
		
		ans = (int) (convert( str.substring(1), ans ) + getnum( ch )*Math.pow(10, str.length() - 1 ));
	
		return ans ;
	}
	
	public static int getnum( char ch )
	{
		return ((int)ch) - 48 ;
	}
	
	
}
