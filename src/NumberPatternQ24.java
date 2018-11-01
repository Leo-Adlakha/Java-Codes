import java.util.Scanner;

public class NumberPatternQ24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		for ( int i = 1; i <= n; i++ )
		{
			for ( int k = 1 ; k <= n - i ; k++ )
			{
				System.out.print(" ");
			}
			for ( int j = 1 ; j <= (2*i)-1 ; j++ )
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
