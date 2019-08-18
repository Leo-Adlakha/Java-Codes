import java.util.LinkedList;
import java.util.Scanner;


public class Practical_Linked_List {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		int n = scn.nextInt() ;
		for ( int i = 0 ; i < n ; i++ ) {
			list.addLast(scn.nextInt());
		}
		list = mergesort(list, 0, list.size() - 1);
		
		for ( int i = 0 ; i < list.size(); i++ ) {
			System.out.println(list.get(i));
		}
		
	}

	public static LinkedList<Integer> mergesort(LinkedList<Integer> list, int lo, int hi) {
		// TODO Auto-generated method stub
		
		if ( hi == lo ) {
			LinkedList<Integer> base = new LinkedList<>() ;
			base.addLast(list.get(hi));
			return base ;
		}
		
		int mid = ( lo + hi ) / 2 ;
		LinkedList<Integer> fh = mergesort(list, lo, mid) ;
		LinkedList<Integer> sh = mergesort(list, mid + 1, hi) ;
		
		LinkedList<Integer> merged = mergetwosortedll(fh, sh);
		
		return merged ;
		
		
	}

	public static LinkedList<Integer> mergetwosortedll(LinkedList<Integer> one, LinkedList<Integer> two) {
		// TODO Auto-generated method stub
		
		int i = 0 ; 
		int j = 0 ;
		int k = 0 ;
		
		LinkedList<Integer> merged = new LinkedList<>();
		
		while ( i < one.size() && j < two.size() ) {
			if ( one.get(i) >= two.get(j) ) {
				merged.add(k, two.get(j)) ; 
				j++ ;
				k++ ;
			}
			else {
				merged.add(k, one.get(i)) ;
				i++ ;
				k++ ;
			}
		}
		
		if ( i == one.size() )
		{
			while( j < two.size() )
			{
				merged.add(k, two.get(j)) ; 
				k++;
				j++;
			}
		}
		
		if ( j == two.size() ) {
			while ( i < one.size() ) {
				merged.add(k, one.get(i));
				i++ ;
				k++ ;
			}
		}
		
		
		return merged ;
	}

}
