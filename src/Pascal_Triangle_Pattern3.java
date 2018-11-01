import java.util.Scanner;

/*PASCAL TRIANGLE(PATTERN 3)
Take N (number of rows), print the following pattern (for N = 6)
1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1


Constraints:
0 < N < 100
Sample Input:
6
Sample Output:
1  
1	1  
1	2	1  
1	3	3	1  
1	4	6	4	1  
1	5	10	10	5	1
Explanation:
Each number is separated from other by a tab.*/

public class Pascal_Triangle_Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner ( System.in ) ;
		int n = scn.nextInt();
		int diff ;
		int disp = 1 ;
		for ( int i = 1 ; i <= n ; i++ )
		{
			disp = 1 ;
			diff = i - 2 ;
			for ( int j = 1 ; j <= i ; j++ )
			{
				if ( i <= 2 )
				{
					System.out.print("1\t");
				}
				else
				{
					System.out.print(disp + "\t" );
					if ( i % 2 == 0 )
					{
					    if ( j < i / 2 )
					    {
					        disp = disp + diff ;
					        diff++ ;
					    }
					    else if ( j == i / 2 ) 
					    {
					    	diff-- ; 
					    }
				        else
				        {
				    	    disp = disp - diff ;
				    	    diff-- ;
				        }
					}
					else
					{
						if ( j <= i / 2 )
						{
						    disp = disp + diff ;
						    diff-- ;
						}
					    else
					    {
					    	diff++ ;
					    	disp = disp - diff ;
					    }
					}
				}
			}
			System.out.println();
		}
		
		
	}

}
