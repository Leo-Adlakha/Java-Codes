/*//PATTERN DOUBLESIDEDARROW
//Take N as input. For a value of N=7, we wish to draw the following pattern :
//
//                            1 
//                        2 1   1 2 
//                    3 2 1       1 2 3 
//                4 3 2 1           1 2 3 4 
//                    3 2 1       1 2 3 
//                        2 1   1 2 
//                            1 
//
//Input Format:
//Take N as input.
//
//Constraints:
//N is odd number.
//Output Format:
//Pattern should be printed with a space between every two values.
//
//Sample Input:
//7
//Sample Output:
//            1 
//        2 1   1 2 
//    3 2 1       1 2 3 
//4 3 2 1           1 2 3 4 
//    3 2 1       1 2 3 
//        2 1   1 2 
//            1 
*/
import java.util.Scanner;

public class PatternDoubleSidedArrow {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		int nsp1 = n - 1 ;
		int nst = 1 ;
		int disp = 1 ;
		int nsp2 = -1 ;
		
		int i = 1 ;
		int j, k ;
		
		while ( i <= n )
		{
			j = k = 1 ;
			while( j <= nsp1 )
			{
				System.out.print("  ");
				j++;
			}
			while ( k <= nst )
			{
				System.out.print( disp + " " );
				k++ ;
				disp-- ;
			}
			disp++;
			j = 1 ;
			while ( j <= nsp2 )
			{
				System.out.print("  ");
				j++;
			}
			k = 1 ;
			if ( i > 1 && i < n )
			{
			while ( k <= nst )
			{
				System.out.print( disp + " " );
				k++ ;
				disp++ ;
			}
			}
			if ( i <= n/2 )
			{
				nsp1 -= 2;
				nsp2 += 2;
				nst++ ;
				disp = i + 1 ;
			}
			else
			{
				nsp1 += 2;
				nsp2 -= 2;
				nst--;
				disp = n - i ;
			}
			
			
			i++ ;
			System.out.println();
			
		}		

	}

}
