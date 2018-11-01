//Q. Find the largest number possible out of an array.
//   For ex - if array is {54,546,548,60,6} 
//   then the output should be 66054854654 which is the largest number possible out of this array.
//   For ex - if array is {1,34,3,98,9,76,45,4}
//   then the output should be 998764543431 which is the largest number possible out of this array.

import java.util.Scanner;

public class Largestnumfromarray {

	static Scanner scn = new Scanner (System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		long[] a = takeInput(n);
		bubble(a);
        for ( long val : a )
        {
        	System.out.print(val);
        }
	}
	
	public static long[] takeInput(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	public static long[] bubble ( long[] a )
	{
		for ( int i = 0 ; i < a.length - 1 ; i++ )
		{
			for ( int j = 0 ; j < a.length - i - 1 ; j++ )
			{
				long n1 = a[j];
				long n2 = a[j+1];
				String val1 = n1 + "" + n2 ;
				String val2 = n2 + "" + n1 ;
				long val1int = Long.valueOf(val1);
				long val2int = Long.valueOf(val2);
				if ( val1int < val2int )
				{
					long t;
					t = a[j+1] ;
					a[j+1] = a[j] ;
					a[j] = t ;
				}
			}
		}
		return a;
	}

}
