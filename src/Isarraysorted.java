import java.util.Scanner;

/*IS ARRAY SORTED?
Take as input N, the size of array. Take N more inputs and store that in an array. Write a recursive function which returns true if the array is sorted and false otherwise. Print the value returned.


Input Format:
Enter a number N and take N more inputs and store in an array

Constraints:
None
Output Format:
Display the Boolean result

Sample Input:
4
1
2
3
4
Sample Output:
true*/

public class Isarraysorted {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
    
		int n = scn.nextInt();
		int[] a = takeInput(n);
    	System.out.println(issorted(a,0));
		
	}
	
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static boolean issorted(int[] a, int i)
	{
		if ( i == a.length - 1 )
		{
			return true ;
		}
		
		boolean bl = false ;
		if ( a[i] <= a[i+1] )
		{
			bl = issorted(a,i+1) ;
		}
		
		if ( bl )
		{
			return true ;
		}
		else
		{
		return false ;
		}
		
	}
		
	
	
}
