import java.util.Scanner;

public class StarPatternQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		for ( int i = 1 ; i <= n ; i++ )
		{
			for ( int k = 1 ; k <= n-i ; k++)
			{
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
