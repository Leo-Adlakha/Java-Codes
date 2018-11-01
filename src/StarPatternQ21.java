import java.util.Scanner;

public class StarPatternQ21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int i = 1;
int nst = 1 ;
int nsp = (2*n)-3 ;
int j , k ;
while ( i <= n )
{
	j=k=1;
	while ( j <= nst )
	{
		System.out.print("*");
		j++;
	}
	while ( k <= nsp )
	{
		System.out.print(" ");
		k++;
	}
	j = 1 ;
	if ( i == n )
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
	nst++;
	nsp-=2;
    i++;
    System.out.println();
}
	}

}
