import java.util.ArrayList;
import java.util.Scanner;

public class MazePath4blockedrytleftupdownonly {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		int[][] a = blockage(er + 1 ,ec + 1 );
		boolean[][] b = wentornot(er+1,ec+1);
		System.out.println(getmazepath(cr,cc,er,ec,b,a));
				
	}
	
	public static int[][] blockage( int er , int ec )
	{
		int[][] arr = new int[er][ec];
		for (int i = 0; i < er ; i++) {
			for ( int j = 0 ; j < ec ; j++ ) {
			arr[i][j] = scn.nextInt();
			}
		}
		return arr;
	}
	
	public static boolean[][] wentornot( int er , int ec )
	{
		boolean[][] arr = new boolean[er][ec];
		for (int i = 0; i < er ; i++) {
			for ( int j = 0 ; j < ec ; j++ ) {
			arr[i][j] = false ;
			}
		}
		return arr;
	
	}
		
	public static ArrayList<String> getmazepath( int cr , int cc , int er , int ec , boolean[][] b , int[][] a)
	{
		if ( cr == er && cc == ec )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		if ( cr > er || cc > ec || cr < 0 || cc < 0 || b[cr][cc] == true || a[cr][cc] == 1 )
		{
			ArrayList<String> base = new ArrayList<>();  // negative base case
			return base ;
		}
		 
		ArrayList<String> myans = new ArrayList<>();
		b[cr][cc] = true ;
		ArrayList<String> recansU = getmazepath( cr-1 , cc , er ,ec , b, a);
		for ( String val : recansU )
			{
				myans.add("U" + val );
			}
		ArrayList<String> recansD = getmazepath( cr+1 , cc , er ,ec, b, a);
			for ( String val : recansD )
			{
				myans.add("D" + val );
			}
		ArrayList<String> recansL = getmazepath( cr , cc-1 , er ,ec, b, a);
		for ( String val : recansL )
			{
				myans.add("L" + val );
			}
		ArrayList<String> recansR = getmazepath( cr , cc+1 , er ,ec, b, a);
		for ( String val : recansR )
			{
				myans.add("R" + val );
			}
		b[cr][cc] = false ;
		return myans ;
	}	
}
