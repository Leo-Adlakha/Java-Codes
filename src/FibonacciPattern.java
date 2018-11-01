
		import java.util.Scanner;
		public class FibonacciPattern {
		    public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
					int n = scn.nextInt();
					int c , a = 1, b = 1;
					for ( int i = 1 ; i <= n ; i++ )
					{
						
						for ( int j = 1 ; j <= i ; j++ )
						{
							if ( i == 1 )
							{
								c = 0 ; 
							}
							else if ( i == 2 )
							{
								c = 1 ;
							}
							else 
							{
								c = a + b ;
								a = b ;
								b = c ;
							}
						System.out.print(c + "\t");
						}
						System.out.println();
					}
		    }
		}

