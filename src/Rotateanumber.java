import java.util.Scanner;

public class Rotateanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
Scanner scn = new Scanner (System.in);
long n = 1234 ;
int rot = 2;
int l=0;
long p,c ;
p = n;
while (p > 0 )
{
	if ( p/10 != 0)
	{
		l++;
	}
	p=p/10;
}
if ( rot >= 0 )
{
	for ( int j = 0 ; j < rot ; j++)
	{
		c=(n%10);
		n=(long) ((c*Math.pow(10, l)) + ( (int)(n/10) ));
	}
	System.out.println(n);
}
else
{
	rot = rot * (-1);
	for ( int j = 0 ; j < rot ; j++)
	{
		c=(long) (n/(Math.pow(10,l)));
		n=(long) (n%(Math.pow(10,l)));
		n = (n*10) + c ;
	}
	System.out.println(n);
}
long end = System.currentTimeMillis();
System.out.println(end - start);
}

}
