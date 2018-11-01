import java.util.Scanner;

/*BOSTON NUMBERS
A Boston number is a composite number, the sum of whose digits is the sum of the digits of its prime factors obtained as a result of prime factorization (excluding 1 ). The first few such numbers are 4,22 ,27 ,58 ,85 ,94 and 121 . For example, 378 = 2 × 3 × 3 × 3 × 7 is a Boston number since 3 + 7 + 8 = 2 + 3 + 3 + 3 + 7. Write a program to check whether a given integer is a Boston number.


Input Format:
There will be only one line of input:N , the number which needs to be checked.

Constraints:
1 < N < 2,147,483,647 (max value of an integer of the size of 4 bytes)

Output Format:
1 if the number is a Boston number. 0 if the number is a not Boston number.

Sample Input:
378
Sample Output:
1
Explanation:
Self Explanatory

Time Limit: 10 sec
*/

public class Boston_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in) ;
		int n = scn.nextInt() ;
		System.out.println(checkboston(n));
	
	}
	
	public static int checkboston( int n )
	{
		
		int sum1 = 0 ;
		int p = n ; 
		while ( p != 0)
		{
			int rem = p % 10 ; 
			sum1 += rem ;
			p = p / 10 ;
		}
		int sum2 = 0 ;
		int divisor = 2 ;
		while ( n != 1 )
		{
			if ( n % divisor == 0 )
			{
				n = n / divisor ;
		        sum2 += divisor ;
			}
			else
			{
			    divisor++ ;
			}
		}
		if ( sum1 == sum2 )
		{
			return 1 ;
		}
		else
		{
			return 0 ;
		}
		
	}

}
