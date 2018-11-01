package Queue_Ques;

import Queue.Dynamic_Queue;
import Queue.Queue_Class;

public class Display_Reverse_and_Actual_Reverse {

	public static void main(String[] args) throws Exception {
		
		Queue_Class Q = new Dynamic_Queue() ;
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		
		displayreverse(Q,0) ;
		System.out.println();
		Q.display();
		System.out.println();
		actualreverse(Q);
		Q.display();
		
	}

	public static void displayreverse ( Queue_Class Q, int count ) throws Exception
	{
		
		if ( count == Q.size() )
		{
			return ;
		}
		
		int temp = Q.dequeue() ;
		Q.enqueue(temp) ;
		displayreverse(Q, count+1);
		System.out.print(temp + " " );
		
	}
	
	public static void actualreverse ( Queue_Class Q ) throws Exception
	{
		if ( Q.size() == 0 )
		{
			return ;
		}
		
		int temp = Q.dequeue() ;
		actualreverse(Q);
		Q.enqueue(temp);
		
		
		
	}
	
}
