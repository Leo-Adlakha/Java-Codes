import java.util.Scanner;

public class StarPatternQ18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner ( System.in );
		int n = scn.nextInt();
		int i = 1 , j , k ;
		int nsp = 1 ;
		int nst = n/2 ;
		while ( i <= n )
		{
			j=k=1;
			while ( k <= nst )
			{
				System.out.print(" ");
				k++;
			}
			while ( j <= nsp )
			{
				System.out.print("*");
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
