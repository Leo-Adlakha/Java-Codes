package Data_Structures_and_Algorithms_Made_Easy;

public class Circular_Linked_List {

	private class Node{
		
		int data ;
		Node next ;
		
	}
	
	private Node tail ;
	private int size ;
	
	public Circular_Linked_List(){
		
		this.tail = null ;
		this.size = 0 ;
		
	}
	
	public int size() {
		return this.size ;
	}
	
	public void addAt( int element, int index ) throws Exception {
		
		if ( index == 0 ) {
			addFirst(element) ;
		}
		else if ( index == this.size) {
			addLast(element) ;
		}
		else {
			
			if ( index >= size || index < 0 ) {
				throw new Exception("Index out of Bounds") ;
			}
			else {
				Node temp = new Node() ;
				temp.data = element ;
				Node start = this.tail ;
				int in = 0 ;
				while ( in < index - 1 ) {
					start = start.next ;
					in++ ;
				}
				temp.next = start.next ;
				start.next = temp ;
				this.size++ ;
			}	
		}
	}

	public void addLast(int element) {
		// TODO Auto-generated method stub

		Node temp = new Node() ;
		temp.data = element ;
		if ( this.tail == null ) {
			this.tail = temp ;
			temp.next = this.tail ;
			this.size++ ;
			return ;
		}
		temp.next = this.tail ;
		int in = 0 ;
		Node start = this.tail ;
		while ( in < this.size - 1 ) {
			start = start.next ;
			in++ ;
		}
		start.next = temp ;	
		this.size++ ;
	}

	public void addFirst(int element) {
		// TODO Auto-generated method stub
		
		Node temp = new Node();
		temp.data = element ;
		if ( this.tail == null ) {
			this.tail = temp ;
			temp.next = this.tail ;
		}
		else {
			Node start = this.tail ;
			int i = 0 ;
			while ( i < this.size ) {
				start = start.next ;
				i++ ;
			}
			start.next = temp ;
			temp.next = this.tail ;
			this.tail = temp ;
		}
		this.size++ ;
		
	}
	
	public void deleteFirst() {
		
		Node start = this.tail ;
		int in = 0 ;
		while ( in < this.size - 1 ) {
			start = start.next ;
			in++ ;
		}
		start.next = this.tail.next ;
		this.tail = this.tail.next ;
		this.size-- ;
		
	}
	
	public void deleteLast() {
		
		Node start = this.tail ;
		int in = 0 ; 
		while ( in < this.size - 2 ) {
			start = start.next ;
			in++ ;
		}
		start.next = this.tail ;
		this.size-- ;
	
	}
	
	public void deleteAt( int index ) throws Exception {
		if ( index == 0 ) {
			deleteFirst() ;
		}
		else if ( index == this.size - 1 ) {
			deleteLast() ;
		}
		else {
			if ( index < 0 || index >= this.size ) {
				throw new Exception("Index out of Bounds");
			}
			else {
				Node start = this.tail ;
				int in = 0 ;
				while ( in < index - 1 ) {
					start = start.next ;
					in++ ;
				}
				start.next = start.next.next ;
				this.size-- ;
			}
		}
	}
	
	public void display() {
		Node start = this.tail ;
		int in = 0 ;
		System.out.print("->");
		while ( in < this.size ) {
			System.out.print(start.data + "->" );
			start = start.next ;
			in++ ;
		}
		System.out.println();
	}
	
}
