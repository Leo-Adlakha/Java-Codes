package Codechef_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class Place_Rooks {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ ) {
			
			int N = scn.nextInt();
			int K = scn.nextInt();
			boolean[][] board = new boolean[N][N] ;
			for ( int j = 0 ; j < K ; j++ ) {
				int r = scn.nextInt();
				int c = scn.nextInt();
				board[r-1][c-1] = true ;
			}
			System.out.print(board.length - K);
			placerooks(board, 0, "");
			
		}
	}
	
	public static void placerooks(boolean[][] board, int row, String ans) {
		
		if ( row == board.length ) {
			System.out.print(ans);
			return ;
		}
		
		for ( int col = 0 ; col < board[0].length ; col++ ) {
			
			if ( board[row][col] == false && IsitSafe(board,row,col) ) {
				board[row][col] = true ;
				placerooks(board, row + 1, ans + " " + (row+1) + " " + (col+1) );
				board[row][col] = false ;
				
			}
			
			
		}
		
		placerooks(board, row + 1, ans);
		
		
	}

	public static boolean IsitSafe(boolean[][] board, int row, int col) {
		
		int i = 0 ;
		int j = 0 ;
		j = col ;
		while ( i < board.length ) {
			if (board[i][col] == true ) {
				return false ;
			}
			i++ ;
		}
		
		j = 0 ;
		
		while ( j < board[0].length ) {
			if ( board[row][j] == true ) {
				return false ;
			}
			j++ ;
		}
		
		return true ;
		
	}
	
	
}
