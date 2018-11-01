import java.util.Scanner;

public class NKnightsusingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n] ;
		NKnights(board, 0, 0, "",0);
		
		
	}
	
	public static void NKnights( boolean[][] board, int row, int col, String ans, int ksf ) // 
	{
		if ( ksf == row )
		{
			System.out.println(ans);
			return ;
		}
		
		if ( col < board[0].length - 1 )
		{
			board[row][col] = true ;
			NKnights(board, row, col + 1, ans + "[" + row + "-" + col + "]", ksf + 1 );
			board[row][col] = false ;
		}
		else if ( col == board[0].length - 1 )
		{
			board[row][col] = true ;
			NKnights(board, row + 1 , 0, ans + "[" + row + "-" + col + "]", ksf + 1 );
			board[row][col] = false ;
		}
		
	}
	
	public static boolean IsItSAFEtoplaceKnight(boolean[][] board, int row , int col )
	{
		
		int r ;
		int c ;
		
		if ( row > 0 && col > 1 )
		{
		r = row - 1 ;
		c = col - 2 ;
		if ( board[r][c] )
			return false ;
		}
		
		if ( row > 1 && col > 0 )
		{
		r = row - 2 ;
		c = col - 1 ;
		
		if ( board[r][c] )
			return false ;
		}
		
		if ( row > 1 && col < board[0].length - 1 )
		{
		r = row - 2 ;
		c = col + 1 ;
		
		if ( board[r][c] )
			return false ;
		}
		
		
		if ( row > 0 && col < board[0].length - 2 )
		{
		r = row - 1 ;
		c = col + 2 ;
		
		if ( board[r][c] )
			return false ;
		}
		
		return true ;
		
	}

}
