package Linked_List_Ques;

import java.util.Scanner;

/*DELETE FROM LINKED LIST (Q QUERIES)
We are given a linked list. There are Q queries. Each query is represented by a index x which represents the position from which the element has to be deleted. After every query print the linked list.


Input Format:
First line contains the number of nodes in the linked list n and queries q and then next line contains n space separated integers representing the node values of the linked list and then q lines follow containing the indices to be deleted.

Constraints:
n < 1000
Output Format:
Output the linked list after every query. Print the node values in a single line separated by spaces.

Sample Input:
5 2
1 2 3 4 5
0
1
Sample Output:
2 3 4 5
2 4 5
Explanation:
Initially the node at index 0 is deleted and list becomes 2 3 4 5. Then node at index 1 is deleted and the list becomes 2 4 5.

Time Limit: 1 sec*/

public class Delete_from_Linked_List 
{

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		
		Delete_from_Linked_List m = new Delete_from_Linked_List() ;
		LinkedList list = m.new LinkedList() ;
		int n = scn.nextInt() ;
		int q = scn.nextInt() ;
		
		for ( int i = 0 ; i < n ; i++ )
		{
			list.addLast(scn.nextInt());
		}
		
		for ( int j = 0 ; j < q ; j++ )
		{
			int idx = scn.nextInt() ;
			list.removeAt(idx);
		}
	}
	
	private class LinkedList
	{
		
		private class Node
		{
			int data ;
			Node next ;
		}
		
		private Node head ;
		private Node tail ;
		private int size ;
		
		public void addLast ( int item )
		{
			if ( head == null )
			{
				Node nn = new Node() ;
				nn.data = item ;
				nn.next = null ;
				head = nn ;
				tail = head ;
				this.size = 1 ;
			}
			else
			{
				Node nn = new Node() ;
				nn.data = item ;
				nn.next = null ;
				this.size++ ;
				tail.next = nn ;
				tail = nn ;
			}
		}
		
		public void display()
		{
			Node temp = this.head ;
			
			while ( temp != null )
			{
				System.out.print(temp.data + " " ) ;
				temp = temp.next ;
			}
			System.out.println();
		}
		
		public void removeAt ( int idx )
		{
			Node temp = null ;
			for ( int i = 0 ; i <= idx - 1 ; i++ )
			{
				if ( i == 0 )
				{
					temp = this.head ;
					continue ;
				}
				temp = temp.next ;
			}
			
			if ( temp == null )
			{
				if ( this.size == 1 )
				{
					head = tail = null ;
					this.size = 0 ;
				}
				else 
				{
				    this.head = this.head.next ;
				    this.size-- ;
				}
			}
			else if ( this.size == idx + 2 )
			{
				if ( this.size == 1 )
				{
					head = tail = null ;
					this.size = 0 ;
				}
				else
				{
					this.tail = temp ;
				    temp.next = null ;
				    this.size-- ;
				}
			}	
			else
			{				
				temp.next = temp.next.next ;
			    this.size-- ;
			}
			
			display() ;
		}
		
	}
	
}




