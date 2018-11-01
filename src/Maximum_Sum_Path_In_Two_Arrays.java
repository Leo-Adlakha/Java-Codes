import java.util.Scanner;

/*MAXIMUM SUM PATH IN TWO ARRAYS
You are provided two sorted arrays. You need to find the maximum length of bitonic subsequence. You need to find the sum of the maximum sum path to reach from beginning of any array to end of any of the two arrays. You can switch from one array to another array only at common elements.


Input Format:
First line contains integer t which is number of test case. For each test case, it contains two integers n and m which is the size of arrays and next two lines contains n and m space separated integers respectively.

Constraints:
1<=t<=100
1<=n,m<=100000
Output Format:
Print the maximum path.

Sample Input:
1
8 8
2 3 7 10 12 15 30 34
1 5 7 8 10 15 16 19
Sample Output:
122
Explanation:
122 is sum of 1, 5, 7, 8, 10, 12, 15, 30, 34*/

public class Maximum_Sum_Path_In_Two_Arrays {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt() ;
			int m = scn.nextInt() ;
			int[] a = takeInput(n) ;
			int[] b = takeInput(m) ;
			System.out.println(findans(a,b)) ;
		}
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	

	public static int findans ( int[] a, int[] b )
	{
		int sum1 = 0 ;
		int sum2 = 0 ;
		int ans = 0 ;
		int i = 0 , j = 0 ;
		
		while ( i < a.length && j < b.length )
		{
			sum1 = 0 ;
			sum2 = 0 ;
			if ( a[i] < b[j] )
			{
				sum1 += a[i] ;
				i++ ;
			}
			else if ( a[i] > b[j] )
			{
				sum2 += b[j] ;
				j++ ;
			}
			else
			{
				
				ans = ans + Math.max(sum1, sum2) + a[i] ;
				i++ ;
				j++ ;
				sum1 = 0 ; 
				sum2 = 0 ;
				
				
				
			}
			
			
		}
		
		if ( i == a.length )
		{
			while ( j < b.length ) 
			{
				sum2 += b[j] ;
				j++ ;
		    }	
		}
		else  
		{
			while ( i < a.length )
			{
				sum1 += a[i] ;
				i++ ;
			}
		}
		
		ans += Math.max(sum1, sum1) ;
		
		return ans ;
		
	}
	
	
	
	
}
