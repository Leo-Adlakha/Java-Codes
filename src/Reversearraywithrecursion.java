import java.util.Scanner;

//REVERSE AN ARRAY
//Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which reverses the array. Print the values of reversed array.
//
//
//Input Format:
//Enter a number N and take N more inputs
//
//Constraints:
//None
//Output Format:
//Display values of the reversed array
//
//Sample Input:
//4
//1
//2
//3
//4
//Sample Output:
//4 3 2 1

public class Reversearraywithrecursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int[] a = takeInput(n);
		int i = 0 ;
		for ( int val : reverse(a,i) )
		{
			System.out.print(val+"\t");
		}
		
	}
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int[] reverse(int[] a, int i )
	{
		if( i == a.length/2 )
		{
			int[] b = new int[a.length];
			return b ;
		}
		reverse(a,i+1);
		int t = a[i];
        a[i] = a[a.length - i - 1];
		a[a.length-i - 1] = t ;
		return a ;
	}
	
}
