import java.util.ArrayList;
import java.util.Scanner;

/*MAZEPATH_D2(COUNT ,PRINT)
Take as input N. N is the number of rows and columns on a square board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east). But the diagonal step is allowed only when the player is currently on one of the diagonals (there are two diagonals)

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).


Input Format:
Enter the number N.

Constraints:
None
Output Format:
Display the total number of paths and display all the possible paths in a space separated manner.

Sample Input:
3
Sample Output:
11
VVHH VHVH VHHV VHD HVVH HVHV HVD HHVV DVH DHV DD 
Time Limit: 4 sec*/

public class MazePath_D2_CountPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in) ;
		int end = scn.nextInt();
		
		System.out.println(" " + getmazepathways(1,1,end,end)) ;
		getmazepath(1,1,end,end," ") ;
		
		
	}
	
	public static int getmazepathways( int cr, int cc, int er, int ec)
	{
		if ( cr == er && cc == ec )
		{
			return 1;
		}
		if ( cr > er || cc > ec )
		{	
			return 0;
		}
		
		int waysH = 0 ;
		int waysV = 0 ;
		int waysD = 0 ;
		
		waysV += getmazepathways(cr+1,cc,er,ec);
		waysH += getmazepathways(cr,cc+1,er,ec);
		if ( cc == cr || cc + cr == er + 1 ) 
		waysD += getmazepathways(cr+1,cc+1,er,ec);
		
		return waysH + waysV + waysD ;
		
	}
	
	public static void getmazepath( int cr, int cc, int er, int ec, String ans )
	{
		if ( cr == er && cc == ec )
		{
            System.out.print(ans);
			return ;
		}
		if ( cr > er || cc > ec )
		{	
			return ;
		}
		
		getmazepath(cr+1,cc,er,ec,ans + "V" );
		getmazepath(cr,cc+1,er,ec,ans + "H" );
		if ( cc == cr || cc + cr == er + 1 ) 
		getmazepath(cr+1,cc+1,er,ec,ans + "D" );
		
		
	}
	
	

}
