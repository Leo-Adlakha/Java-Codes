import java.util.Scanner;

public class LexicoCountingusingPritRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int start = scn.nextInt();
		int end = scn.nextInt();
		if ( start == 0 )
		{
			System.out.println(0);
			Lexico(start+1 , end );
		}
		else
		{
		Lexico(start,end);
		}
			
	}
	
	public static void Lexico( int start , int end )
	{
		
		if ( start > end )
		{
			return ;
		}
		
		
		System.out.println(start);
		
		for ( int i = 0 ; i <= 9 ; i++ )
		{
			Lexico(start*10+i,end);
		}
		
		if ( start + 1 <= 9 )
			
			
		Lexico(start + 1 , end );
		
		
		
		
	}

}
