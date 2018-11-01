import java.util.Scanner;

public class Replacethemall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int r, c = 0 ;
int p = n ; 
if ( n == 0 )
{
	System.out.println("5");
}
else
{
while ( p != 0 )
{
	r = (p % 10) ;
	if ( r == 0 )
	{
		n = (int) (n + (Math.pow(10, c)*5));
	}
	c++;
	p/=10;
}
System.out.println(n);
}
	}

}
