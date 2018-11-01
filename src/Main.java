
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
Scanner scn = new Scanner(System.in);
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
