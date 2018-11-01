import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner (System.in);
System.out.print("Enter the value of n:");
int n=scn.nextInt();
int a=0,b=1,c;
int i=1;
System.out.print(a + "\t");
System.out.print(b + "\t");
while(i<n) 
{
	c=a+b;
	System.out.print(c + "\t");
	a=b;
	b=c;
	i++;
}
	}

}
