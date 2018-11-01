import java.util.Scanner;

public class NumberPatternQ31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int c;
		for ( int i = 1 ; i <= n ; i++ )
		{
			c = n ;
			for ( int j = 1 ; j <= n ; j++ )
			{
				if ( i == n - j + 1 )
				{
					System.out.print("*");
				}
				else
				{
				System.out.print(c);
				}
				c--;
			}
			System.out.println();
		}
	}

}
