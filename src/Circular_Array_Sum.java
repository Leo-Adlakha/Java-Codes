import java.util.Scanner;

/*MAXIMUM CIRCULAR SUM
You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive number.


Input Format:
First line contains integer t which is number of test case. For each test case, it contains an integer n which is the size of numbers and next line contains n space separated integers.

Constraints:
1<=t<=100
1<=n<=1000
Output Format:
Print the maximum sum.

Sample Input:
1
7
8 -8 9 -9 10 -11 12
Sample Output:
22
Explanation:
Maximum Sum = 22 (12 + 8 - 8 + 9 - 9 + 10)*/

public class Circular_Array_Sum {

	static Scanner scn = new Scanner (System.in); 
	
	public static void main(String[] args) {

		int t = scn.nextInt();
		for ( int l = 0 ; l < t ; l++ )
		{
		int n = scn.nextInt();
		int[] arr = takeInput(n) ;

		int[] na = new int[arr.length * 2];

		for (int i = 0; i < arr.length; i++) {
			na[i] = arr[i];
			na[i + arr.length] = arr[i];
		}

		int maxSum = 0;

		for (int si = 0; si <= arr.length - 1; si++) {

			for (int ei = si; ei <= si + arr.length - 1; ei++) {

				int subarraySum = 0;

				for (int k = si; k <= ei; k++) {
					subarraySum += na[k];
				}

				if (subarraySum > maxSum) {
					maxSum = subarraySum;
				}
			}
		}

		System.out.println(maxSum);

		}
	}
	
	public static int[] takeInput( int n )
	{
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ )
		{
			a[i] = scn.nextInt() ;
		}
		return a ;
		
	}

	
}
