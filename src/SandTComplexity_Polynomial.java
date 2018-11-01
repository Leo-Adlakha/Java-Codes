import java.util.Scanner;

public class SandTComplexity_Polynomial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int x = scn.nextInt();
		int n = scn.nextInt();
		System.out.println(polynomial(n,x));
		
	}
	
	public static int polynomial(int n, int x)
	{
		int ans = 0 ;
		int multiplier = x ;
		for ( int i = n ; i >= 1 ; i -- )
		{
			ans += i*multiplier ;
			multiplier *= x ;
		}
		
		return ans ;
		
	}
	
	

}
