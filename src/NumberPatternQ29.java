import java.util.Scanner;

public class NumberPatternQ29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int c ;
		for ( int i = 1; i <= n; i++ )
		{
			c = i;
			for ( int k = 1 ; k <= n - i ; k++ )
			{
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= (2*i)-1 ; j++ )
			{
				if ( j == 1 || j == ( 2 * i ) - 1)
				{
				System.out.print(c);
				}
				else
				{
				System.out.print("0");	
				}
				if ( j < i ) 
				{
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
