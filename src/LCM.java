import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n1 = scn.nextInt();
int n2 = scn.nextInt();
int i=n1, min = n1*n2 ;
while ( i <= n1*n2 )
{
	if ( i%n1 == 0 && i%n2 == 0 )
	{
		if ( i < min )
		{
		min = i;
		}
	}
	i++;
}
System.out.println(min);
	}

}
