import java.util.Scanner;

//SUM OF THE DIGITS
//Take as input str, a number in form of a string. Write a recursive function to find the sum of digits in the string. Print the value returned.
//
//
//Input Format:
//Enter the number
//
//Constraints:
//None
//Output Format:
//Display the sum of the digits
//
//Sample Input:
//1234
//Sample Output:
//10
public class sumofdigitsinastring {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String str = scn.next();
		int i = 0 ;
		System.out.println(sum(str,i));
		
	}

	public static int sum(String str, int i )
	{
		if ( i == str.length() )
		{
			return 0;
		}
		char ch = str.charAt(i);
		int n = assignnum(ch);
		int ans = n + sum(str, i + 1 );
		return ans ;
	}
	
	public static int assignnum( char ch )
	{
		if ( ch == 49 )
		{
			return 1 ;
		}
		else if ( ch == 50 )
		{
			return 2 ;
		}
		else if ( ch == 51 )
		{
			return 3 ;
		}
		else if ( ch == 52 )
		{
			return 4 ;
		}
		else if ( ch == 53 )
		{
			return 5 ;
		}
		else if ( ch == 54 )
		{
			return 6 ;
		}
		else if ( ch == 55 )
		{
			return 7 ;
		}
		else if ( ch == 56 )
		{
			return 8 ;
		}
		else if ( ch == 57 )
		{
			return 9 ;
		}
		else
		{
			return 0 ;
		}
	}
	
	
}
