package Dynamic_Programming;

import java.util.Scanner;

public class Wildcard {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = scn.next() ;
		String pattern = scn.next() ;
		
		boolean bl = wildcardmatch(text, pattern) ;
		
		if ( bl )
		{
			System.out.println("MATCHED");
		}
		else
		{
			System.out.println("NOT MATCHED");
		}
		
	}
	
	public static boolean wildcardmatch ( String txt, String Pattern )
	{
		
		if ( txt.length() == 0 && Pattern.length() == 0 )
		{
			return true ;
		}
		
		if ( txt.length() != 0 && Pattern.length() == 0 )
		{
			return false ;
		}
		
		if ( txt.length() == 0 && Pattern.length() != 0 )
		{
			for ( int i = 0 ; i < Pattern.length() ; i++ )
			{
				if ( Pattern.charAt(i) != '*' )
				{
					return false ; 
				}
			}
			return true ;
		}
		
		char chtxt = txt.charAt(0) ;
		char chpat = Pattern.charAt(0) ;
		
		String rostxt = txt.substring(1) ;
		String rospat = Pattern.substring(1) ;
		
		boolean ans = false ;
		if (  chpat == '*' )	
		{
			ans = wildcardmatch(rostxt, rospat) || wildcardmatch(rostxt, Pattern);
		}
		else if ( chpat == '?' || chtxt == chpat ) 
		{
			ans = wildcardmatch(rostxt, rospat) ;
		}
		else
		{
			ans = false ;
		}
		
		return ans ;
		
		
		
		
	}

}
