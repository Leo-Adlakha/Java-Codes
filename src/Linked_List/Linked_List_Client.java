package Linked_List;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Linked_List list = new Linked_List() ;
		
		list.addLast(10);
		list.addLast(30);
		list.addLast(20);
		list.addLast(60);
		list.addLast(90);
		list.addLast(50);
		list.addLast(40);
		list.addLast(70);
		list.addLast(100);
		list.addLast(80);
		
	    list.display();
	    System.out.println();
//	    list.reverseDI();
//	    list.display();
//	    System.out.println();
//	    list.reversePI();
//	    list.display();
//	    System.out.println();
//	    list.reversePR();
//	    list.display();
//	    System.out.println();
//	    list.reverseDRway1();
//	    list.display();
//	    System.out.println();
//	    list.reverseDRway2();
//	    list.display();
	    
//	    list.fold();
//	    list.display();
//	    System.out.println();
	    
//	    System.out.println(list.midnode());
	    
//	    System.out.println(list.kfromlast(3));
	    
//	    list.kReverse(5);
//	    list.display();
//	    System.out.println();
	    
	    list.MergeSort();
	    list.display();
	    System.out.println();
	     
	}

}
