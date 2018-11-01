import java.util.Scanner;

public class INCDECPATTERNEVENODD {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner (System.in ) ; 
		int n = scn.nextInt();
//		inc(n);
//		dec(n);
//		incdec(n);
		incdecpat(n);

	}
	public static void inc ( int n )
	{
		if ( n == 0 )
		{
			return ;
		}
		inc(n-1);
		System.out.println(n);
	}
	public static void dec ( int n )
	{
		if ( n == 0 )
		{
			return ;
		}
		
		System.out.println(n);
	
		dec(n-1);
	}
	public static void incdec ( int n )
	{
		if ( n == 0 )
		{
			return ;
		}
		
		System.out.println(n);
		incdec(n-1);
		System.out.println(n);
	}
	
	
	public static void incdecpat ( int n )
	{
		if ( n == 0 )
		{
			return ;
		}
		
		if ( n%2 != 0 )
		{
			System.out.println(n);
		}
		incdecpat(n-1);
		if ( n%2 == 0 )
		{
			System.out.println(n);
		}
	}

}
