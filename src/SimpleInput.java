import java.util.Scanner;

/*SIMPLE INPUT
Given a list of numbers, stop processing input after cummulative sum of all the input becomes negative.


Input Format:
A list of integers

Constraints:
All numbers input are integers between -1000 and 1000.
Output Format:
All the numbers before the cummulative sum become zero in a new line.

Sample Input:
1
2
88
-100
49
Sample Output:
1
2
88
*/

public class SimpleInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int n ;
		int sum = 0 ;
		int[] a = new int[100] ;
		int l = 0 ;
		do
		{
			n = scn.nextInt();
			sum += n ;
			if ( sum > 0 )
			{
				a[l] = n ;
				l++ ;
			}
			
		}
		while( sum > 0 );
		n = scn.nextInt();
		
		for ( int i = 0 ; i < l ; i++ )
		{
			System.out.println(a[i]);
		}
		
		
	}

}
