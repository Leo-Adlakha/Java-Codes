import java.util.Scanner;

/*N_QUEEN PROBLEM
Take as input N, the size of a chess board. We are asked to place N number of queens in it, so that no queen can kill other.

a. Write a recursive function which returns the count of different distinct ways the queens can be placed across the board. Print the value returned.

b. Write a recursive function which prints all valid configurations (void is the return type for function).


Input Format:
Enter the number N(Size of the chessboard)

Constraints:
None
Output Format:
Display the number of possible ways of arranging N queens and print all the possible arrangements in a space separated manner

Sample Input:
4
Sample Output:
2
{1-2} {2-4} {3-1} {4-3}  {1-3} {2-1} {3-4} {4-2}
Time Limit: 4 sec*/

public class NQueensusingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int n = scn.nextInt();
		boolean[][] board = new boolean[n][n] ;
		System.out.println(NQueenscount(board,0));
		NQueens(board, 0, "");
		
		
		
	}
	
	public static int NQueenscount( boolean[][] board, int row )
	{
		if ( row == board.length )
		{
			return 1 ;
		}
		
		int count = 0 ;
		for ( int col = 0 ; col < board[0].length ; col++ )
		{
	
			if ( IsItSAFEtoplaceQueen(board,row,col) )
			{
			board[row][col] = true ;
			count += NQueenscount( board, row + 1 );
			board[row][col] = false ;
			}
			
		}
		
		return count ;
		
	}
	
	
	public static void NQueens( boolean[][] board, int row, String ans )
	{
		if ( row == board.length )
		{
			System.out.print(ans+'\t');
			return ;
		}
		
		
		for ( int col = 0 ; col < board[0].length ; col++ )
		{
	
			if ( IsItSAFEtoplaceQueen(board,row,col) )
			{
			board[row][col] = true ;
			NQueens( board, row + 1 , ans + "{" + (row+1) + "-" + (col+1) + "} ");
			board[row][col] = false ;
			}
			
		}
		
		
	}
	
	
	public static boolean IsItSAFEtoplaceQueen(boolean[][] board, int row , int col )
	{
		
		int r = row - 1 ;
		int c = col ;
		
		while ( r >= 0)
		{
			if ( board[r][c] )
				return false ;
			
			r-- ;
		}
		
		r = row - 1 ;
		c = col - 1 ;
		
		while ( r >= 0 && c >= 0 )
		{
			if ( board[r][c] )
				return false ;
			
			r-- ;
			c-- ;
		}
		
		r = row - 1 ;
		c = col + 1 ;
		
		while ( r >= 0 && c <= board[0].length - 1 )
		{
			if ( board[r][c] )
				return false ;
			
			r-- ;
			c++ ;
		}
		
		return true ;
		
	}
	
	
}
