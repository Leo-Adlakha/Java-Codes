import java.util.Scanner;

public class ShoppingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int T = scn.nextInt();

int a , h , c, i=0;
while ( i < T )
{	
int M = scn.nextInt();
int N = scn.nextInt();	
a = 0;
h = 0;
c = 1;
while ( M > 0 )
{
	M= M-c;
	c+=2;
	a++;		
}
c = 2;
while ( N > 0 )
{
	N= N-c;
	c+=2;
	h++;		
}
if ( a > h )
{
	System.out.println("Aayush");
}
else
{
	System.out.println("Harshit");
}
i++;
}
   }
}
