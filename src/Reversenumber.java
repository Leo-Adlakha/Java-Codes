import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
System.out.print("Enter a number:");
int n = scn.nextInt();
int c;
while(n>0)
{
	c=n%10;
    System.out.print(c);
    n=n/10;
}
	}

}
