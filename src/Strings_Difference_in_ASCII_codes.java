import java.util.Scanner;

/*STRINGS-DIFFERENCE IN ASCII CODES
Take as input S, a string. Write a function that inserts between each pair of characters the difference between their ascii codes. Print the value returned.


Input Format:
String

Constraints:
Length of String should be between 2 to 1000.
Output Format:
String

Sample Input:
abc
Sample Output:
a1b1c*/

public class Strings_Difference_in_ASCII_codes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		String ans = "" ;
		int diff = 0 ;
		for ( int i = 0 ; i < str.length() - 1 ; i++ )
		{
			char ch = str.charAt(i) ;
			char ch2 = str.charAt(i+1) ;
			diff = ch2 - ch ;
			ans = ans + ch + diff ;			
		}
		ans = ans + str.charAt( str.length() - 1 ) ;
		System.out.println(ans);
		
	}

}
