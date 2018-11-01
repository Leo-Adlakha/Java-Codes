import java.util.Scanner;

public class FibonaccibelowN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int N = scn.nextInt();
int a= 0, b= 1;
if ( N == 0 )
{
	System.out.println(a);
}
else if ( N == 1 )
{
	System.out.println(a);
	System.out.println(b);
}
else if ( N >= 2)
{
	int c = 1 ;
	System.out.println(a);
	System.out.println(b);
	while ( c <= N )
	{
		System.out.println(c);
		a = b;
		b = c;
		c = a + b;
	}
}
	}

}
