import java.util.Scanner;

public class NumberPatternQ26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int c ;
		for ( int i = 1; i <= n; i++ )
		{
			c = 1;
			for ( int k = 1 ; k <= n - i ; k++ )
			{
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= (2*i)-1 ; j++ )
			{
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
	}

}
