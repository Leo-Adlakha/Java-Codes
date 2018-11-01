import java.util.Scanner;

public class StarPatternQ14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int i = 1 , j , k ;
		int nsp = n - 1 , nst = 1 ;
		
		while ( i <= (2*n)-1 )
		{
			j = k = 1;
			while ( j <= nsp )
			{
				System.out.print(" ");
				j++;
			}
			while ( k <= nst )
			{
				System.out.print("*");
				k++;
			}
			if ( i < n )
			{
				nsp--;
				nst++;
			}
			else
			{
				nsp++;
				nst--;
			}
			System.out.println();
			
			
			i++;
		}
	}

}
