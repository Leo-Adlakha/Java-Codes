package CEC07;

public class Program14 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Doubly_Linked_List list = new Doubly_Linked_List();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		list.display();
		
		list.deleteFirst();
		list.display();
		list.deleteAt(2);
		list.display();
		
	}

}
