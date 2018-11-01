import java.util.ArrayList;
import java.util.Scanner;

/*MAZEPATH_D(COUNT, PRINT)
Take as input N1 and N2, both numbers. N1 and N2 is the number of rows and columns on a rectangular board. Our player starts in top-left corner of the board and must reach bottom-right corner. In one move the player can move 1 step horizontally (right) or 1 step vertically (down) or 1 step diagonally (south-east).

a. Write a recursive function which returns the count of different ways the player can travel across the board. Print the value returned.

b. Write a recursive function which prints moves for all valid paths across the board (void is the return type for function).


Input Format:
Enter the number of rows N1 and number of columns N2

Constraints:
None
Output Format:
Display the total number of paths and print all the possible paths in a space separated manner

Sample Input:
3
3
Sample Output:
13
VVHH VHVH VHHV VHD VDH HVVH HVHV HVD HHVV HDV DVH DHV DD
Time Limit: 4 sec*/

public class MazePath_D_CountPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int er = scn.nextInt();
		int ec = scn.nextInt();
		
		ArrayList<String> ans = getmazepath(1,1,er,ec) ;
		System.out.println(ans.size());
	
		for ( String val : ans )
		{
			System.out.print(val); 		
		}
		
		
	}
	
	public static ArrayList<String> getmazepath( int cr, int cc, int er, int ec )
	{
		if ( cr == er && cc == ec )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base ;
		}
		if ( cr > er || cc > ec )
		{
			ArrayList<String> base = new ArrayList<>();
			return base ;
		}
		
		ArrayList<String> myans = new ArrayList<>();
		ArrayList<String> recansV = getmazepath(cr+1,cc,er,ec);
		ArrayList<String> recansH = getmazepath(cr,cc+1,er,ec);
		ArrayList<String> recansD = getmazepath(cr+1,cc+1,er,ec);
		
		for ( String val : recansV )
		{
			myans.add("V" + val );
		}
		for ( String val : recansH )
		{
			myans.add("H" + val );
		}
		for ( String val : recansD )
		{
			myans.add("D" + val );
		}
		
		return myans ;
		
	}

}
