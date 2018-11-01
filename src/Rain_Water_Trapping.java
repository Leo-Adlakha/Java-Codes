import java.util.Scanner;

/*RAIN WATER TRAPPING
You are given an input array whose each element represents the height of a line towers. The width of every tower is 1. It starts raining. Water is filled between the gap of towers if possible. You need to find how much water filled between these given towers.

Example : Imgur


Input Format:
The first line consists of number of test cases T. Each test case consists an integer N as number of towers and next line contains the N space separated integers.

Constraints:
1 <= N <= 1000000
1 <= t <= 10
0 <= A[i] <= 10000000
Output Format:
Print how much unit of water collected among towers for each test case.

Sample Input:
2
6
3  0  0  2  0  4
12
0  1  0  2  1  0  1  3  2  1  2  1
Sample Output:
10
6
Time Limit: 1 sec*/

public class Rain_Water_Trapping {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		
		
		// left[i] denotes the tallest building from 0 to i
		int[] left = new int[a.length];
		left[0] = a[0];
		for (int j = 1; j < a.length; j++) 
		{
		left[j] = Math.max(left[j - 1], a[j]);
		}
		
		
		// right[i] denotes the tallest building from i to arr.length-1
		int[] right = new int[a.length];
		right[a.length - 1] = a[a.length - 1];
		for (int j = a.length - 2; j >= 0; j--) 
		{
		right[j] = Math.max(right[j + 1], a[j]);
     	}
		
		
		int sum = 0;
		for (int j = 0; j < a.length; j++) {
		sum += (Math.min(left[j], right[j]) - a[j]);
		}
		System.out.println(sum);
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
