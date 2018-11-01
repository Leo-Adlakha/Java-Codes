import java.util.Scanner;

public class StarPatternQ13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int i = 1, j = 1 ;
		int nst=1;
		while ( i <= (2*n)-1 )
		{ 
			j=1;
			while ( j <= nst )
			{
				System.out.print("*");
				j++;
			}
				if ( i < n )
				{
					nst++;
				}
				else 
				{
					nst--;
				}
			i++;
			System.out.println();
		}
	}

}
