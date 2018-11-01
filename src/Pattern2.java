import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner( System.in );
int n = scn.nextInt();
for ( int i= 1; i<=n; i++)
{
	for ( int j= 0; j<n-i; j++)
	{
		System.out.print(" ");
	}
	for ( int k = 0; k< i; k++)
	{
		System.out.print("*");
	}
	System.out.println();
}
	}

}
