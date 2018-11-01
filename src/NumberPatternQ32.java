import java.util.Scanner;

public class NumberPatternQ32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int i = 1, j = 1 ;
		int nst=1;
		int c = 1;
		while ( i <= (2*n)-1 )
		{ 
			j=1;
			while ( j <= (2*nst)-1 )
			{
				if ( j % 2 == 1 )
				{
					System.out.print(c);
				}
				else 
				{
				System.out.print("*");
				}
				j++;
			}
				if ( i < n )
				{
					nst++;
					c++;
				}
				else 
				{
					nst--;
					c--;
				}
			i++;
			System.out.println();
		}
	}

}
