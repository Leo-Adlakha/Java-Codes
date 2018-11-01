import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.print("Enter Two Numbers:");
int a = scn.nextInt();
int b = scn.nextInt();
int i=1;
int m;
int n=0;
while(i<=a)
{
	if (a%i==0&&b%i==0)
	{
		m=i;
		if ( m > n)
		{
			n=m;
		}
	}
	i++;
}
System.out.println(n);
	}

}
