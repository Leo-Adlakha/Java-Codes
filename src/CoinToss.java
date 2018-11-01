import java.util.ArrayList;
import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int i = n ;
		System.out.println(outcomes(n, i));
		
		
		
	}
	
	public static ArrayList<String> outcomes( int n , int i )
	{
		if ( i == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		ArrayList<String> myres = new ArrayList<>();
		ArrayList<String> recans = outcomes(n,i-1);
		
		for ( String val : recans )
		{
			myres.add("H" + val );
			myres.add("T" + val );
		}
		
		return myres ;
		
	}

}
