import java.util.Scanner;

/*STRINGS-COUNT PALINDROMIC SUBSTRINGS
Take as input S, a string. Write a function that returns the count of substrings of this string which are palindromes. Print the value returned.


Input Format:
String

Constraints:
Length of string is between 1 to 1000.
Output Format:
Integer

Sample Input:
abc
Sample Output:
3*/


public class SandTComplexity_Numberofsubstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		String str = scn.next();
		System.out.println(Subseq(str));
		
		
		
	}
	
	public static int Subseq( String str )
	{
		int count = 0 ;
		
		for ( int axis = 0 ; axis < str.length() ; axis++ )
		{
			for ( int orbit = 0 ; axis - orbit >= 0 && axis + orbit < str.length()  ; orbit++ )
			{
				if ( str.charAt(axis - orbit) == str.charAt(axis+orbit) )
				{
					count++ ;
				}
				else
				{
					break ;
				}
			}
		}
		for ( double axis = 0.5 ; axis < str.length() ; axis++ )
		{
			for ( double orbit = 0.5 ; axis - orbit >= 0 && axis + orbit < str.length()  ; orbit++ )
			{
				if ( str.charAt((int) (axis - orbit)) == str.charAt((int) (axis+orbit)) )
				{
					count++ ;
				}
				else
				{
					break ;
				}
			}
		}

		
		return count ;
	}

}
