import java.util.Scanner;

public class Amstronginrange {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int low = scn.nextInt();
		int upp = scn.nextInt();
		 for ( int i = low ; i <= upp ; i++ )
		 {
			 int l = 0;
			 int p = i ;
			 
			 while ( p != 0 )
			 {
				 p=p/10;
				 l++;
			 }
			 
			 if ( numisams ( i , l ) == true )
			 {
				 System.out.println(i);
			 }
		 }
	}
	
	
	public static boolean numisams( int i , int l )
	{
		int sum=0;
		int p = i ;
		int r;
		while ( p != 0 )
		{
			r=p%10;
			sum+=Math.pow(r, l);
			p=p/10;
		}
		if ( sum == i )
		{
			return true ;
		}else 
		{
			return false ;
			
		}
	}

}
