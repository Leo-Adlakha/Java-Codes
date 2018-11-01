//PATTERN HOURGLASS
//Take N as input. For a value of N=5, we wish to draw the following pattern :
//
//                          5 4 3 2 1 0 1 2 3 4 5
//                            4 3 2 1 0 1 2 3 4 
//                              3 2 1 0 1 2 3 
//                                2 1 0 1 2 
//                                  1 0 1 
//                                    0 
//                                  1 0 1 
//                                2 1 0 1 2 
//                              3 2 1 0 1 2 3 
//                            4 3 2 1 0 1 2 3 4 
//                          5 4 3 2 1 0 1 2 3 4 5
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
// 5 4 3 2 1 0 1 2 3 4 5
//   4 3 2 1 0 1 2 3 4 
//     3 2 1 0 1 2 3 
//       2 1 0 1 2 
//         1 0 1 
//           0 
//         1 0 1 
//       2 1 0 1 2 
//     3 2 1 0 1 2 3 
//   4 3 2 1 0 1 2 3 4 
// 5 4 3 2 1 0 1 2 3 4 5
import java.util.Scanner;

public class PatternHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
int n = scn.nextInt();
int i = 1 , j , k ;
int nsp = 0 ;
int nst = (2*n)+1;
int c ;
int p = n ;

while ( i <= ((2*n)+1) )
{
	j = k = 1 ;
	c = p ;
    while ( j <= nsp )
    {
    	System.out.print("  ");
    	j++;
    }
    while ( k <= nst )
    {
    	System.out.print(c+" ");
    	if ( k <= p )
    	{
    	    c--;
    	}
    	else 
    	{
    		c++;
    	}
    	k++;
    }
    if ( i < n + 1 )
    {
    	nsp++  ;
    	nst-=2 ;
    	p--;
    }
    else
    {
    	nsp--;
    	nst+=2;
    	p++;
    }
	i++;
	System.out.println();
}
	}

}
