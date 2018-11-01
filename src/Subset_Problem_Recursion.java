import java.util.ArrayList;
import java.util.Scanner;

/*SUBSET_PROBLEM ( RECURSION )
Take as input N, a number. Take N more inputs and store that in an array. Take as input target, a number

a. Write a recursive function which counts the number of subsets of the array which sum to target. Print the value returned.

b. Write a recursive function which prints subsets of the array which sum to target. Return type of functions is void.


Input Format:
Take as input N, a number. Take N more inputs and store that in an array.Take as input target, a number

Constraints:
None
Output Format:
Display the number of subsets and print the subsets in a space separated manner.

Sample Input:
3
1
2
3
3
Sample Output:
2
1 2  3
Time Limit: 4 sec*/

public class Subset_Problem_Recursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] a = takeInput(n) ;
		String str = "";
		for ( int i = 0 ; i < n ; i++ )
		{
			str += a[i] ;
		}
		ArrayList<String> ans = subsets(str) ;
		int t = scn.nextInt();
		int count = 0 ;
		for ( String val : ans )
		{
			if ( val != "" )
			{
				int sum = sum(val) ;
				if ( sum == t )
				{
					count++ ;
				}
			}
		}
		System.out.println(count);
		
		for ( String val : ans )
		{
			if ( val != "" )
			{
				int sum = sum(val) ;
				if ( sum == t )
				{
					int[] res = new int[10] ;
                    int l = 0 ;
					int myans = Integer.valueOf(val) ;
					while ( myans != 0 )
					{
						res[l] = myans % 10 ;
						myans = myans / 10 ;
						l++ ;
					}
					for ( int k = l - 1 ; k >= 0 ; k-- )
					{
						System.out.print(res[k] + " ");
					}
					System.out.print(" ");
				}
			}
		}
		
	}

	public static int sum(String val) 
	{
		int num = Integer.valueOf(val) ;
		int sum = 0 ;
		while ( num != 0 )
		{
			sum += num%10 ;
			num = num / 10 ;
		}
		return sum ;
	}

	public static int[] takeInput(int n) 
	{
		int[] arr = new int[n] ;
		for ( int i = 0 ; i < n ; i ++ )
		{
			arr[i] = scn.nextInt();
		}
		return arr ;
	}
	
	public static ArrayList<String> subsets ( String str )
	{
		
		if ( str.length() == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		
		char ch = str.charAt(0) ;
		String roq = str.substring(1) ;
		ArrayList<String> myans = new ArrayList<>() ;
		ArrayList<String> recans = subsets(roq) ;
		for ( String val : recans )
		{
			myans.add(val) ;
			myans.add(ch+val) ;
		}
		
		return myans ;
		
	}
	
}
