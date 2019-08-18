import java.util.Scanner;

/*GENERATE PARENTHESES
Given an integer 'n'. Print all the possible pairs of 'n' balanced parentheses.
The output strings should be printed in the sorted order considering '(' has higher value than ')'.


Input Format:
Single line containing an integral value 'n'.

Constraints:
1<=n<=11
Output Format:
Print the balanced parentheses strings with every possible solution on new line.

Sample Input:
2
Sample Output:
()() 
(()) 
Time Limit: 1 sec*/

public class Generate_Parentheses {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		System.out.println(printanscount(0, n, 0));
		printans(0,"",n,0) ;
		
	}

	public static int printanscount(int count1, int n, int count2 ) 
	{
		
		if ( count1 == n && count2 == n )
		{
			return 1 ;
		}
		if ( count1 > n || count2 > n )
		{
			return 0 ;
		}
		
		int ans = 0 ;
		count1++ ;
		ans += printanscount(count1, n, count2 );
		count1-- ;
		
		if ( count1 > 0 && count2 < count1 )
		{
		count2++ ;
		ans += printanscount(count1, n, count2 );
		count2-- ;
		}
		
		return ans ;
		
	}
	
	public static void printans(int count1, String ans, int n, int count2 ) 
	{
		
		if ( count1 == n && count2 == n )
		{
			System.out.println(ans);
			return ;
		}
		if ( count1 > n || count2 > n )
		{
			return ;
		}
		
		if ( count1 > 0 && count2 < count1 )
		{
		count2++ ;
		printans(count1, ans + ")", n, count2 );
		count2-- ;
		}
		
		count1++ ;
		printans(count1, ans + "(", n, count2 );
		count1-- ;
		
		
	}

}
