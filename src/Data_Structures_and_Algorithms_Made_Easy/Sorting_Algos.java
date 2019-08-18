package Data_Structures_and_Algorithms_Made_Easy;

public class Sorting_Algos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,3,1,6,-2,9,0} ;
		int[] b = {1,2,3,4,5,6,7} ;
//		bubble_sort(a);
//		bubble_sort_improved(b);
//		selection_sort(a);
		insertion_sort(a);
		
		
	}

//	Time Complexity - O(n^2)
	public static void bubble_sort(int[] a) {
		
		for ( int i = 0 ; i < a.length - 1 ; i++ ) {
			
			for ( int j = 0 ; j < a.length - i - 1; j++) {
				
				if ( a[j] > a[j+1] ) {
					
					int t = a[j] ;
					a[j] = a[j+1] ;
					a[j+1] = t ;

				}
			}
		}
	
		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i] + " ");
		}
			
	}
	
//	Time Complexity - O(n^2)
//	but O(n) for best case
	public static void bubble_sort_improved(int[] a) {
		
		boolean swapped = true ;
		for ( int i = 0 ; i < a.length - 1 && swapped ; i++ ) {
			swapped = false ;
			for ( int j = 0 ; j < a.length - i - 1; j++) {
				
				if ( a[j] > a[j+1] ) {
					
					int t = a[j] ;
					a[j] = a[j+1] ;
					a[j+1] = t ;
					swapped = true ;

				}
			}
		}
	
		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i] + " ");
		}
			
	}

//	Time Complexity - O(n^2)
	public static void selection_sort(int[] a) {
		
		
		for ( int i = 0 ; i < a.length - 1 ; i++ ) {
			
			int min = Integer.MAX_VALUE ;
			int ind = i + 1 ;
			
			for ( int j = i + 1 ; j < a.length ; j++) {
				if (a[j] < min) {
					min = a[j];
					ind = j ;
				}
			}
			
			if ( a[ind] < a[i] ) {
				int t = a[i] ;
				a[i] = a[ind] ;
				a[ind] = t ;
			}
			
		}
		
		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i] + " ");
		}
		
	}
	
	
	public static void insertion_sort(int[] a) {
		
		for ( int i = 1 ; i < a.length ; i++ ) {
			int t = a[i] ;
			int ind = i - 1 ;
			for ( int j = i - 1 ; j >= 0 ; j-- ) {
				
				if ( a[j] > t) {
					a[j+1] = a[j] ;
				}
				else {
					ind = j + 1 ;
					break ;
				}
				
				
			}
			
			a[ind] = t ;
			
			for ( int k = 0 ; k < a.length ; k++ ) {
				System.out.print(a[k] + " ");
			}
			System.out.println();
		}
		
		for ( int i = 0 ; i < a.length ; i++ ) {
			System.out.print(a[i] + " ");
		}
		
	}
	
}
