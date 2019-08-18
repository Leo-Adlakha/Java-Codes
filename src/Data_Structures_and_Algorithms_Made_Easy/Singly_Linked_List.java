package Data_Structures_and_Algorithms_Made_Easy;

public class Singly_Linked_List {

	private class Node{
		int data ;
		Node next ;
	}
	
	private Node head ;
	private Node tail ;
	
	public Singly_Linked_List() {
		this.head = null ;
		this.tail = null ;
	}
	
	public void addFirst( int element ) {
		
		Node temp = new Node() ;
		temp.data = element ;
		if ( this.head == null ) {
			this.tail = temp ;
		}
		temp.next = this.head ;
		head = temp ;
		
	}
	
	public void addLast( int element ) {
		
		Node temp = new Node() ;
		temp.data = element ;
		temp.next = null;
		if ( this.head == null ) {
			this.head = temp ;
			this.tail = temp ;
		}
		else {
		this.tail.next = temp ;
		this.tail = temp ;
		}
		
	}
	
	public void addAt( int element, int index ) throws java.lang.Exception {
		
		if ( index == 0 ) {
			addFirst( element );
		}
		else if ( index == size() - 1 ) {
			addLast( element );
		}
		else {
			if ( index >= size() || index < 0 ) {
				throw new Exception("Index out of Bounds") ;
			}
			else {
				Node temp = new Node() ;
				temp.data = element ;
				Node start = this.head ;
				int in = 0 ;
				while ( in < index - 1 ) {
					start = start.next ;
					in++ ;
				}
				temp.next = start.next ;
				start.next = temp ;
			}
		}
		
	}

	public int size() {
		
		int size = 0 ;
		Node temp = this.head ;
		while ( temp != this.tail ) {
			size++ ;
			temp = temp.next ;
		}
		return size + 1 ;
		
	}
	
	public void deleteFirst() {
		
		this.head = this.head.next ;
		
	}
	
	public void deleteLast() {
		
		Node temp = this.head ;
		while ( temp.next != this.tail ) {
			temp = temp.next ;
		}
		this.tail = temp ;
		this.tail.next = null ;
	}
	
	public void deleteAt( int index ) throws java.lang.Exception {
		
		if ( index == 0 ) {
			deleteFirst() ;
		}
		else if ( index == size() - 1 ) {
			deleteLast() ;
		}
		else {
			if ( index < 0 || index >= size() ) {
				throw new Exception("Index out of Bounds");
			}
			else {
				Node start = this.head ;
				int in = 0 ;
				while ( in < index - 1 ) {
					 start = start.next ;
					 in++ ;
				}
				start.next = start.next.next ;
			}
		}
		
	}
	
	public void display() {
		
		Node temp = this.head ;
		while ( temp != this.tail ) {
			System.out.print(temp.data + " ");
			temp = temp.next ;
		}
		System.out.print(this.tail.data + " ");
		System.out.println();
		
	}
	
}
