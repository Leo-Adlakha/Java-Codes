import java.util.Scanner;

//RECURSION-NTH TRIANGLE
//Take as input N, a number. Write a recursive function to find Nth triangle where 1st triangle is 1, 2nd triangle is 1 + 2 = 3, 3rd triangle is 1 + 2 + 3 = 6, so on and so forth. Print the value returned.
//
//
//Input Format:
//Enter a number N
//
//Constraints:
//None
//Output Format:
//Display the Nth triangle
//
//Sample Input:
//4
//Sample Output:
//10

public class Nthtrianglerecursion {

	static Scanner scn = new Scanner (System.in);
	
	public static void main(String[] args) {
	 
		int n = scn.nextInt();
        int sum = 0 ;
		System.out.println(ans(n, sum));
		
	}
	
	public static int ans( int n, int sum )
	{
		if ( n == 1 )
		{
			return 1 ;
		}
		
		sum = ans( n - 1, sum ) + n ;
		
		
		return sum ;
		
		
		
	}
}
