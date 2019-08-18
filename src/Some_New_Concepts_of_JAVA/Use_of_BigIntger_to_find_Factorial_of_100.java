package Some_New_Concepts_of_JAVA;

import java.math.BigInteger;
import java.util.Scanner;

public class Use_of_BigIntger_to_find_Factorial_of_100 {

    static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			BigInteger n = scn.nextBigInteger() ;
			BigInteger j = new BigInteger("1") ;
			BigInteger ans = new BigInteger("1") ;
			
			while ( j.compareTo(n) <= 0 )
			{
				
				ans = ans.multiply(j) ;
				
				j = j.add(BigInteger.ONE) ;
			}
			
			System.out.println(ans);

		}
	}
	
}
