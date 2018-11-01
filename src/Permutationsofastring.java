import java.util.ArrayList;
import java.util.Scanner;

public class Permutationsofastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		String str = scn.next();
		ArrayList<String> ans = per(str) ;
		System.out.println(ans);
		System.out.println(ans.size());
	}

	public static ArrayList<String> per ( String str )
	{
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		char ch = str.charAt(0);
		
		String ros = str.substring(1);
		
		ArrayList<String> recans = per(ros);
		
		ArrayList<String> myans = new ArrayList<>();
		
		for ( String val : recans )
		{
			for ( int j = 0 ; j <= val.length() ; j++ )
			{
			String S1 = ros.substring(0, j);
			String S2 = ros.substring(j);
			myans.add(S1 + ch + S2);
			}
		}
		return myans ;
	}
}
