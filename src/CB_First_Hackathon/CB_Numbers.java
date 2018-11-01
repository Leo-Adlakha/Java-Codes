package CB_First_Hackathon;

import java.util.Scanner;

/*FINDING CB NUMBERS
Deepak and Gautam are having a discussion on a new type of number that they call Coding Blocks Number or CB Number. They use following criteria to define a CB Number.

0 and 1 are not a CB number.
2,3,5,7,11,13,17,19,23,29 are CB numbers.
Any number not divisible by the numbers in point 2 are also CB numbers.
Deepak said he loved CB numbers.Hearing it, Gautam throws a challenge to him.

Gautam will give Deepak a string of digits. Deepak's task is to find the number of CB numbers in the string. CB number once detected should not be sub-string or super-string of any other CB number.

Ex- In 661, both 61 and 661 are CB numbers but you can choose either 61 or 661, not both.

Further, the CB number formed can only be a sub-string of the string.

Ex - In 481, you can not take 41 as CB number because 41 is not a sub-string of 481

As there can be multiple solutions, Gautam asks Deepak to find the maximum number of CB numbers that can be formed from the given string.

Deepak has to take class of Launchpad students. Help him by solving Gautam's challenge.


Input Format:
First line contain size of the string.

Next line is A string of digits.

Constraints:
1 <= Length of strings of digits <= 17

Output Format:
Maximum number of CB numbers that can be formed.

Sample Input:
5
81615
Sample Output:
2
Explanation:
61 and 5 are two CB numbers.*/

public class CB_Numbers {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		String str = scn.next() ;
//		System.out.println(CBnum(str));
		
		
	}

	/*  public static int CBnum ( String str ) 
    {
		if ( str.length() == 0 )
		{
			return 0 ;
		}
    	
		char ch = str.charAt(0) ;
		int n = getnum(ch) ;
		int ways1 = 0 ;
		int ways2 = 0 ;
		int ways3 = 0 ;
		int ways4 = 0 ;
		if ( n == 0 || n == 1 )
		{
			ways1 = CBnum(str.substring(1)) ;
		}
		else if ( n == 2 || n == 3 || n == 5 || n == 7 )
		{
			ways2 = CBnum(str.substring(1)) + 1 ;
		}
		else
		{
			char ch1 = str.charAt(1) ;
			n = Integer.valueOf ( ch + "" + ch1 ) ;
			if ( n == 11 || n == 13 || n == 17 || n == 19 || n == 23 || n == 29 )
			{
				ways3 = CBnum(str.substring(2)) + 1 ;
			}
			else
			{
				ways4 = CBnum(str.substring(1)) ;
			}
		}
		
    	
    	
    	
	}
    
    public static int getnum ( char ch )
    {
    	
    	return (int) ch - 48 ;
    	
    	
    }
*/

}
