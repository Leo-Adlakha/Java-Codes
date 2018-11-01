import java.util.Scanner;

public class StarPatternQ20 {

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
				if ( j == 1 || j == nsp )
				{
				System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
				j++;
			}
//      		k=1;
//    		while ( k <= nst )                     "OPTIONAL TO WRITE"
//    		{
//    			System.out.print("*");
//    			k++;
//    		}
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
