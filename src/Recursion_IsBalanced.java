import java.util.Scanner;

/*RECURSION-ISBALANCED
Take as input str, a string. The string is a mathematical expression e.g. “[a + {b + (c + d) + e} + f]”. Write a recursive function which tests if the brackets in expression are balanced or not and returns a Boolean value. Print the value returned.


Input Format:
Enter the string

Constraints:
None
Output Format:
Display the boolean result

Sample Input:
[a + {b + (c + d) + e} + f]
Sample Output:
true*/


public class Recursion_IsBalanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner( System.in ) ;
		String str = scn.next() ;
		System.out.println(isbalanced(str,"")) ;
		
		
	}
	
	public static boolean isbalanced(String str, String ans)
	{
		
		if ( str.length() == 0 )
		{
			if ( ans.length() == 0 )
			    return true ;
			else
				return false ;
		}
		
		char ch = str.charAt(0) ;
		
		if ( ch == '{' || ch == '(' || ch == '[' )
		{
			ans += ch ;
		}
		else if ( ch == '}' || ch == ')' || ch == ']' )
		{
			
			if ( ans.length() == 0 )
			{
				return false ;
			}
			else
			{
			
				if ( ans.charAt(ans.length() - 1) == '{' && ch != '}' )
				{
					return false ; 
				}
				else if ( ans.charAt(ans.length() - 1) == '(' && ch != ')' )
				{
					return false ; 
				}
				else if ( ans.charAt(ans.length() - 1) == '[' && ch != ']' )
				{
					return false ; 
				}
				else
				{
					ans = ans.substring(0, ans.length() - 1 ) ;
				}
				
			}
			
		}
		
		str = str.substring(1) ;
		return isbalanced(str, ans) ;
		
	}

}
