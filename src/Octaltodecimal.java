import java.util.Scanner;

public class Octaltodecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int sum = 0 , c ;
		int r = 0 ;
		while ( n != 0 )
		{
			c = n % 10 ;
			sum = (int) (sum + (c*Math.pow(8, r)));
			n = n / 10 ;
			r++;
		}
		int ans = 0 ;
		int p, q = 0;
		while ( sum != 0 )
		{
			p = sum % 2 ;
			ans = (int) ( ans + p*Math.pow(10, q));
			sum/=2;
			q++;
		}
		System.out.println(ans);
	}

}
