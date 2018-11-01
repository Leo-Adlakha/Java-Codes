import java.util.Scanner;

public class PatternMountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int i = 1;
		int nst = 1 ;
		int nsp = (2*n)-3 ;
		int j , k ;
		int c = 1;
		
		while ( i <= n )
		{
			j=k=1;
			c = 1 ; 
			while ( j <= nst )
			{
				
				System.out.print(c);
				j++;
				c++;
			}
			
			while ( k <= nsp )
			{
				System.out.print(" ");
				k++;
			}
			j = 1 ;
			if ( i == n )
			{
				c-=2;
				while ( j < nst )
				{
					
					System.out.print(c);
					j++;
					c--;
				}
			}
			else 
			{
				c--;
			    while ( j <= nst )
			    {  
				    System.out.print(c);
				    j++;
				    c--;
			    }
			}
			nst++;
			nsp-=2;
		    i++;
		    System.out.println();
		}
	}

}
