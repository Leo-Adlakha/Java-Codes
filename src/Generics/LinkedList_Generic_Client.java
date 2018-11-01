package Generics;

public class LinkedList_Generic_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList_Generic<Integer> list = new LinkedList_Generic<>() ;
		list.addFirst(10);
		list.addFirst(10);
		list.addFirst(10);
		list.addFirst(10);
		list.display();
		
	}

}
