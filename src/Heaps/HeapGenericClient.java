package Heaps;

import java.util.ArrayList;

public class HeapGenericClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		HeapGeneric<Car> heapg = new HeapGeneric<>() ;
//		
//		Car[] car = new Car[5] ;
//		car[0] = new Car(1000,100,"Red") ;
//		car[1] = new Car(200,2,"Blue") ;
//		car[2] = new Car(3000,3000,"Green") ;
//		car[3] = new Car(40,4,"Black") ;
//		car[4] = new Car(5000,500,"White") ;
//		
//		for ( int i = 0 ; i < 5 ; i++ )
//		{
//			heapg.add(car[i]);
//		}
//		
//		while ( !heapg.IsEmpty() )
//		{
//			System.out.println(heapg.remove()) ;
//		}
//		
		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//		ArrayList<Integer> list1 = new ArrayList<>();
//		list1.add(5);
//		list1.add(10);
//		list1.add(15);
//		list1.add(20);
//		list1.add(25);
//
//		ArrayList<Integer> list2 = new ArrayList<>();
//		list2.add(2);
//		list2.add(3);
//		list2.add(6);
//		list2.add(8);
//
//		ArrayList<Integer> list3 = new ArrayList<>();
//		list3.add(9);
//		list3.add(13);
//		list3.add(30);
//		list3.add(35);
//
//		ArrayList<Integer> list4 = new ArrayList<>();
//		list4.add(25);
//		list4.add(40);
//		list4.add(45);
//		list4.add(50);
//
//		list.add(list1);
//		list.add(list2);
//		list.add(list3);
//		list.add(list4);
//		
//		ArrayList<Integer> list5 = new ArrayList<>();
//		list5.add(5);
//		list5.add(4);
//		list5.add(2);
//		list5.add(10);
//		list5.add(15);
//		list5.add(20);
//		list5.add(3);
//		list5.add(1);
		
		ArrayList<Integer> l1 = new ArrayList<>();
		for ( int i = 0 ; i < 25 ; i+=5 )
		{
			l1.add(i);
		}
		ArrayList<Integer> l2 = new ArrayList<>();
		for ( int i = 2 ; i < 10 ; i+=2 )
		{
			l2.add(i);
		}
		ArrayList<Integer> l3 = new ArrayList<>();
		for ( int i = 3 ; i < 20 ; i+=3 )
		{
			l3.add(i);
		}
		ArrayList<Integer> l4 = new ArrayList<>();
		for ( int i = 5 ; i < 20 ; i+=3 )
		{
			l4.add(i);
		}
		
		list.add(l1);
		list.add(l2);
		list.add(l3);
		list.add(l4);
		
		ArrayList<Integer> list5 = new ArrayList<>();
		for ( int i = 1 ; i < 20 ; i++ )
		{
			list5.add(i);
		}
		
//		System.out.println(mergeksortedlists(list));

		System.out.println(klargest(list5, 4));
		
		
		
		
	}

	public static class Pair implements Comparable<Pair> {

		int data;
		int listNo;
		int idxNo;

		@Override
		public int compareTo(Pair o) {
			return o.data - this.data;
		}

	}

	public static ArrayList<Integer> mergeksortedlists(ArrayList<ArrayList<Integer>> lists) {

		ArrayList<Integer> ans = new ArrayList<>();
		HeapGeneric<Pair> heap = new HeapGeneric<>();

		for (int i = 0; i < lists.size(); i++) {

			Pair np = new Pair();
			np.data = lists.get(i).get(0);
			np.idxNo = 0;
			np.listNo = i;

			heap.add(np);

		}

		while (!heap.IsEmpty()) {

			Pair rp = heap.remove();
			ans.add(rp.data);

			// update
			Pair np = new Pair();
			np.listNo = rp.listNo ;
			np.idxNo = rp.idxNo + 1;
			if (np.idxNo < lists.get(rp.listNo).size()) {
				np.data = lists.get(rp.listNo).get(np.idxNo);
				heap.add(np);
			}

		}

		return ans;
	}
	
	public static ArrayList<Integer> klargest ( ArrayList<Integer> list, int k )
	{
		
		ArrayList<Integer> ans = new ArrayList<>() ;
		Heap heap = new Heap() ;
		
		for ( int i = 0 ; i < k ; i++ )
		{
			heap.add(list.get(i)) ;
		}
		
		for ( int i = k ; i < list.size() ; i++ )
		{
			
			int mint = heap.getHP() ;
			if ( mint < list.get(i) )
			{
				heap.remove() ;
			    heap.add(list.get(i));
			}
			
		}
		
		for ( int i = 0 ; i < k ; i++ )
		{
			ans.add(heap.remove()) ;
		}
		
		
		
		return ans ;
		
		
		
		
	}

}
