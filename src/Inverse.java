import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner( System.in);
long n = scn.nextLong();
int l = 0;
long p = n;
long N=0 ;
long r;
int c=1;
while (p > 0 )
{
	if ( p/10 != 0)
	{
		l++;
	}
	p=p/10;
}
l++;
for ( int j = 0 ; j < l ; j++ )
{
	r=n%10;
	N+=c * Math.pow(10, r-1);
	n = n / 10 ;
	c++;
}
System.out.println(N);
}

}
