import java.util.Scanner;

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
2 2 -1 1 -1 -1 -1
Explanation:
agar next smaller of next greater of that element isnt present then print -1 else print the next smaller of next greater
*/


public class NextSmallerofNextGreater {

	static Scanner scn = new Scanner(System.in); 
	
	public static void main(String[] args) {
	
		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
		int n = scn.nextInt();
		int[] a = takeInput(n);
		print(a);
		System.out.println();
		}
	}

		public static int[] takeInput(int n) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = scn.nextInt();
			}
			return arr;
		}
		
		
		public static void print( int[] a )
		{
			int maxidx ;
			int max ;
			int minidx ;
			int min ;
			for ( int i = 0 ; i < a.length ; i++ )
			{
				maxidx = max(a,i+1,0) ;
				max = a[maxidx] ;
				minidx = min(a,maxidx + 1, 0 ) ;
				min = a[minidx] ;
				if ( minidx == 0 )
				{
					System.out.print("-1 ");
				}
				else
				{
				System.out.print(min + " ");
				}
				
			}
		}
		
		public static int max(int[] a, int start, int idx ) {
			int max = Integer.MIN_VALUE , j;
			for (j = start ; j < a.length ; j++)
			{
				if (a[j] > max) {
					max = a[j];
					idx = j ;
				}
			}
			return idx;

		}
		
		public static int min(int[] a, int start, int idx ) {
			int min = Integer.MAX_VALUE , j;
			for (j = start ; j < a.length ; j++)
			{
				if (a[j] < min) {
					min = a[j];
					idx = j ;
				}
			}
			return idx;

		}
							
	}
