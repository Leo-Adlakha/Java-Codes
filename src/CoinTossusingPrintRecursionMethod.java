import java.util.Scanner;

public class CoinTossusingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(outcomes(n,""));
		System.out.println(outcomesnoconsecutiveheads(n, "", false));
		
		
		
	}

	public static int outcomes(int n , String ans)
	{
		if ( n == 0 )
		{
			System.out.println(ans);
			return 1 ;
		}
		
			int waysH = outcomes(n-1,ans+"H");
		    int waysT = outcomes(n-1,ans+"T");
		    
		    return waysH + waysT ;
			
	}
	
	public static int outcomesnoconsecutiveheads(int n , String ans , boolean lastvisited )
	{
		if ( n == 0 )
		{
			System.out.println(ans);
			return 1;
		}
		
		int ways = 0 ;
		
		if ( !lastvisited )
		{
		ways += outcomesnoconsecutiveheads(n-1,ans+"H",true) ;
		} 
		ways += outcomesnoconsecutiveheads(n-1,ans+"T",false);
			
		return ways ;
	}
	
	
	
	
	
}
