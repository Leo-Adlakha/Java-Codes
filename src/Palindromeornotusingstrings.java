import java.util.Scanner;

public class Palindromeornotusingstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
String str = scn.next();
System.out.println(subpalindrome(str));
	}
	
	
	public static boolean palindrome( String str )
	{
		for ( int i = 0 , j = str.length() - 1 ; i < str.length()/2 ; i++ , j-- )
		{
			if ( str.charAt(i) != str.charAt(j) )
			{
				return false;
			}
		}
		return true ;
	}
	public static void Substrings ( String str )
	{
		for ( int i = 0 ; i < str.length(); i++ )
		{
			for ( int j = i+1 ; j <= str.length() ; j++ )
			{
				System.out.println(str.substring(i, j));
			}
		}
	}
	public static int subpalindrome ( String str )
	{
		int count = 0 ;
		for ( int i = 0 ; i < str.length(); i++ )
		{
			for ( int j = i ; j <= str.length() ; j++ )
			{
				String st = str.substring(i, j);
				boolean bl = palindrome(st);
				if ( bl )
				{
					count++ ;
				}
			}
		}
		return count ;
	}

}
