package Binary_Tree;

public class Binary_Tree_Client {

	// 10 true 20 true 40 false false true 50 false false true 30 false true 70 false false
	// 10 true 20 true 40 true 50 true 60 true 70 false false false false false true 80 false true 90 false true 100 false false true 30 false false
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] post = { 40,60,50,20,70,30,10 } ;
		int[] pre = { 10,20,40,50,60,30,70 } ;
		int[] in = { 40,20,60,50,10,30,70 } ;
		Binary_Tree bt = new Binary_Tree() ;
//		Binary_Tree bt = new Binary_Tree(post,in) ;
//		Binary_Tree bt = new Binary_Tree(post,in) ;
		bt.display();
//		System.out.println(bt.size() );
//		System.out.println(bt.find(60));
//		System.out.println(bt.height());
//		System.out.println(bt.max());
//		System.out.println(bt.diameter());
//		System.out.println(bt.diameter2());
//		System.out.println(bt.isbalanced());
//		bt.preorder();
//		bt.postorder();
//		bt.inorder();
//		bt.preorderI();
//		bt.postorderI();
//		bt.inorderI();
		
	}

}
