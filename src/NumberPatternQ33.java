import java.util.Scanner;

public class NumberPatternQ33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int c ;
		for ( int i = 1; i <= n; i++ )
		{
			c = ( n - i + 1 ) % 10 ;
			for ( int k = 1 ; k <= n - i ; k++ )
			{
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= (2*i)-1 ; j++ )
			{
				if ( c >= 10 )
				{
					System.out.print(c%10);
				}
				else
				{
				    System.out.print(c);
				}
				if ( j < i ) {
					c++;
				}
				else
				{
				c--;	
				}
			}
			System.out.println();
	}
	}

}
