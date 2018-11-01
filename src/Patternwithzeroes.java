import java.util.Scanner;

public class Patternwithzeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int c ;
		for ( int i = 1 ; i <= n ; i++ )
		{
		    c = i ;
			for ( int j = 1 ; j <= i ; j++ )
			{
			    if ( j == 1 || j == i )
			    {
				System.out.print(c + "\t");
			    }
			    else 
			    {
			    System.out.print("0\t");
			    }
			}
			System.out.println();
		}
	}

}
