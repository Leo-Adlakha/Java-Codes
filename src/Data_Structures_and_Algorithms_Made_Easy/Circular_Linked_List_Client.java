package Data_Structures_and_Algorithms_Made_Easy;

public class Circular_Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Circular_Linked_List list = new Circular_Linked_List() ;
		list.addFirst(10);
		list.display() ;
		System.out.println(list.size());
		list.addLast(20);
		list.display() ;
		System.out.println(list.size());
		list.addLast(40);
		list.display() ;
		System.out.println(list.size());
		list.addAt(30, 2);
		list.display();
		System.out.println(list.size());
		list.addLast(50);
		list.display();
		System.out.println(list.size());
		list.deleteFirst();
		list.display();
		System.out.println(list.size());
		list.deleteLast();
		list.display();
		System.out.println(list.size());
		list.deleteAt(1);
		list.display();
		System.out.println(list.size());
		list.deleteAt(list.size());
		
	}

}
