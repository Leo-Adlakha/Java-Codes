import java.util.Scanner;

/*STRINGS-STRING COMPRESSION
Take as input S, a string. Write a function that does basic string compression. Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.


Input Format:
String

Constraints:
A string of length between 1 to 1000
Output Format:
String

Sample Input:
aaabbccds
Sample Output:
a3b2c2ds*/

public class Strng_Compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		String ans = "" ;
		int p = 0 ;
		for ( int i = 0 ; i < str.length() - 1 ; i++ )
		{
			char ch = str.charAt(i) ;
			char ch2 = str.charAt(i+1) ;
			if ( ch == ch2 )
			{
				p++ ;
				continue ;
			}
			p++ ;
			if ( p == 1 )
			{
				ans = ans + ch ;
			}
			else
			{
			ans = ans + ch + p ;	
			}
			p = 0 ;
		}
		char ch1 = str.charAt(str.length() - 2 ) ;
		char ch2 = str.charAt(str.length() - 1 ) ;
		if ( ch1 == ch2 )
		{
			p++ ;
		    ans = ans + str.charAt( str.length() - 1 ) + p ;
		}
		else
		{
			ans = ans + str.charAt( str.length() - 1 ) ;

		}
		System.out.println(ans);
		
	}

}
