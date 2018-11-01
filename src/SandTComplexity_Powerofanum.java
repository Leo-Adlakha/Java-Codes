import java.util.Scanner;

public class SandTComplexity_Powerofanum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		System.out.println(Power(a,b));
		
		
	}

	public static int Power( int a, int b )
	{
		int ans = 1 ;
		if ( b == 0 )
		{
			return 1;
		}
		
		int t = Power(a,b/2) ;
		
		if ( b % 2 == 0 )
		{
			ans = t*t ;
		}
		else
		{
			ans = t*t*a ;
		}
		return ans ;
		
		
	}
	
	
}
