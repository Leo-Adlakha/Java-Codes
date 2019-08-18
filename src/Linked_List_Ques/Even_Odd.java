package Linked_List_Ques;

/*LL - ODDEVEN
Given a list, modify it such that all odd elements appear before the even ones. The order of odd elements and even shall remain intact.

See explantaion for more info.


Input Format:
The first line contains an integer N, the number of elements in the list.

The next line contains N space separated integral elements of the list.

Constraints:
1 <= T <= 1000
0 <= N <= 10^6
Output Format:
T lines of output

Sample Input:
5
1 2 3 4 5
Sample Output:
1 3 5 2 4 */

import java.util.Scanner ;

class LinkedList {

	private class Node {

		int data;
		Node next;
	}

	private Node head;
	private Node tail;
	private int size;

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("linked list is empty");

		return tail.data;
	}

	public void addLast(int item) {
		// create a new node
		Node nn = new Node();

		nn.data = item;
		nn.next = null;

		// update summary
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else

		{
			this.tail.next = nn;
			this.tail = nn;

			size++;
		}

	}

	public void addFirst(int item) {
		Node nn = new Node();
		nn.data = item;
		nn.next = null;

		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			size++;
		}

	}

	public int removefirst () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		int ans = this.head.data ;
		
		if ( this.size == 1 )
		{
			this.head = null ;
			this.tail = null ;
			this.size = 0 ;
		}
		else
		{
			this.head = this.head.next ;
			this.size-- ;	
		}
		
		return ans ;
		
	}
	
	public int removelast () throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		int ans = this.tail.data ;
		
		if ( this.size == 1 )
		{
			this.head = null ;
			this.tail = null ;
			this.size = 0 ;
		}
		else
		{
			Node temp = getNodeAt(this.size - 2) ;
			temp.next = null ;
			this.tail = temp ;
		}
		
		return ans ;
		
	}
	
	private Node getNodeAt(int idx) throws Exception
	{
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is Empty") ;
		}
		if ( idx < 0 || idx >= size )
		{
			throw new Exception("Invalid Index") ;
		}
		Node temp = this.head ;
		for(int i =0 ; i<idx ;i++) {
			temp = temp.next;
		}

		return temp ;
	}

	public int removeAt ( int idx ) throws Exception
	{
		
		if ( this.size == 0 )
		{
			throw new Exception("Linked List is empty!") ;
		}
		
		if ( idx < 0 || idx > this.size - 1 )
		{
			throw new Exception("Invalid Index!") ;
		}
		
		if ( idx == 0 )
		{
			return removefirst() ;
		}
		else if ( idx == this.size - 1 )
		{
			return removelast() ;
		}
		else
		{
			
			Node prev = getNodeAt(idx - 1) ;
			Node self = prev.next ;
			Node ahead = self.next ;
			
			
			prev.next = ahead ;
			this.size-- ;
			
			return self.data ;
			
		}
		
		
	}
	
	public void partition()  throws Exception{
	
		Node temp = this.head ;
		int i = 0 ;
		int t = this.size ;
		
		while ( i < t )
		{
			
			if ( temp.data % 2 == 0 )
			{
				addLast(removeAt(i)) ;
			}
			temp = temp.next ;
			i++ ;
		}
	
		
		
    }

	public void display() {

		Node temp = this.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}

	}

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		LinkedList ll = new LinkedList();
		int n = scn.nextInt();

		for (int j = 0; j < n; j++) {
		int item = scn.nextInt();
		ll.addLast(item);
		}

		ll.partition();
		ll.display();

		
	}
}
