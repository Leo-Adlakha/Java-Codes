import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	int n = scn.nextInt();
	int i=1;int j,k;
	while ( i<=((n+1)/2) )
	{
		j=1;
		k=1;
		
		while( j<=n-i )
		{
		System.out.print(" ");
		j++;
		}
		while( k <= (2*i)-1 )
		{
			System.out.print("*");
			k++;
		}
		System.out.print("\n");
		i++;
	}
	i=(n-1)/2;
	while(i>=0 )
	{
	    j=n-i;
		k=(2*i)-1;
		
		while( j>=0)
		{
		System.out.print(" ");
		j--;
		}
		while( k >= 0)
		{
			System.out.print("*");
			k=k-2;
		}
		i--;
	}
}
}
