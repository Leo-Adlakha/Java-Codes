import java.util.Scanner;

public class Powerofanumbyrecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in ) ; 
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(pow(x, n));
	}

	public static int pow( int x , int n )
	{
		if ( n == 1 )
		{
			return x ;
		}
		int ans;
		ans = x * pow(x, n-1);
		return ans ;
	}
}
