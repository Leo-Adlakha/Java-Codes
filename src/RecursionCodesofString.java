import java.util.ArrayList;
import java.util.Scanner;

/*RECURSION-CODES OF THE STRING
Take as input str, a string. Assume that value of a=1, b=2, c=3, d=4, …. z=26. Write a recursive function (return type Arraylist) to print all possible codes for the string. E.g. for “1123” possible codes are aabc, kbc, alc, aaw, kw.


Input Format:
Enter a number

Constraints:
None
Output Format:
Display all the possible codes

Sample Input:
1125
Sample Output:
[aabe, aay, ale, kbe, ky]
Time Limit: 4 sec*/

public class RecursionCodesofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(ans(str,"")) ;
			
	}
	
	public static ArrayList<String> ans( String str, String tobeadded )
	{
	 
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>() ;
			base.add(tobeadded) ;
			return base ;
			
		}
		
		String ans = "" ;
		ans += str.charAt(0) ;
		char code = getcode(ans) ;
		String tobeadded1 = tobeadded ;
		tobeadded1 += code ;
		ArrayList<String> myans = new ArrayList<>() ;
		String roq = str.substring(1) ;
		ArrayList<String> recans = ans ( roq, tobeadded1 ) ;
		for ( String val : recans )
		{
			myans.add(val) ;
		}
		if ( str.length() >= 2 && Integer.valueOf(str.charAt(0) + "" + str.charAt(1)) <= 26 )
		{
		ans += str.charAt(1) ;
		char code2 = getcode(ans) ;
		String tobeadded2 = tobeadded ;
		tobeadded2 += code2 ;
		String roq2 ;
		if ( str.length() == 2 )
		{
			roq2 = "" ;
		}
		else
		{
		    roq2 = str.substring(2) ;
		}
		ArrayList<String> recans2 = ans ( roq2, tobeadded2 ) ;
		for ( String val : recans2 )
		{
			myans.add(val) ;
		}
		}
		
		return myans ;
		
	}

	public static char getcode ( String str )
	{
		int val = Integer.valueOf(str) ;
		return (char) (val+96) ; 
	}
}
