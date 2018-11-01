import java.util.Scanner;

/*STRINGS-ODD EVEN CHARACTER
Take as input S, a string. Write a function that replaces every odd character with the character having just higher ascii code and every even character with the character having just lower ascii code. Print the value returned.


Input Format:
String

Constraints:
Length of string should be between 1 to 1000.
Output Format:
String

Sample Input:
aba
Sample Output:
bab*/

public class Strings_Odd_Even_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		String ans = "" ;
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i) ;
			if ( i % 2 == 0 )
			{
				ans = ans + (char)(ch + 1 ) ;
			}
			else
			{
				ans = ans + (char)(ch - 1 ) ;
			}
		}
		
		System.out.println(ans);
	}

}
