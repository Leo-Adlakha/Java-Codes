package Object_Orientation_CEC07;

public class Sorting_Algos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {2,1,7,3,4,1,0,-3} ;
		Bubble(a) ;
		Selection(a);
		Insertion(a);
		
		
	}
	
	public static void Bubble(int[] a) {
		
		int[] b = a ;
		
		for ( int i = 0 ; i < b.length - 1 ; i++ ) {
			
			for ( int j = 0 ; j < b.length - i - 1 ; j++ ) {
				
				if( b[j] >= b[j+1] ) {
					int t = b[j] ;
					b[j] = b[j+1] ;
					b[j+1] = t ;
				}
				
			}
			
		}
		
		for ( int i = 0 ; i < b.length ; i++ ) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
	}
	
	public static void Selection(int[] a) {
		
		int[] b = a ;
		
		for ( int i = 0 ; i < b.length - 1 ; i++ ) {
			
			int min = b[i] ;
			int mini = i ;
			
			for ( int j = i + 1 ; j < b.length ; j++ ) {
				
				if ( b[j] < min ) {
					min = b[j] ;
					mini = j ;
				}
				
			}
			
			int t = b[i] ;
			b[i] = b[mini] ;
			b[mini] = t ;
			
		}
		
		for ( int i = 0 ; i < b.length ; i++ ) {
			
			System.out.print(b[i] + " ");
			
		}
		System.out.println();
		
	}
	
	public static void Insertion ( int[] a )
	{
		
		int[] b = a ;
		
		for ( int i = 1 ; i < b.length ; i++ )
		{
			
			int t = b[i];
			int j = i-1;
			while ( j >= 0 && t <= b[j] )
			{
				
				b[j+1] = b[j] ;
				j--;
				
			}
			
			b[j+1] = t ;
		}
		
		for ( int i = 0 ; i < b.length ; i++ ) {
			
			System.out.print(b[i] + " ");
			
		}
		
		System.out.println();
	}

}
