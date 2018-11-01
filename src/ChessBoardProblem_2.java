import java.util.Arrays;
import java.util.Scanner;

/*CHESSBOARD PROBLEM_2(COUNT, PRINT)
Take as input N, a number. N represents the size of a chess board. The cells in board are numbered. The top-left cell is numbered 1 and numbering increases from left to right and top to bottom. E.g. The following is the chessboard for a value of n=4.

1     2    3    4

5     6    7    8

9     10   11   12

13    14   15   16
Prime numbers act as mines and ports alternately i.e. first prime number is a mine while second is a port and so on. Piece can go over a mine but cannot stop on it. Piece can directly move from a port to the destination (but may not chose to).

We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

a. In any cell, the piece moves like a knight. But out of the possible 8 moves for a knight, only the positive ones are valid i.e. both row and column must increase in a move.

b. On the walls (4 possible walls), the piece can move like a rook as well (in addition of knight moves). But, only the positive moves are allowed i.e. as a rook, piece can move any number of steps horizontally or vertically but in a manner, such that row or column must increase.

c. On the diagonals (2 possible diagonals), the piece can move like a bishop as well (in addition to the knight and possibly rook moves). But, only the positive moves are allowed i.e. as a bishop, piece can move in a way such that row and column must increase.

You are supposed to write the following functions

a. Write a recursive function which returns the count of different distinct ways this board can be crossed. Print the value returned.

b. Write a recursive function which prints all valid paths (void is the return type for function).


Input Format:
Enter the size of the chessboard N

Constraints:
None
Output Format:
Display the total number of ways to cross the board and display all the possible paths in a space separated manner

Sample Input:
2
Sample Output:
3
{0-0}R{1-0}P{1-1} {0-0}R{1-0}R{1-1} {0-0}B{1-1} 
Time Limit: 4 sec*/

public class ChessBoardProblem_2 {

	static Scanner scn = new Scanner ( System.in ) ;  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[][] board = new int[n][n] ;
		int count = 1 ;
		for ( int i = 0 ; i < n ; i++ )
		{
			for ( int j = 0 ; j < n ; j++ )
			{
				board[i][j] = count ;
				count++ ;
			}
		}
		setboard(board,n*n) ;
		
		getmazepath(0, 0, n-1, n-1, "{0-0}", board);
		
		
		
		
	}
	
	public static void setboard(int[][] board, int n ) 
	{
		
		boolean[] primes = new boolean[n+1] ;
		Arrays.fill(primes, true);
		primes[0] = false ;
		primes[1] = false ;
		for ( int i = 2 ; i*i <= n ; i++ )
		{
			if ( primes[i] )
			{
			for ( int mul = 2 ; mul*i <= n ; mul++ )
			{
				primes[i*mul] = false ;
			}
			}
		}
		
		int count = 1 ;
		for ( int i = 0 ; i < n ; i++ )
		{
			int r = (int) (i / Math.pow(n, 0.5)) ;
			int c = (int) (i % Math.pow(n, 0.5)) ;
			if ( primes[i] == true )
			{
				if ( count % 2 != 0 )
				{
				    board[r][c] = 1 ;
				    count++ ;
				}
				else
				{
					board[r][c] = 2 ;
					count++ ;
				}
			}
			else
			{
				board[r][c] = 0 ;
			}
		}
		
		n = (int) Math.pow(n, 0.5) ;
		
		for ( int i = 0 ; i < board.length ; i++ )
		{
			for ( int j = 0 ; j < board[0].length ; j++ )
			{
				if ( i == 0 && j == 0 )
				{
					continue ;
				}
				if ( j != 0 )
				{
					int t = board[i][j] ;
					board[i][j-1] = t ;
				}
				else
				{
					int t = board[i][j] ;
					board[i-1][n-1] = t ;
				}
			}
		}
		
		board[n-1][n-1] = 0 ;
		
	}

	static boolean bl = false ;
	public static void getmazepath(int cr, int cc, int er, int ec, String ans, int[][] board )
	{
		
		if ( cr == er && cc == ec )
		{
			System.out.print(ans+" ");
			return ;
		}
		if ( cr > er || cc > ec || board[cr][cc] == 1 )
		{
			return ;
		}
		
		if ( board[cr][cc] == 2 )
		{
			System.out.print(ans + "P{" + er + "-" + ec + "}" );
			bl = true ;
			return ;
		}
		
		getmazepath(cr+2,cc+1,er,ec,ans+"K{" + (cr+2) + "-" + (cc + 1) + "}", board ) ;
		if ( bl )
		{
			bl = false ;
			return ;
		}
		getmazepath(cr+1,cc+2,er,ec,ans+"K{" + (cr+1) + "-" + (cc + 2) + "}", board ) ;
		if ( bl )
		{
			bl = false ;
			return ;
		}
		
		if ( cr == 0 || cr == er || cc == 0 || cc == ec )
		{
		for ( int i = 1 ; i <= ec ; i++ )
		{
			getmazepath(cr,cc+i,er,ec,ans+"R{" + cr + "-" + (cc+i) + "}", board ) ;
			if ( bl )
			{
				bl = false ;
				return ;
			}
		}
		for ( int i = 1 ; i <= er ; i++ )
		{
			getmazepath(cr+i,cc,er,ec,ans+"R{" + (cr+i) + "-" + cc + "}", board ) ;
			if ( bl )
			{
				bl = false ;
				return ;
			}
		}
		}
		
		if ( cr == cc || cr + cc == er )
		{
			
			for ( int i = 1 ; i <= ec ; i++ )
			{
				getmazepath(cr+i,cc+i,er,ec,ans+"B{" + (cr+i) + "-" + (cc+i) + "}", board ) ;
				if ( bl )
				{
					bl = false ;
					return ;
				}
			}
		}
	}

}
