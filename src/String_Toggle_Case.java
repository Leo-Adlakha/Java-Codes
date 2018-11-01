import java.util.Scanner;

/*STRINGS-TOGGLE CASE
Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.


Input Format:
String

Constraints:
Length of string should be between 1 to 1000.
Output Format:
String

Sample Input:
abC
Sample Output:
ABc*/

public class String_Toggle_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner ( System.in ) ;
		String str = scn.next();
		String ans = "" ;
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i) ;
			if ( ch >= 65 && ch <= 90 )
			{
				ans = ans + (char)(ch + 32) ;
			}
			else
			{
				ans = ans + (char)(ch - 32) ;
			}
		}
		System.out.println(ans);
		
	}

}
