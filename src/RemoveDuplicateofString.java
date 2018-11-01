import java.util.Scanner;

/*REMOVE DUPLICATES CHARACTERS
Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are reduced to a single char. E.g. for “hello” return “helo”. Print the value returned.


Input Format:
Enter the string

Constraints:
None
Output Format:
Display the resulting string

Sample Input:
hello
Sample Output:
helo*/

public class RemoveDuplicateofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ans(str,"");
				
	}
	
	public static void ans(String str, String ans )
	{
		if ( str.length() == 1 )
		{
			System.out.println(ans + str.charAt(0));
			return ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1);
		if ( ch == roq.charAt(0) )
		{
			ans(roq, ans ) ;
		}
		else
		{
			ans(roq, ans + ch );
		}
		
	}	
		
	

}
