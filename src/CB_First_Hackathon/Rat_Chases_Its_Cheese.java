package CB_First_Hackathon;

import java.util.Scanner;

/*RAT CHASES ITS CHEESE
You are given an N*M grid. Each cell (i,j) in the grid is either blocked, or empty. The rat can move from a position towards left, right, up or down on the grid.
Initially rat is on the position (1,1). It wants to reach position (N,M) where it's cheese is waiting for. There exits a unique path in the grid . Find that path and help the rat reach its cheese.


Input Format:
First line contains 2 integers N and M denoting the rows and columns in the grid.
Next N line contains M characters each. An 'X' in position (i,j) denotes that the cell is blocked and ans 'O' denotes that the cell is empty.

Constraints:
1 <= N , M <= 10
Output Format:
Print N lines, containing M integers each. A 1 at a position (i,j) denotes that the (i,j)th cell is covered in the path and a 0 denotes that the cell is not covered in the path.
If a path does not exits then print "NO PATH FOUND"

Sample Input:
5 4
O X O O
O O O X
X O X O
X O O X
X X O O
Sample Output:
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 
Time Limit: 2 sec*/

public class Rat_Chases_Its_Cheese {

	static Scanner scn = new Scanner( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int er = scn.nextInt() - 1 ;
		int ec = scn.nextInt() - 1 ;
		char[][] a = blockage(er + 1 ,ec + 1 );
		boolean[][] b = new boolean[er + 1][ec + 1];
		getmazepath(0,0,er,ec,b,a);

		
	}
	
	public static char[][] blockage( int er , int ec )
	{
		char[][] arr = new char[er][ec];
		for (int i = 0; i < er ; i++) {
			for ( int j = 0 ; j < ec ; j++ ) {
			arr[i][j] = scn.next().charAt(0) ;
			}
		}
		return arr;
	}
	
	public static void getmazepath( int cr , int cc , int er , int ec , boolean[][] b , char[][] a )
	{
		if ( cr == er && cc == ec )
		{
			b[cr][cc] = true ;
			 for ( int i = 0 ; i < b.length ; i++ )
			 {
				 for ( int j = 0 ; j < b[0].length ; j++ )
				 {
					 if ( b[i][j] == true )
					 {
						 System.out.print("1\t");
					 }
					 else
					 {
						 System.out.print("0\t");
					 }
				 }
				 System.out.println();
			 }
			return ;
		}
		if ( cr > er || cc > ec || cr < 0 || cc < 0 || b[cr][cc] == true || a[cr][cc] == 'X' )
		{
			return ;
		}
		 
		b[cr][cc] = true ;
	    getmazepath( cr-1 , cc , er ,ec , b, a);
		getmazepath( cr+1 , cc , er ,ec, b, a);
		getmazepath( cr , cc-1 , er ,ec, b, a);
		getmazepath( cr , cc+1 , er ,ec, b, a);
		b[cr][cc] = false ;
		
	}	


}
