import java.util.Scanner;

/*COUNT SET BITS
count number of 1s in binary representation of an integer


Input Format:
Input N = Number of Test Cases, followed by N numbers

Output Format:
Number of Set Bits in each number each in a new line

Sample Input:
3
5
4
15
Sample Output:
2
1
4
Explanation:
Convert Binary to Decimal first and then count number of 1's present in all digits.
*/

public class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in) ;

		int t = scn.nextInt();
		for ( int i = 1 ; i <= t ; i++ )
		{
			int n = scn.nextInt();
			long bin = converttobinary(n) ;
			int p = 0 ;
			while ( bin != 0 )
			{
				int rem = (int) (bin % 10) ;
				if ( rem == 1 )
				{
					p++ ;
				}
				bin = bin / 10 ;
			}
			System.out.println(p);
		}
		
		
	}

	public static long converttobinary( int n )
	{
		
		int p = 0 ;
		long ans = 0 ;
		 while ( n != 0 )
		 {
			 int rem = n % 2 ;
			 ans += rem*Math.pow(10, p) ;
			 p++ ;
			 n = n / 2 ;
		 }
		
		return ans ;
		
	}
	
}
