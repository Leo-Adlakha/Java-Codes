import java.util.Scanner;

/*REVISING QUADRATIC EQUATIONS
Given coefficients of a quadratic equation , you need to print the nature of the roots (real and distinct , real and equal , imaginary).


Input Format:
First contains three coefficients a,b,c from the equation ax^2 + bx + c = 0.

Output Format:
Output contains one/two lines.First line contains nature of the roots .The next line contains roots separated by a space if they exist. Use 'float' type to store the value of roots.

Sample Input:
1 -11 28
Sample Output:
Real and Distinct
4 7
Explanation:
The input corresponds to equation ax^2 + bx + c = 0. Roots = (-b + sqrt(b^2 - 4ac))/2a , (-b - sqrt(b^2 - 4ac))/2a
*/
public class Revising_Quadratic_Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in ) ;
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int D = (b * b) - (4 * a * c) ;
		if ( D > 0 )
		{
			System.out.println("Real and Distinct");
			System.out.println((-b + Math.pow(D, 0.5))/(2 * a) + " " + (-b - Math.pow(D, 0.5))/(2 * a) );
		}
		else if ( D == 0 )
		{
			System.out.println("Real and Equal");
			System.out.println(((float)(-b)) / ( 2 * a) + " " + ((float)(-b)) / ( 2 * a) );
		}
		else
		{
			System.out.println("Imaginary");
		}
		
	}

}
