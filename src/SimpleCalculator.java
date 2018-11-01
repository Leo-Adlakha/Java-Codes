import java.util.Scanner;

/*BASIC CALCULATOR
Write a program that works as a simple calculator.

1.It reads a character (ch)
2.If ch is among '+', '-', '*', '/' or '%' it furthur takes two numbers (N1 and N2 as input). It then performs appropriate appropriate operation between numbers and print the number. 3.If ch is 'X' or 'x', the program terminates.
4.If ch is any other character, the program should print 'Invalid operation. Try again.' and seek inputs again (starting from character).

Write code to achieve above functionality.


Constraints:
Numbers should be greater than 0 and lesser than 100000000. 
For division and modulus, 2nd number should not be 0.
Sample Input:
* 
1 
2 
/ 
4 
2 
+ 
3 
2 
; 
X
Sample Output:
2 
2 
5 
Invalid operation. Try again.
Explanation:
Maybe use a do-while.*/

public class SimpleCalculator {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
char ch = 'x' ;
do 
{
    
    if ( ch != 'x' && ch != 'X' )
    {
	if ( ch == '+' )
	{
		System.out.println(add());
	}
	else if ( ch == '-' )
	{
		System.out.println(sub());
	}
	else if ( ch == '*' )
	{
		System.out.println(mul());
	}
	else if ( ch == '/' )
	{
		System.out.println(div());
	}
	else if ( ch == '%' )
	{
		System.out.println(mod());
	}
	else
	{
		System.out.println("Invalid operation. Try again.");
	}
    }
    ch = scn.next().charAt(0);
}while ( ch != 'x' && ch != 'X' ) ;
	}

	public static int add()
	{
		int a = scn.nextInt(); 
		int b = scn.nextInt();
		return (a+b) ;
	}
	public static int sub()
	{
		int a = scn.nextInt(); 
		int b = scn.nextInt();
		return (a-b) ;
	}
	public static int mul()
	{
		int a = scn.nextInt(); 
		int b = scn.nextInt();
		return (a*b) ;
	}
	public static int div()
	{
		int a = scn.nextInt(); 
		int b = scn.nextInt();
		return (a/b) ;
	}
	public static int mod()
	{
		int a = scn.nextInt(); 
		int b = scn.nextInt();
		return (a%b) ;
	}
}
