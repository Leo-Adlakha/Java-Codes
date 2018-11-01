package Codechef_Problems;

import java.util.*;

/*Coloring the Grid Problem Code: CLORGIRD
Add problem to Todo list
Submit
Tweet
  
Read problems statements Bengali , Hindi , Russian and Vietnamese as well.
You are given a grid with N
 rows and M
 columns; each cell of this grid is either empty or contains an obstacle. Initially, all cells are colorless.

You may perform the following operation an arbitrary number of times (including zero): choose a 2×2
 square in the grid and color all four of its cells. Each cell may be colored any number of times.

You want all empty cells to be colored and all cells containing obstacles to be colorless. Find out if this state can be achieved.

Input
The first line of the input contains a single integer T
 denoting the number of test cases. The description of T
 test cases follows.
The first line of each test case contains two space-separated integers N
 and M
.
The following N
 lines describe the grid. Each of these lines contains a string with length M
 containing only characters '.' (denoting an empty cell) and '#' (denoting a cell with an obstacle).
Output
For each test case, print a single line containing the string "YES" if it possible to color the grid in the required way or "NO" if it is impossible (without quotes).

Constraints
1≤T≤10,000
2≤N,M≤103
the sum of N⋅M
 over all test cases does not exceed 5,000,000
Subtasks
Subtask #1 (30 points): only the first row of the grid may contain obstacles

Subtask #2 (70 points): original constraints

Example Input
2
3 3
..#
...
...
3 3
...
.#.
...
Example Output
YES
NO*/

public class Colouring_The_Grid {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int t = scn.nextInt();
		for ( int  i = 0 ; i < t ; i++ )
		{
			int n = scn.nextInt();
			int m = scn.nextInt();
			int[][] a = new int[n][m] ;
			for ( int j = 0 ; j < n ; j++ )
			{
				String str = scn.next() ;
				for ( int k = 0 ; k < m ; k++ )
				{
					char ch = str.charAt(k) ;
					if ( ch == '#' )
					{
						a[j][k] = 2 ;
					}
				}
			}
			int rlo = 0 ;
			int rhi = 1 ;
			int clo = 0 ;
			int chi = 1 ;
			while ( rhi < n && chi < m )
			{
			    boolean bl = false ;
			    for ( int l = rlo ; l <= rhi ; l++ )
			    {
				    for ( int o = clo ; o <= chi ; o++ )
				    {
					    if ( a[l][o] == 2 )
					    {
						    bl = true ;
						    break ;
					    }
				    }
			    }
			
			    if ( !bl )
			    {
			    	for ( int l = rlo ; l <= rhi ; l++ )
				    {
					    for ( int o = clo ; o <= chi ; o++ )
					    {
						    a[l][o] = 1 ;
					    }
				    } 
			    }
			    
			    if ( chi == m - 1 )
			    {
			    	rlo++ ;
			    	rhi++ ;
			    	clo = 0 ;
			    	chi = 1 ;
			    }
			    else
			    {
			    	clo++ ;
			    	chi++ ;
			    }
			    
			}
			
			boolean ans = true ;
			
			for ( int b = 0 ; b < a.length ; b++ )
			{
				for ( int c = 0 ; c < a[0].length ; c++ )
				{
					if ( a[b][c] == 0 )
					{
						ans = false ;
						break ;
					}
				}
			}
			
			if ( ans )
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
		
		

	}

}
