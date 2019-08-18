package Data_Structures_and_Algorithms_Made_Easy;

public class Doubly_Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Doubly_Linked_List list = new Doubly_Linked_List() ;
		list.addFirst(10);
		list.addLast(20);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.display();
		list.addLast(70);
		list.display();
		list.addAt(30, 2);
		list.display() ;
		System.out.println(list.size());
		list.deleteAt(0);
		list.deleteAt(list.size()-1);
		list.deleteAt(3);
		list.display();
				
	}

}
