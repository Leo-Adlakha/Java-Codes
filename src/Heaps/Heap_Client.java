package Heaps;

import java.util.Scanner;

public class Heap_Client {

	public static void main(String[] args) throws Exception 
	{
	
		Heap heap = new Heap() ;
		
		heap.add(50);
		heap.display();
		heap.add(40);
		heap.display();
		heap.add(30);
		heap.display();
		heap.add(20);
		heap.display();
		heap.add(10);
		heap.display();
		
		System.out.println(heap.remove()) ;
		heap.display();
		System.out.println(heap.remove()) ;
		heap.display();
		System.out.println(heap.remove()) ;
		heap.display();
		System.out.println(heap.remove()) ;
		heap.display();
		System.out.println(heap.remove()) ;
		heap.display();
		
//		Scanner s = new Scanner ( System.in ) ;
//		
//		int str= s.nextInt();
//    	int[] num = new int[str];
//    	
//for(int i=0; i<str ; i++){
//    		num[i]= s.nextInt();
//    		
//    	}
//int k= s.nextInt();
//System.out.println(kthLargest(num, k));
//		
//	}
//	
//public static int kthLargest(int[] a, int k) throws Exception {
//	    
//	    Heap heap = new Heap() ;
//	    for ( int i = 0 ; i < a.length ; i++ )
//	    {
//	        heap.add(a[i]) ;
//	    }
//	    
//	    for ( int j = k ; j < a.length ; j++ )
//	    {
//	        heap.remove() ;
//	    }
//	    
//	    return heap.remove() ;
//	    
//	    
//	}
	

}
}
