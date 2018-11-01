import java.util.Scanner;

/*CHESSBOARD PROBLEM( COUNT , PRINT)
Take as input N, a number. N represents the size of a chess board. We’ve a piece standing in top-left corner and it must reach the bottom-right corner. The piece moves as follows –

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
Display the total number of valid paths and print all the valid paths in a space separated manner

Sample Input:
2
Sample Output:
3
{0-0}R{0-1}R{1-1} {0-0}R{1-0}R{1-1} {0-0}B{1-1}
Time Limit: 4 sec*/

public class Chess_Board_Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int n = scn.nextInt();
		
		System.out.println(getmazepathways(0, 0, n-1, n-1));
		getmazepath(0,0,n-1,n-1,"{0-0}");
		
	}
	
	public static int getmazepathways(int cr, int cc, int er, int ec )
	{
		if ( cr == er && cc == ec )
		{
			return 1;
		}
		if ( cr > er || cc > ec )
		{
			return 0;
		}
		
		int waysK1 = 0 ;
		int waysK2 = 0 ;
		waysK1 += getmazepathways(cr+2,cc+1,er,ec) ;
		waysK2 += getmazepathways(cr+1,cc+2,er,ec) ;
		int waysR1 = 0 ; 
		int waysR2 = 0 ;
		int waysB = 0 ;		
				
				
		if ( cr == 0 || cr == er || cc == 0 || cc == ec )
		{
		for ( int i = 1 ; i <= ec ; i++ )
		{
			waysR1 += getmazepathways(cr,cc+i,er,ec) ;
		}
		for ( int i = 1 ; i <= er ; i++ )
		{
			waysR2 += getmazepathways(cr+i,cc,er,ec) ;
		}
		}
		
		if ( cr == cc || cr + cc == er )
		{
			
			for ( int i = 1 ; i <= ec ; i++ )
			{
				waysB += getmazepathways(cr+i,cc+i,er,ec) ;
			}
		}
		
		
		return waysK1 + waysK2 + waysR1 + waysR2 + waysB ;
	}
	
	public static void getmazepath(int cr, int cc, int er, int ec, String ans )
	{
		if ( cr == er && cc == ec )
		{
			System.out.print(ans+" ");
			return ;
		}
		if ( cr > er || cc > ec )
		{
			return ;
		}
		
		getmazepath(cr+2,cc+1,er,ec,ans+"K{" + (cr+2) + "-" + (cc + 1) + "}" ) ;
		getmazepath(cr+1,cc+2,er,ec,ans+"K{" + (cr+1) + "-" + (cc + 2) + "}" ) ;
		
		if ( cr == 0 || cr == er || cc == 0 || cc == ec )
		{
		for ( int i = 1 ; i <= ec ; i++ )
		{
			getmazepath(cr,cc+i,er,ec,ans+"R{" + cr + "-" + (cc+i) + "}" ) ;
		}
		for ( int i = 1 ; i <= er ; i++ )
		{
			getmazepath(cr+i,cc,er,ec,ans+"R{" + (cr+i) + "-" + cc + "}" ) ;
		}
		}
		
		if ( cr == cc || cr + cc == er )
		{
			
			for ( int i = 1 ; i <= ec ; i++ )
			{
				getmazepath(cr+i,cc+i,er,ec,ans+"B{" + (cr+i) + "-" + (cc+i) + "}" ) ;
			}
		}
	}

}
