import java.util.Scanner;

public class Binarytodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int n = scn.nextInt();
int r,m=1,sum=0;
while ( n != 0 )
{
	r=n%10;
	sum= sum + (r*m);
	n=n/10;
	m*=2;
}
System.out.println(sum);
	}

}
