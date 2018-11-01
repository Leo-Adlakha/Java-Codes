import java.util.Arrays;
import java.util.Scanner;

/*STRINGS-REMOVE DUPLICATES
Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned. E.g. for input "aabccba" print "abcba".


Input Format:
String

Constraints:
A string of length between 1 to 1000
Output Format:
String

Sample Input:
aabccba
Sample Output:
abcba*/

public class Strings_Remove_Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		String ans = "" ;
		for ( int i = 0 ; i < str.length() - 1 ; i++ )
		{
			char ch = str.charAt(i) ;
			char ch2 = str.charAt(i+1) ;
			if ( ch == ch2 )
			{
				continue ;
			}
			ans = ans + ch ;			
		}
		ans = ans + str.charAt( str.length() - 1 ) ;
		System.out.println(ans);
		
		
	}

}
