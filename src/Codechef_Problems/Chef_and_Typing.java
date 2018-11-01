package Codechef_Problems;

/*Chef and Typing Problem Code: TYPING
Add problem to Todo list
Submit

  
Read problems statements in Hindi, Mandarin chinese, Russian, Vietnamese and Bengali as well.
Chef is practising his typing skills since his current typing speed is very low. He uses a training application that displays some words one by one for Chef to type.

When typing a word, Chef takes 0.2 seconds to type the first character; for each other character of this word, he takes 0.2 seconds to type this character if it is written with a different hand than the previous character, or 0.4 seconds if it is written with the same hand. The time taken to type a word is the sum of times taken to type all of its characters. However, if a word has already appeared during practice, Chef can type it in half the time it took him to type this word for the first time.

Currently, Chef is practising in easy mode, which only uses words that consists of characters 'd', 'f', 'j' and 'k'. The characters 'd' and 'f' are written using the left hand, while the characters 'j' and 'k' are written using the right hand.

Given the words that appeared during Chef's practice, calculate the total time taken by Chef to type all the words.

Input
The first line of the input contains a single integer T
 denoting the number of test cases. The description of T
 test cases follows.
The first line of each test case contains a single integer N
 denoting the number of words Chef had to type.
Each of the following N
 lines contains a single string — a word Chef has to type.
Output
For each test case, print a single line containing one integer — the time taken by Chef to type all the words, in the units of tenths of seconds.

Constraints
1≤T≤100
1≤N≤100
each word contains only characters 'd', 'f', 'j', 'k'
the length of each word does not exceed 20
Subtasks
Subtask #1 (100 points): original constraints

Example Input
1
5
fdjkd
dfjdk
dfd
fdjkd
kkjjk
Example Output
61*/

import java.util.Scanner;

public class Chef_and_Typing {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt() ;
			int ans = 0 ;
			
			for ( int k = 0 ; k < n ; k++ )
			{
				boolean bl ;
				String str = scn.next();
				String temp = str ;
				int[] time = new int[str.length()] ;
				ans += 2 ;
				time[0] = 2 ;
				char ch = str.charAt(0) ;
				str = str.substring(1) ;
				if ( ch == 'd' || ch == 'f' )
				{
					bl = false ;
				}
				else
				{
					bl = true ;
				}
				ans += res ( str, bl, time, temp ) ;
			}
			System.out.println(ans);
			
		}
		
	}

	public static int res( String str, boolean bl, int[] time, String temp ) 
	{
		
		int i = 1 ;
		int ans = 0 ;
		while ( str.length() != 0 )
		{
		char ch = str.charAt(0) ;
		if ( ch == 'd' || ch == 'f' )
		{
			if ( bl )
			{
				if ( check(str,temp,ch) == -1 ) 
			    {
					ans += 2 ;
					time[i] = 2 ;	
				}
				else
				{
					int idx = check(str,temp,ch) ;
					ans += time[idx]/2 ;
					time[i] = time[idx]/2 ;
				}
				
			}
			else
			{
				if ( check(str,temp,ch) == -1 ) 
			    {
					ans += 4 ;
					time[i] = 4 ;	
				}
				else
				{
					int idx = check(str,temp,ch) ;
					ans += time[idx]/2 ;
					time[i] = time[idx]/2 ;
				}
			}
		}
		else
		{
			if ( bl )
			{
				if ( check(str,temp,ch) == -1 ) 
			    {
					ans += 4 ;
					time[i] = 4 ;	
				}
				else
				{
					int idx = check(str,temp,ch) ;
					ans += time[idx]/2 ;
					time[i] = time[idx]/2 ;
				}
			}
			else
			{
				if ( check(str,temp,ch) == -1 ) 
			    {
					ans += 2 ;
					time[i] = 2 ;	
				}
				else
				{
					int idx = check(str,temp,ch) ;
					ans += time[idx]/2 ;
					time[i] = time[idx]/2 ;
				}
			}
		}
		
		if ( ch == 'd' || ch == 'f' )
		{
			bl = false ;
		}
		else
		{
			bl = true ;
		}
		
		str = str.substring(1) ;
		i++ ;
		}
		
		return ans ;
		
	}

	public static int check(String str, String temp, char ch) 
	{
		int j = temp.length() - str.length() - 1 ;
		while ( j >= 0 )
		{	
			if ( temp.charAt(j) == ch )
			{
				return j ;
			}
			j-- ;
		}
		
		return -1 ;
	}

}
