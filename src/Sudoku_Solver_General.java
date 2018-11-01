import java.util.Scanner;

/*SUDOKU SOLVER
You are given an N*N sudoku grid (N is a multiple of 3). Solve the sudoku and print the solution.
To learn more about sudoku, go to this link Sudoku-Wikipedia.


Input Format:
First line contains a single integer N. Next N lines contains N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid. This value is 0, if the cell is empty.

Constraints:
N=6 or N=9,
Solution exists for input matrix.
Output Format:
Print N lines containing N integers each, where jth integer int ith line denotes the value at ith row and jth column in sudoku grid, such that all cells are filled.

Sample Input:
9
5 3 0 0 7 0 0 0 0 
6 0 0 1 9 5 0 0 0 
0 9 8 0 0 0 0 6 0 
8 0 0 0 6 0 0 0 3 
4 0 0 8 0 3 0 0 1 
7 0 0 0 2 0 0 0 6 
0 6 0 0 0 0 2 8 0 
0 0 0 4 1 9 0 0 5 
0 0 0 0 8 0 0 7 9 
Sample Output:
5 3 4 6 7 8 9 1 2 
6 7 2 1 9 5 3 4 8 
1 9 8 3 4 2 5 6 7 
8 5 9 7 6 1 4 2 3 
4 2 6 8 5 3 7 9 1 
7 1 3 9 2 4 8 5 6 
9 6 1 5 3 7 2 8 4 
2 8 7 4 1 9 6 3 5 
3 4 5 2 8 6 1 7 9 
*/

public class Sudoku_Solver_General {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {


		int n = scn.nextInt() ;  
		boolean[][] bl = new boolean[n][n];

		int[][] filled = putininitially(n,n,bl) ;

		
		long start = System.currentTimeMillis();

		sodukosolver(n, filled, bl, "", 0, 0);

		long end = System.currentTimeMillis();

		System.out.println(end - start);

	}

	public static int[][] putininitially(int r, int c, boolean[][] bl) {

		int[][] a = new int[r][c];

		for (int i = 0; i < r; i++) {

			for (int j = 0; j < c; j++) {

				a[i][j] = scn.nextInt();

				if (a[i][j] == 0)

					bl[i][j] = false;

				else

					bl[i][j] = true;

			}

		}

		return a;

	}

	public static void sodukosolver(int n, int[][] filled, boolean[][] filledornot, String ans, int cr, int cc) {

		if (cr == n && cc == 0) {

			System.out.println(ans);

			return;

		}

		for (int i = 1; i <= n; i++) {

			// System.out.println(i);

			if (isitsafe(n, filled, i, cr, cc) && filledornot[cr][cc] == false) {

				filled[cr][cc] = i;

				filledornot[cr][cc] = true;

				if (cc < n - 1)

					sodukosolver(n, filled, filledornot, ans + i, cr, cc + 1);

				else if (cc == n - 1 )

					sodukosolver(n, filled, filledornot, ans + i + "\n", cr + 1, 0);

				filledornot[cr][cc] = false;

				// once you have set the value i then undo your work, and reset to 0
				filled[cr][cc] = 0;

			} else if (filledornot[cr][cc] == true) {

				if (cc < n - 1 )

					sodukosolver(n, filled, filledornot, ans + filled[cr][cc], cr, cc + 1);

				else if (cc == n - 1 )

					sodukosolver(n, filled, filledornot, ans + filled[cr][cc] + "\n", cr + 1, 0);

				// if true is already set then simply break, no need to run loop for 8 times bcz
				// unnecessary there will be many recursive calls
				break;

			}

		}

	}

	public static boolean isitsafe(int n, int[][] filled, int num, int cr, int cc) {

		// row

		int r = cr;

		int c = 0;

		while (c < filled[0].length) {

			if (filled[r][c] == num && c != cc)

				return false;

			c++;

		}

		// column

		r = 0;

		c = cc;

		while (r < filled.length) {

			if (filled[r][c] == num && r != cr)

				return false;

			r++;

		}

		// box of its own

		int ri;

		int rf;

		int ci;

		int cf;
		
		ri = ( cr / (n/3) ) * (n/3) ;
		rf = ( ri + ((n/3) - 1 ) ) ;
		ci = ( cc / (n/3) ) * (n/3) ;
		cf = ( ci + ((n/3) - 1 ) ) ;

		for (int i = ri; i <= rf; i++) {

			for (int j = ci; j <= cf; j++) {

				if (filled[i][j] == num) {

					return false;

				}

			}

		}

		return true;

	}

}
