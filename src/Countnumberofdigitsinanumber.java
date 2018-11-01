import java.util.Scanner;

public class Countnumberofdigitsinanumber {

	
static int func( int A, int a )
{
	int p=0;
	while ( A > 0 )
	{
		if ( a == A%10 )
		{
			p++;
		}
		A/=10;
	}
	return p;
}
	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int N = scn.nextInt();
int n = scn.nextInt();
System.out.println(func(N,n));

	}

}
