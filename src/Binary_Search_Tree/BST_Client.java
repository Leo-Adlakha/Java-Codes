package Binary_Search_Tree;

public class BST_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] in = { 5,10,15,20,25,30,35 } ;
		int[] in = { 2,1,3 } ;
		BST bst = new BST(in) ;
		bst.display();
//		System.out.println(bst.find(15)) ;
//		System.out.println(bst.height()); ;
//		System.out.println(bst.max()); ;
//		System.out.println(bst.size()) ;
//		bst.inrange(10, 25);
//		bst.printdec();
//		bst.replacewithsumL();
//		bst.display();
//		bst.additem(19);
//		bst.additem(37);
//		bst.display();
		bst.remove(1);
		bst.display();
		
	}

}
