import java.util.Scanner;

public class PrintSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n1 = scn.nextInt();
int n2 = scn.nextInt();
int c = 0 ;
int t ;
int i = 1 ;
while ( c < n1 )
{
	t = (3*i)+2;
	if ( t % n2 != 0 )
	{
		System.out.println(t);
		c++;
	}
	i++;	
}
	}

}
