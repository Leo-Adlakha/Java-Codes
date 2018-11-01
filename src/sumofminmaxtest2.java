//SUM OF MINIMUM AND MAXIMUM ELEMENTS OF ALL SUBARRAYS OF SIZE K
//You are given given an array of both positive and negative integers, the task is to compute sum of minimum and maximum elements of all sub-array of size k.
//
//
//Input Format:
//First line contains integer t as number of test cases. Each test case contains two lines. First line contains two integers n and k where n is length of the array and second line contains n space separated integer.
//
//Output Format:
//For each test case you have to print the required sum.
//
//Sample Input:
//2
//7 4
//2 5 -1 7 -3 -1 -2 
//7 3
//2 5 -1 7 -3 -1 -2
//Sample Output:
//18 
//14
//Explanation:
//For test case 1 :
//
//Subarrays of size 4 are :
//
//{2, 5, -1, 7}, min + max = -1 + 7 = 6
//
//{5, -1, 7, -3}, min + max = -3 + 7 = 4
//
//{-1, 7, -3, -1}, min + max = -3 + 7 = 4
//
//{7, -3, -1, -2}, min + max = -3 + 7 = 4
//
//Sum of all min & max = 6 + 4 + 4 + 4 = 18
//
//Time Limit: 1 sec

import java.util.Scanner;

public class sumofminmaxtest2 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
    int t = scn.nextInt();
    for ( int i = 0 ; i < t ; i++ )
    {
    	int n = scn.nextInt();
    	int k = scn.nextInt();
    	int[] a = takeInput(n);
    	System.out.println(check(a, k));
    }
	}
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	 public static int check(int[] a, int k )
	 {
		 int total = 0 ;
		 int sum = 0 ;
		 for ( int i = 0 ; i<= a.length - k ; i++ )
		 {
			 int[] b = new int[k];
			 for ( int j = i, d= 0 ; j < i+k ; j++, d++ )
			 {
			  b[d] = a[j];	 
			 } 
			 int min = Integer.MAX_VALUE ;
			 int max = Integer.MIN_VALUE ;
			  
			 for ( int z = 0 ; z < k ; z++ )
			 {
				 if ( b[z] < min )
				 {
					 min = b[z];
				 }
				 if ( b[z] > max )
				 {
					 max = b[z];
				 }
			 }
			 sum = min + max ;
			 total+=sum;
			 }	 
		 
		 return total ;
	 }

}

