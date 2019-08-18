package Sacred_Codes;

import java.util.ArrayList;
import java.util.Scanner;

/*DCP Parulkar's Assignment for Sartaj
Send Feedback
DCP Parulkar has a severe headache. Though he is annoyed with miscreants of Mumbai. But this is not what troubles him. The cause of his headache is Inspector Sartaj Singh. Sartaj is helping RAW agent Anjali Mathur. To stop Sartaj from helping her, DCP gives him a task to keep him busy.
DCP Parulkar coins a term "longest common prefix", which is defined as longest word with which both words start with. For example: the longest common prefix of words: "notify" and "notification" is the word "notif".
Now, DCP Parulkar gives a database of N words to Inspector Sartaj. DCP Parulkar also gives an algorithm to search a word X in the database. The algorithm is simple and is written as:
1. Compare the word X with each word in the database. We keep on comparing till we find a mismatching letter or end of one of the words is reached.
2. After that it is established either words are equal/unequal or that one is longer than the other.
3. When the algorithm finds the word X in the database, it terminates.
Analysing the algorithm, it shows that the number of steps needed to find a word W is equal to the sum of the lengths of the longest common prefixes of X and each of the words it was compared to.
Sartaj comes to you and asks you to write a program that calculates the number of steps the algorithm uses to find each of the Q query words.
Input Format:
 The first line contains an integer N (1 ≤ N ≤ 30000), the number of words in the database.
 Each of the following N lines contains a single word from the database. The words are given in the order the algorithm compares them to a query word. All words in the database will be distinct.
 The following line contains an integer Q (1 ≤ Q ≤ 30000), the number of words searched for.
 Each of the following Q lines contains a single query word.
 All words in the input will be strings of less than 30 lowercase letters of the English alphabet.
Constraints:
 Time Limit: 2 seconds
Output Format:
 Output one integer per line for each query word, the number of steps the algorithm uses when searching for the word.   
Sample Test Cases:
Sample Input 1:
8
majmunica
majmun
majka
malina
malinska
malo
maleni
malesnica
3
krampus
malnar
majmun
Sample Output 1:
8
29
14
Explanation:
In the first test case, the number of steps to search for the word "krampus" is 8 because the algorithm only needs to compare its first letter to each word in the database.
When searching for the word "malnar", we need three steps for each of the first three words, and four steps for each of the remaining five words, for a total of 29 steps.
To find the word "majmun" we use a total of 14 steps. For the first word in the database, we have six successful comparisons and one step in which we determine that the word "majmunica" is longer than the query word. For the second word, we also have six successful comparisons and a final step in which it is established that the words are equal. After finding the word, the algorithm terminates with great joy
*/

public class Finding_Assign {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		ArrayList<String> list = new ArrayList<>() ;
		for ( int i = 0 ; i < n ; i++ )
		{
			String str = scn.next();
			list.add(str);
		}
		int m = scn.nextInt() ;
		for ( int i = 0 ; i < m ; i++ )
		{
			String str = scn.next();
			long start = System.currentTimeMillis() ;
			System.out.println(findsteps(list,str));
			long end = System.currentTimeMillis() ;
			System.out.println(end-start);
		}
		
		
	}

	public static int findsteps(ArrayList<String> list, String ques ) 
	{
		
		int ans = 0 ;
		
		for ( int i = 0 ; i < list.size() ; i++ )
		{
			
			String str = list.get(i) ;
			boolean bl = false ; 
			
			for ( int j = 0 ; j < ques.length() && j < str.length() ; j++ )
			{
				ans++ ;
				if ( ques.charAt(j) == str.charAt(j) )
				{
					bl = true ;
				}
				else
				{
					bl = false ;
					break ;
				}
				
			}
			
			if ( bl )
			{
				if ( ques.length() == str.length() )
				{
					return ans + 1 ;
				}
				else
				{
					ans++ ;
				}
			}
			
			
		}
		
		return ans ;
		
		
		
	}

}
