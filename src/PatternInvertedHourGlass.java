import java.util.Scanner;

/*//PATTERN INVERTEDHOURGLASS
//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//             5                   5 
//             5 4               4 5 
//             5 4 3           3 4 5 
//             5 4 3 2       2 3 4 5 
//             5 4 3 2 1   1 2 3 4 5 
//             5 4 3 2 1 0 1 2 3 4 5 
//             5 4 3 2 1   1 2 3 4 5 
//             5 4 3 2       2 3 4 5 
//             5 4 3           3 4 5 
//             5 4               4 5 
//             5                   5 
//
//Input Format:
//Take N as input.
//
//Output Format:
//Pattern should be printed with a space between every two values.
//
//Sample Input:
//5
//Sample Output:
//5                   5 
//5 4               4 5 
//5 4 3           3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2 1 0 1 2 3 4 5 
//5 4 3 2 1   1 2 3 4 5 
//5 4 3 2       2 3 4 5 
//5 4 3           3 4 5 
//5 4               4 5 
//5                   5 
*/
public class PatternInvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int i = 1 ;
		int nsp = (2 * n) - 1 ;
		int nst = 1 ;
		int disp = n ;
		int j, k ;
		
		while ( i <= ( 2 * n ) + 1 )
		{
			disp = n ;
			if ( i == n+1 )
			{
				nsp = 1 ;
				nst = n ;
				int dis = n ;
				for ( int l = 0 ; l < 2 * n + 1 ; l++ )
				{
					if ( l < n)
					{
					    System.out.print( dis + " " );
					    dis--;
					}
					else
					{
						System.out.print( dis + " " ) ;
						dis++ ;
					}			
				}
				System.out.println();
				i++ ;
			}
			else
			{
			j = k = 1 ;
			while ( j <= nst )
			{
				System.out.print( disp + " " );
				j++ ;
				disp--;
			}
			while ( k <= nsp )
			{
				System.out.print("  ");
				k++;
			}
			disp++ ;
 			j = 1 ;
			while ( j <= nst )
			{
				System.out.print( disp + " " );
				j++;
				disp++;
			}
			if ( i <= n )
			{
				nsp -= 2 ;
				nst++ ;
			}
			else 
			{
				nsp += 2 ;
				nst-- ;
			}
			
			System.out.println();
			i++;
			}
		}
		
	}

}
