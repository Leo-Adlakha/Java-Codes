import java.util.Scanner;

public class DisplayNthFibonacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int a= 0, b= 1;
int i = 2, c, p=0;
if ( n == 0 )
{
	System.out.println(a);
}
else if ( n == 1 )
{
	System.out.println(b);
}
else if ( n >= 2 )
{
while ( i <= n)
{
	c=a+b;
	a=b;
	b=c;
	if ( i == n )
	{
		p = c;
	}
	i++;
}
System.out.println(p);
}

	}

}
