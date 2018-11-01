import java.util.Scanner;

//IS PALINDROME_2?
//Take as input str, a string. Write a function which tests if the string is a palindrome or not and returns a Boolean value. Print the value returned.
//
//
//Input Format:
//Enter a String
//
//Constraints:
//None
//Output Format:
//Display the boolean result
//
//Sample Input:
//1221
//Sample Output:
//true
public class Palindromeusingrecursions {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		String str = scn.next();
		int i = 0 ;
		System.out.println(palin(str,i));
		
	}
	
	public static boolean palin( String str, int i )
	{
		if( i >= str.length()/2 )
		{
			return true ;
		}
		char chf = str.charAt(i);
		char chb = str.charAt(str.length()-i-1);
		if ( chf == chb )
		{
			return palin(str,i+1);
		}
		else
		{
			return false ;
		}
		
		
	}
	
}
