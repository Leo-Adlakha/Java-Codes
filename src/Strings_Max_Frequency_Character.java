import java.util.Arrays;
import java.util.Scanner;

public class Strings_Max_Frequency_Character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		String str = scn.next();
		String ans = "" ;
		int[] a = new int[256] ;
		Arrays.fill(a, 0);
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i) ;
			a[ch]++ ;
		}
		int max = max(a) ;
        int p = 0 ;
		for ( int j = 0 ; j < a.length ; j++ )
		{
			if ( a[j] == max )
			{
				p = j ;
			}
		}
		System.out.println((char)p);
		
		
		
	}
	
	public static int max(int[] a) {
		int max = 0, j;
		for (j = 0; j < a.length ; j++)
		{
			if (a[j] > max) {
				max = a[j];
			}
		}
		return max;

	}

}
