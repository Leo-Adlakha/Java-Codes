import java.util.Scanner;

/*SPLIT ARRAY ( RECURSION )
Take as input N, a number. Take N more inputs and store that in an array.

a. Write a recursive function which counts the number of ways the array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Print the value returned.

b. Write a recursive function which keeps track of ways an array could be split in two groups, so that the sum of items in both groups is equal. Each number in the array must belong to one of the two groups. Return type of function should be void. Print the two groups, each time you find a successful split.


Input Format:
Take as input N, a number. Take N more inputs and store that in an array.

Constraints:
None
Output Format:
Display the number of ways the array can be split and display all the groups in a comma separated manner

Sample Input:
6
1
2
3
3
4
5
Sample Output:
6
 1 2 3 3 and 4 5
 1 3 5 and 2 3 4
 1 3 5 and 2 3 4
 2 3 4 and 1 3 5
 2 3 4 and 1 3 5
 4 5 and 1 2 3 3
Time Limit: 4 sec*/

public class Split_Array_Recursion {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int[] a = takeInput(n);
		System.out.println(splitarraysways(a, 0, 0, 0));
		splitarrays(a, 0, "", "", 0 , 0 );
		
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int splitarraysways ( int[] a, int j, int sum1, int sum2 )
	{
	    if ( j == a.length)
	    {
	    	if ( sum1 == sum2 )
	    	{
	    	    return 1 ;
	    	}
	        else
	    	{
	    		return 0 ;
	    	}
	    }
		
	    int ways1 = 0 ;
	    int ways2 = 0 ;
		
	    
		ways1 += splitarraysways(a, j+1, sum1 + a[j], sum2);
		ways2 += splitarraysways(a, j+1, sum1, sum2 + a[j] );	
		
		return ways1 + ways2 ;
		
	}
	
	public static void splitarrays ( int[] a, int j, String res1, String res2, int sum1, int sum2 )
	{
	    if ( j == a.length)
	    {
	    	if ( sum1 == sum2 ) 
	    	System.out.println( res1 + "and " + res2 );
	    	return ;
	    }
		
		
		splitarrays(a, j+1, res1 + a[j] + " "  , res2, sum1 + a[j] , sum2);
		splitarrays(a, j+1, res1, res2 + a[j] + " "  , sum1, sum2 + a[j] );	
		
	}

}
