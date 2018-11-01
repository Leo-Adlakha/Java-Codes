import java.util.Scanner;

public class StarPatternQ12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		for ( int i = 1 ; i <=n ; i++ )
		{
			for ( int j = (n-i) ; j > 0 ; j-- )
			{
				System.out.print(" ");
			}
			for ( int k = 1 ; k <= (2*i)-1 ; k ++ )
			{
				if ( k % 2 == 1 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("!");
				}
			}
			System.out.println();
		}
	}

}
