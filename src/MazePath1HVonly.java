import java.util.ArrayList;
import java.util.Scanner;

public class MazePath1HVonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
//		int cr = scn.nextInt();
		int cr = 0 ;
//		int cc = scn.nextInt();
		int cc = 0 ;
		int er = scn.nextInt() - 1;
		int ec = scn.nextInt() - 1;
		int[][] b = new int[er+1][ec+1] ;
		
		for ( int i = 0 ; i < er + 1 ; i++ ) {
			String str = scn.next();
			for ( int j = 0 ; j < ec + 1 ; j++ ) {
				b[i][j] = str.charAt(j) ;
			}
		}
		
		ArrayList<String> list = getmazepath(cr,cc,er,ec, b);
		
		long ans = 0 ;
		
		for ( String i : list ) {
			if ( palindrome(i)) {
				ans++ ; 
			}
		}
		
		System.out.println(ans);
		
		
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

	public static ArrayList<String> getmazepath( int cr , int cc , int er , int ec, int[][] b )
	{
		if ( cr == er && cc == ec )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base ;
		}
		if ( cr > er || cc > ec )
		{
			ArrayList<String> base = new ArrayList<>();
			return base ;
		}
		 
		ArrayList<String> myans = new ArrayList<>();
		ArrayList<String> recansH = getmazepath( cr , cc+1 , er ,ec, b );
		ArrayList<String> recansV = getmazepath( cr+1 , cc , er ,ec, b );
		for ( String val : recansH )
		{
			myans.add(b[cr][cc] + val );
		}
		for ( String val : recansV )
		{
			myans.add(b[cr][cc] + val );
		}
		
		return myans ;
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
