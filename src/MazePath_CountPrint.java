import java.util.ArrayList;
import java.util.Scanner;

/*MAZE_PATH( COUNT, PRINT)
Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down).

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which returns an ArrayList of moves for all valid paths across the board. Print the value returned.

e.g. for a board of size 3,3; a few valid paths will be “HHVV”, “VVHH”, “VHHV” etc. c. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).


Input Format:
Enter the number of rows N and columns M

Constraints:
None
Output Format:
Display the total number of paths and display all the possible paths in a space separated manner

Sample Input:
3
3
Sample Output:
6
VVHH VHVH VHHV HVVH HVHV HHVV 
Time Limit: 4 sec*/

public class MazePath_CountPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int er = scn.nextInt();
		int ec = scn.nextInt();
		
		System.out.println(getmazepathways(1,1,er,ec));
		getmazepathans(1,1,er,ec,"");	
		
	}
	public static int getmazepathways( int cr, int cc, int er, int ec )
	{
		if ( cc == ec && cr == er )
		{
			return 1 ;
		}
		if ( cr > er || cc > ec )
		{
			return 0 ;
		}
		
		int wayV = 0 ;
		int wayH = 0 ;
		wayV += getmazepathways(cr+1, cc, er, ec);
		wayH += getmazepathways(cr, cc+1, er, ec);
		
		return wayH + wayV ;
		
	}

	
	public static void getmazepathans( int cr, int cc, int er, int ec , String ans )
	{
		if ( cc == ec && cr == er )
		{
			System.out.print(ans + "\t");
			return ;
		}
		if ( cr > er || cc > ec )
		{
			return ;
		}
		
		getmazepathans(cr+1, cc, er, ec, ans+"V");
		getmazepathans(cr, cc+1, er, ec, ans+"H");
		
		
	}


}


