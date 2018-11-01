import java.util.Scanner;

public class PatternSTAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int i=1;
while ( i<=n )
{
	int j=1;
	int k=1;
	
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

	}

}
