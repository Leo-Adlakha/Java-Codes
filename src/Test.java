import java.util.* ;

public class Test{
	
	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		
		int t = scn.nextInt() ;
		for ( int i = 0 ; i < t ; i++ ) {
			
			int n = scn.nextInt() ;
			int[] a = takeInput(n) ;
			findNumber(a) ;
			
		}
		
	}

	public static void findNumber(int[] a) {
		// TODO Auto-generated method stub
		
		int[] b = new int[a.length] ;
		for ( int j = 0 ; j < a.length ; j++ ) {
		
			b[j] = j + 1 ;
			
		}
		
		for ( int i = 0 ; i < a.length ; i++ ) {
			

			
		}
		
	}

	public static int[] takeInput(int n) {
		// TODO Auto-generated method stub
		int[] a = new int[n] ;

		for ( int i = 0 ; i < n ; i++ ) {
			a[i] = scn.nextInt() ;
		}
		
		return a;
	}
	
	

}