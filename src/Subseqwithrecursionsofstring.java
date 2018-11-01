import java.util.ArrayList;
import java.util.Scanner;

public class Subseqwithrecursionsofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		ArrayList<String> ans = subseq(str);
		System.out.println(ans);
//		ArrayList<String> ans = subseqwithascii(str);
//		System.out.println(ans);
	}
	
	public static ArrayList<String> subseq( String str )
	{
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> recans = subseq(ros);
		ArrayList<String> myres = new ArrayList<>();
		
		for ( String val : recans )
		{
			myres.add(val);
			myres.add( ch + val );
		}
		return myres ;
	}

	public static ArrayList<String> subseqwithascii( String str )
	{
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		char ch = str.charAt(0);
		String ros = str.substring(1);
		
		ArrayList<String> recans = subseqwithascii(ros);
		ArrayList<String> myres = new ArrayList<>();
		
		for ( String val : recans )
		{
			myres.add(val);
			myres.add( ch + val );
			myres.add((int)ch + val );
		}
		return myres ;
	}
}
