package Queue;

import java.util.Scanner;

public class Queue_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in) ;
		
		Queue_Class Q = new Dynamic_Queue() ;
		Q.enqueue(10);
		Q.enqueue(20);
		Q.enqueue(30);
		Q.enqueue(40);
		Q.enqueue(50);
		Q.dequeue();
		Q.dequeue();
		Q.enqueue(60);
		Q.enqueue(70);
		Q.display();
		Q.enqueue(80);
		Q.display();
		
		
	}

}
