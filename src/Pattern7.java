import java.util.Scanner;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in );
		int n = scn.nextInt();
		int row=1;
		int nsp = n-1;
		int nst = 1;

		while (row <= (2*n)-1 )
		{
			int j = 1;
			int k = 1;
			while ( j <= nsp)
			{
				System.out.print(" ");
				j++;
			}
			while ( k <= nst )
			{
				if ( k == 1 || k == nst )
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
				k++;
			}
			if ( row < n )
			{
				nsp--;
				nst+=2;
			}
			else 
			{
				nsp++;
				nst-=2;
			}
			System.out.println();
			
			row++;
		}
	}

}
