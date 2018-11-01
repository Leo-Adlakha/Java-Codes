import java.util.Scanner;

public class LowerUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		char ch = scn.next().charAt(0);
		int in = ch ;
		if ( in >= 65 && in <= 90 )
		{
			System.out.println("UPPERCASE");
		}
		else if ( in >=97 && in <=122 )
		{
			System.out.println("lowercase");
		}
		else 
		{
			System.out.println("Invalid");
		}
	}

}
