//INVERSION COUNT
//You are given an array A find out number of pairs (i,j) in array A such that A[i] > A[j] and i < j.
//
//
//Input Format:
//The first line consists of number of test cases t. Each test case consists of integer N followed by N space separated integers.
//
//Constraints:
//
//1 <= N <= 100000
//1 <= t <= 20
//0 <= A[i] <= 100000000
//Output Format:
//The number of inversions in array
//
//Sample Input:
//2
//4
//1 2 4 3
//3
//3 2 1
//Sample Output:
//1
//3
//Time Limit: 2 sec

import java.util.Scanner;

public class InversionCountTest1 {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
    int t = scn.nextInt();
    for ( int i = 0 ; i < t ; i++ )
    {
    	int n = scn.nextInt();
    	int[] a = takeInput(n);
    	System.out.println(check(a));
    }
	}
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	 public static int check(int[] a)
	 {
		 int p = 0 ;
		 for ( int i = 0 ; i < a.length ; i++ )
		 {
			 for ( int j = i + 1 ; j < a.length ; j++ )
			 {
			 if ( a[i] > a[j] )
			 {
				 p++;
			 }
			 }
		 }
		 return p ;
	 }

}
