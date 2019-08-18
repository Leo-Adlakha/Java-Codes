import java.util.Scanner;

/*RECURSION-TOWER OF HANOI
Google Tower of Hanoi.

a. Write a recursive function which prints the steps required to solve the tower of Hanoi problem for N discs.

b. Write a recursive function which returns number of steps required to solve the tower of Hanoi problem for N discs.


Input Format:
Enter the number of discs

Constraints:
None
Output Format:
Display the steps required to solve the tower and also print the total number of steps required

Sample Input:
2
Sample Output:
Move 1th disc from T1 to T3
Move 2th disc from T1 to T2
Move 1th disc from T3 to T2
3*/

public class Recursion_Tower_of_Hanoi {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		System.out.println(display(n, "T1", "T2", "T3") - 1 ) ;
		
	}

	public static int display(int n, String source, String destination, String helper) 
	{
		
		if ( n == 0 )
		{
			return 1;
		}
		
		int count = 0 ;
		count += display(n-1, source, helper, destination);
		System.out.println("Move " + n + "th disc from " + source + " to " + destination );
		count += display(n-1, helper, destination, source);
		
		return count ;
		
	}
	
	
	
	

}
