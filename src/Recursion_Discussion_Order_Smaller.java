import java.util.Scanner;

/*RECURSION-DICTIONARY ORDER(SMALLER)
Take as input str, a string. Write a recursive function which returns all the words possible by rearranging the characters of this string which are in dictionary order smaller than the given string.


Input Format:
Enter a string

Constraints:
None
Output Format:
Display all the words which are in dictionary order smaller than the string entered

Sample Input:
cab
Sample Output:
acb
abc
bca
bac*/

public class Recursion_Discussion_Order_Smaller 
{

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) 
	{
		
		String str = scn.next();
		permutations (str,"",str) ;

	}

	public static void permutations(String str, String ans,String orig ) 
	{
		
		if ( str.length() == 0 )
		{
			System.out.println(ans);
			return ;
		}
		
		for ( int i = 0 ; i < str.length(); i++ ) 
		{
			char ch = str.charAt(i);
			String S1 = str.substring(0, i);
			String S2 = str.substring(i+1);
			String roq = S1 + S2 ;
			String O1 = orig.substring(0, i);
			String O2 = orig.substring(i+1);
			String norig = O1 + O2 ;
			if ( ch < orig.charAt(str.length() - 1) )
				permutations(roq,ans + ch,norig );
			else
				continue ;
		}
		
	}

}
