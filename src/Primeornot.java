import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number:");
		int n = scn.nextInt();
		int i=1,p=0;
		while(i<=n)
		{
			if(n%i==0)
			{
			p++;
			}
			i++;
		}
		if(p>2)
		{
			System.out.println("Not prime!");
		}
		else
		{
			System.out.println("Prime!");
		}
	}

}
