import java.util.Scanner;

/*MOVE ALL X AT END
Take as input str, a string. Write a recursive function which moves all ‘x’ from the string to its end. E.g. for “abexexdexed” return “abeedeedxxx”. Print the value returned


Input Format:
Enter the string

Constraints:
None
Output Format:
Display the string with all x's moved at the end

Sample Input:
axbxa
Sample Output:
abaxx*/

public class MoveAllXattheEND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		ans(str,"",0);
	}
	
	public static void ans(String str, String ans, int p )
	{
		if ( str.length() == 1 )
		{
			ans = ans + str.charAt(0);
			for ( int i = 0 ; i < p ; i++ )
			{
				ans += "x" ;
			}
			System.out.println(ans);
			return ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1);
		if ( ch == 'x' )
		{
			p++ ;
			ans(roq, ans, p) ;
		}
		else
		{
			ans(roq, ans + ch, p);
		}
		
	}		

}
