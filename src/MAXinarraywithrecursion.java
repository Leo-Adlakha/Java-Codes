import java.util.Scanner;

public class MAXinarraywithrecursion {
	
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scn.nextInt();
		int[] a = takeInput(n);
		int i = 0 ;
		int c = max(a,i);
		System.out.println(c);
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static int max( int[] a , int i )
	{
		if ( i == a.length )
		{
			return Integer.MIN_VALUE;
		}
		
		if ( a[i] > max(a,i+1))
		{
			return a[i];
		}
		else 
		{
			return max(a,i+1); 
		}
		
		
	}
}
