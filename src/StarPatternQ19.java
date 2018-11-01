import java.util.Scanner;

public class StarPatternQ19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int i = 1 , j , k ;
		int nsp = 1 ;
		int nst = n/2 ;
		int p = 1;
		while ( i <= n )
		{
     		j=k=1;
			while ( k <= nst )
			{
				System.out.print("*");
				k++;
			}
			if ( i == 1 || i == n )
			{
				System.out.print("*");
			}
			else
			{
			while ( j <= nsp )
			{
				System.out.print(" ");
				j++;
			}
			}
			
			k=1;
			while ( k <= nst )
			{
				System.out.print("*");
				k++;
			}
			if ( i <= n/2 && i > 1 )
			{
				nsp+=2;
				nst-=1;
			}
			else if ( i > n/2 && i < n - 1 )
			{
				nsp-=2;
				nst+=1;
			}
			System.out.println();
			
			
			i++;
		}
	}
}
