import java.util.Scanner;

public class Subsetsofanum {

	static int i ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int k = n ;
int l = 0 ;
while ( k != 0 )
{
    k = k / 10 ;
    l++ ;
}
for ( int i = 0 ; i < Math.pow(2, l) ; i++ )
{
	k = n ;
	int b = dectobin(i);	
	
	while ( b != 0 )
	{
		int rem = b % 10 ;
		int rem2 = k % 10 ;
		if ( rem == 1 )
		{
			System.out.print(rem2);
		}
		b = b / 10 ;
		k = k / 10 ;
	}
	System.out.println();
}




}
	
	
	
	public static int dectobin(int n)
	{
		int b = 0 ;
		int l = 0 ;
		while ( n != 0 )
		{
			int rem = n % 2 ;
			b = (int) ( b + (rem*Math.pow(10, l) ));
			n/=2;
			l++ ;
		}
		return b ;
		
	}
	}