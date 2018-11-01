import java.util.Scanner;

public class StarPatternQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		for ( int i = 1 ; i <= n ; i++ )
		{
			for ( int j = 1 ; j <= n ; j++ )
			{
				if ( i == j || j == n-i+1 )
				{
		            System.out.print("*");
				}  
				else  
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
