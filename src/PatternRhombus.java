import java.util.Scanner;

public class PatternRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		n = ( 2 * n ) - 1 ;
		int i = 1 , j , k ;
		int nsp = 1 ;
		int nst = n/2 ;
		int c ;
		while ( i <= n )
		{
			if ( i <= (n/2) + 1 )
			{
			    c = i ;
			}
			else 
			{
				c = ( n - i ) + 1 ;
			}
			j=k=1;
			while ( k <= nst )
			{
				System.out.print(" ");
				k++;
			}
			while ( j <= nsp )
			{
				System.out.print(c);
				if ( j < (nsp/2) + 1 )
				{
					c++;
				}
				else 
				{
					c--;
				}
				j++;
			}
			if ( i <= n/2 )
			{
				nsp+=2;
				nst-=1;
			}
			else 
			{
				nsp-=2;
				nst+=1;
			}
			System.out.println();
			
			
			i++;
		}
	}

}
