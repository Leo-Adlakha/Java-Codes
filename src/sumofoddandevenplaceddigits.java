import java.util.Scanner;

public class sumofoddandevenplaceddigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int p;
p = n;
int odd=0, even= 0;
while ( n > 0 )
{
	odd = odd + ( n%10 );
	n=n/100;
}
while ( p > 0 )
{
	p=p/10;
	even = even + ( p%10 );
	p=p/10;
}
System.out.println(odd);
System.out.println(even);

	}

}
