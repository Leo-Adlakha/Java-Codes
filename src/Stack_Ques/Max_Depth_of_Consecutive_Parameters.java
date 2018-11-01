package Stack_Ques;

import java.util.LinkedList;
import java.util.Scanner;

/*MAXIMUM DEPTH OF CONSECUTIVE PARENTHESIS
You are given a string having parenthesis like “( ((X)) (((Y))) )”. We need to find the maximum depth of balanced parenthesis. Like 4 in given examples as ‘Y’ is surrounded by 4 balanced parenthesis. If parenthesis are unbalanced then print -1.


Input Format:
First line contains integer t which is number of test case. For each test case, it contains a string.

Constraints:
1<=t<=100
1<=n<=1000
Output Format:
Print the maximum depth of balanced parenthesis for each test case.

Sample Input:
3
(((X))(((Y))))
(p((q))((s)t))
b)(c)()
Sample Output:
4
3
-1
Time Limit: 1 sec*/

public class Max_Depth_of_Consecutive_Parameters {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		Max_Depth_of_Consecutive_Parameters m = new Max_Depth_of_Consecutive_Parameters() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			String str = scn.next() ;
			HeapMover mover = m.new HeapMover() ;
			boolean bl = findans ( mover, str ) ;
			if ( bl )
			    System.out.println(mover.ans);
			else
				System.out.println("-1");
		}
		
	}
	
	private static boolean findans(HeapMover mover, String str ) 
	{
			
		LinkedList<Character> stack = new LinkedList<>() ;
		int d = 0 ;
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i) ;
			if ( ch == '(' )
			{
				stack.addFirst('(');
				d++ ;
				if ( d > mover.ans )
				{
					mover.ans = d ;
				}
			}
			else if ( ch == ')' )
			{
				if ( !stack.isEmpty() )
				{
				stack.removeFirst() ;
				d-- ;
				}
				else
				{
					return false ;
				}
			}
		}
		
		if ( stack.isEmpty() )
		{
			return true ;
		}
		else
		{
			return false ;
		}
		
		
	}

	public class HeapMover
	{
		int ans = 0 ;
	}

}


