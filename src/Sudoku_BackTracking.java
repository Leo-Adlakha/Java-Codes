import java.util.Scanner;

/*Question :
{
	{8,0,6,0,0,3,0,9,0},
	{0,4,0,0,1,0,0,6,8},
	{2,0,0,8,7,0,0,0,5},
	{1,0,8,0,0,5,0,2,0},
	{0,3,0,1,0,0,0,5,0},
	{7,0,5,0,3,0,9,0,0},
	{0,2,1,0,0,7,0,4,0},
	{6,0,0,0,2,0,8,0,0},
	{0,8,7,6,0,4,0,0,3}
}
Answer : 
{
	{8,7,6,5,4,3,1,9,2},
	{5,4,3,2,1,9,7,6,8},
	{2,1,9,8,7,6,4,3,5},
	{1,9,8,7,6,5,3,2,4},
	{4,3,2,1,9,8,6,5,7},
	{7,6,5,4,3,2,9,8,1},
	{3,2,1,9,8,7,5,4,6},
	{6,5,4,3,2,1,8,7,9},
	{9,8,7,6,5,4,2,1,3}
}
*/


public class Sudoku_BackTracking {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		boolean[][] bl = new boolean[9][9];
//		int[][] filled = putininitially(9,9,bl) ;
		boolean[][] bl = { { true, false, true, false, false, true, false, true, false },
				{ false, true, false, false, true, false, false, true, true },
				{ true, false, false, true, true, false, false, false, true },
				{ true, false, true, false, false, true, false, true, false },
				{ false, true, false, true, false, false, false, true, false },
				{ true, false, true, false, true, false, true, false, false },
				{ false, true, true, false, false, true, false, true, false },
				{ true, false, false, false, true, false, true, false, false },
				{ false, true, true, true, false, true, false, false, true }, };
		int[][] filled = { { 8, 0, 6, 0, 0, 3, 0, 9, 0 }, { 0, 4, 0, 0, 1, 0, 0, 6, 8 }, { 2, 0, 0, 8, 7, 0, 0, 0, 5 },
				{ 1, 0, 8, 0, 0, 5, 0, 2, 0 }, { 0, 3, 0, 1, 0, 0, 0, 5, 0 }, { 7, 0, 5, 0, 3, 0, 9, 0, 0 },
				{ 0, 2, 1, 0, 0, 7, 0, 4, 0 }, { 6, 0, 0, 0, 2, 0, 8, 0, 0 }, { 0, 8, 7, 6, 0, 4, 0, 0, 3 } };
		long start = System.currentTimeMillis();
		sodukosolver(filled, bl, "", 0, 0);
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

	public static void sodukosolver(int[][] filled, boolean[][] filledornot, String ans, int cr, int cc) {
		if (cr == 9 && cc == 0) {
			System.out.println(ans);
			return;
		}

		for (int i = 1; i <= 9; i++) {

			if (isitsafe(filled, i, cr, cc) && filledornot[cr][cc] == false) {
				filled[cr][cc] = i;

				filledornot[cr][cc] = true;

				if (cc < 8)
					sodukosolver(filled, filledornot, ans + i + " ", cr, cc + 1);
				else if (cc == 8)
					sodukosolver(filled, filledornot, ans + i + "\n", cr + 1, 0);

				filledornot[cr][cc] = false;
				
				filled[cr][cc] = 0 ;
				
			} else if (filledornot[cr][cc] == true) {
				if (cc < 8)
					sodukosolver(filled, filledornot, ans + filled[cr][cc] + " ", cr, cc + 1);
				else if (cc == 8)
					sodukosolver(filled, filledornot, ans + filled[cr][cc] + "\n", cr + 1, 0);
				
				break ;
			}
			
			
			
		}

	}

	public static boolean isitsafe(int[][] filled, int num, int cr, int cc) {

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

		if ((cr >= 0 && cr <= 2)) {
			ri = 0;
			rf = 2;
		} else if ((cr >= 3 && cr <= 5)) {
			ri = 3;
			rf = 5;
		} else {
			ri = 6;
			rf = 8;
		}

		if ((cc >= 0 && cc <= 2)) {
			ci = 0;
			cf = 2;
		} else if ((cc >= 3 && cc <= 5)) {
			ci = 3;
			cf = 5;
		} else {
			ci = 6;
			cf = 8;
		}

//		int[][] tobechecked = copy(ri ,rf ,ci ,cf, filled ) ;

		for (int i = ri; i <= rf; i++) {
			for (int j = ci; j <= cf; j++) {
				if (filled[i][j] == num) {
					return false;
				}
			}
		}

		return true;

	}

	public static int[][] copy(int ri, int rf, int ci, int cf, int[][] filled) {
		int[][] tobechecked = new int[3][3];
		for (int i = ri, ir = 0; i <= rf; i++, ir++) {
			for (int j = ci, jr = 0; j <= cf; j++, jr++) {
				tobechecked[ir][jr] = filled[i][j];
			}
		}
		return tobechecked;
	}

}
