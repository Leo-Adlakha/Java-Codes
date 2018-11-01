import java.util.Scanner;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int sum = 0 , c ;
int r = 0 ;
while ( n != 0 )
{
	c = n % 8 ;
	sum = (int) (sum + (c*Math.pow(10, r)));
	n = n / 8 ;
	r++;
}
System.out.println(sum);
	}

}
