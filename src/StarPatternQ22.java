import java.util.Scanner;

public class StarPatternQ22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		int nst = n ;
		int nsp = -1 ;
		int j , k ;
		while ( i <= n )
		{
			j=k=1;
			if ( i == 1 )
			{
				while ( j < nst )
				{
					System.out.print("*");
					j++;
				}
			}
			else 
			{
			    while ( j <= nst )
			    {
				    System.out.print("*");
				    j++;
			    }
			}
			while ( k <= nsp )
			{
				System.out.print(" ");
				k++;
			}
			j = 1 ;
			while ( j <= nst )
			{
				System.out.print("*");
				j++;
			}
			nst--;
			nsp+=2;
		    i++;
		    System.out.println();
		}
	}

}
