package Linked_List_Ques;

import java.util.Scanner;

public class Kth_element_from_last {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kth_element_from_last m = new Kth_element_from_last() ;
		Linked_List list = m.new Linked_List() ;
		
		boolean bl = true ;
		while ( bl == true )
		{
			
			int t = scn.nextInt() ;
			if ( t == -1 )
			{
				bl = false ;
				continue ;
			}
			list.addLast(t);
			
		}
		
		int k = scn.nextInt();
		System.out.println(list.kfromlast(k));
		
	}

	public class Linked_List {

		private class Node
		{
			int data ;
			Node next ;
		}
		
		private Node head ;
		private Node tail ;
		private int size ;
		
		public int getfirst() throws Exception
		{
			if ( this.size == 0 )
			{
				throw new Exception("Linked List is Empty") ;
			}
			return this.head.data ;
		}
		
		public int getlast() throws Exception
		{
			if ( this.size == 0 )
			{
				throw new Exception("Linked List is Empty") ;
			}
			return this.tail.data ;
		}
		
		public int getAt(int idx) throws Exception
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

			return temp.data ;
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
		
		public void display() 
		{
			
			Node temp = this.head ;
			while ( temp != null )
			{
				System.out.print(temp.data + " " );
				temp = temp.next ;
			}

		}
		
		public void addLast ( int item )
		{
			
			Node nn = new Node() ;
			nn.data = item ;
			nn.next = null ;
			
			if ( this.size == 0 )
			{
				this.head = nn ;
				this.tail = nn ;
			}
			else 
			{
			this.tail.next = nn ;
			this.tail=nn;
			}
			this.size++ ;
			
		}
		
		public void addFirst ( int item )
		{
			
			Node nn = new Node() ;
			nn.data = item ;
			nn.next = null ;
			
			if ( this.size == 0 )
			{
				this.head = nn ;
				this.tail = nn ;
			}
			else 
			{
			nn.next = head ;
			this.head = nn ;
			}
			this.size++ ;
			
		}
		
		public void addAt ( int idx, int item ) throws Exception
		{
			
			Node nn = new Node() ;
			nn.data = item ;
			nn.next = null ;
			
			if ( idx < 0 || idx > size )
			{
				throw new Exception("Invalid Index") ;
			}
			
			if ( idx == 0 )
			{
				addFirst(item) ;
			}
			else if ( idx == size )
			{
				addLast(item) ;
			}
			else
			{
				Node idxm1 = getNodeAt ( idx - 1 ) ;
				Node idxp1 = getNodeAt ( idx ) ;
				idxm1.next = nn ;
				nn.next = idxp1 ;
				this.size++ ;
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

		public int kfromlast ( int k )
		{
			Node slow = this.head ;
			Node fast = this.head ;
			
			for ( int i = 1 ; i <= k ; i++ )
			{
				fast = fast.next ;
			}
			
			while ( fast != null )
			{
				fast = fast.next ;
				slow = slow.next ;
			}
			return slow.data ;
		}
		
		
		
		
	}

}
