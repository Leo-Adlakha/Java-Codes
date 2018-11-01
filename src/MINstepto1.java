import java.util.Scanner;

public class MINstepto1 {


	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//check 51 by recursion
		int n = scn.nextInt();
		int op = 0 ;
		while ( n != 1)
		{
			if ( n%3 == 0 )
			{
				n=n/3;
				op++;
			}
			else if ( (n-1)%3 == 0 )
			{
				n--; 
				n=n/3;
				op+=2;
			}
			else if ( (n-2)%3 == 0 )
			{
				n-=2;
				op+=3;
				n = n / 3 ; 
			}
			else if ( n%2 == 0 )
			{
				n=n/2;
				op++;
			}
			else if ( (n-1)%2 == 0 )
			{
				n--;
				op++;
				n = n/2 ;
				op++;
			}
		}
		System.out.println(op);
		
	}

}
