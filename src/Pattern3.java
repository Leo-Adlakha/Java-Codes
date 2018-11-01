import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner( System.in );
		int n = scn.nextInt();
		for ( int i= 1; i<=n; i++)
		{
			for ( int k = 0; k< i-1; k++)
			{
				System.out.print(" ");
			}
			for ( int j= 0; j<n-i+1; j++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
