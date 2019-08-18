package Stack_Ques;

import java.util.* ;

/*NEXT SMALLER OF NEXT GREATER
Given array of integer, find the next smaller of next greater element of every element in array.


Input Format:
First line contains integer t which is number of test case.

For each test case, it contains an integer n which is the size of array and next line contains n space separated integers.

Output Format:
Print the next smaller of next greater element of every element in array.

Sample Input:
1
7
5 1 9 2 5 1 7
Sample Output:
2 2 -1 1 -1 -1 -1*/

public class Next_Smaller_of_next_Greater_Element {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt(); 
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			LinkedList<Integer> stack = takeInput(n) ;
			displayans(stack,n) ;
			System.out.println();
		}
		
	}

	public static void displayans(LinkedList<Integer> stack, int n) 
	{
		
		for ( int i = 0 ; i < n ; i++ )
		{
			
			boolean flag = false ;
			int maxt = 0 ;
			int t = stack.get(i) ;
			boolean bl = false ;
			
			for ( int k = i + 1 ; k < n ; k++ )
			{
				
				int l = stack.get(k) ;
				
				if ( l > t && !bl )
				{
					maxt = l ;
					bl = true ;
				}
				
				if ( bl && maxt > l )
				{
					System.out.print( l + " " );
					flag = true ;
					break ;
				}
				
				
			}
			
			if ( !flag )
			{
				System.out.print("-1 ");
			}
		}
		
		
	}

	public static LinkedList<Integer> takeInput(int n) 
	{
		LinkedList<Integer> queue = new LinkedList<>() ;
		for ( int j = 0 ; j < n ; j++ )
		{
			queue.addLast(scn.nextInt());
		}
		return queue ;
	}

}
