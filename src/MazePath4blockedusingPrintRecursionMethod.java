import java.util.ArrayList;
import java.util.Scanner;

public class MazePath4blockedusingPrintRecursionMethod {

	static Scanner scn = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		int[][] a = blockage(er + 1 ,ec + 1 );
		boolean[][] b = wentornot(er+1,ec+1);
		getmazepath(cr,cc,er,ec,b,a,"");
		
		
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
	
	public static void getmazepath( int cr , int cc , int er , int ec , boolean[][] b , int[][] a, String ans)
	{
		if ( cr == er && cc == ec )
		{
			System.out.println(ans);
			return ;
		}
		if ( cr > er || cc > ec || cr < 0 || cc < 0 || b[cr][cc] == true || a[cr][cc] == 1 )
		{
			return ;
		}
		 
		b[cr][cc] = true ;
	    getmazepath( cr-1 , cc , er ,ec , b, a, ans + "U");
		getmazepath( cr+1 , cc , er ,ec, b, a, ans + "D");
		getmazepath( cr , cc-1 , er ,ec, b, a,ans + "L");
		getmazepath( cr , cc+1 , er ,ec, b, a, ans + "R");
		b[cr][cc] = false ;
		
	}	

	
	
}
