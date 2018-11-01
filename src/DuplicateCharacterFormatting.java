import java.util.Scanner;

/*RECURSION-DUPLICATE CHARACTER FORMATTING
Take as input str, a string. Write a recursive function which returns a new string in which all duplicate consecutive characters are separated by a ‘’. E.g. for “hello” return “hello”. Print the value returned


Input Format:
Enter a String

Constraints:
None
Output Format:
Display the resulting string (i.e after inserting (*) b/w all the duplicate characters)

Sample Input:
hello
Sample Output:
hel*lo*/

public class DuplicateCharacterFormatting {

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
			ans(roq, ans + ch + "*" ) ;
		}
		else
		{
			ans(roq, ans + ch );
		}
		
		
		
	}

}
