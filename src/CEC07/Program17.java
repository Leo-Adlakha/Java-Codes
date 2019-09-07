package CEC07;

import java.util.Random;

//Java code for thread creation by extending 
//the Thread class 
class Thread1 extends Thread 
{ 
	protected int n ;
	public void run() 
	{ 
		try{
			
			Random rand = new Random();  
			
			for ( int i = 0 ; i < 10 ; i++ ) {
				
				n = rand.nextInt(100); 
				System.out.println(n);
				Thread.sleep(1000);
			
			}
		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
} 

class Thread2 extends Thread1 implements Runnable{
	
	public void run() 
	{ 
		try
		{ 
			for ( int i = 0 ; i < 10 ; i++ ) {
				System.out.println(n);
//				if ( n % 2 == 0 ) {
//					System.out.println(n*n);
//				}
//				else {
//					
//				}
				Thread.sleep(1000);				
			}
		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
	
}

class Thread3 extends Thread1 implements Runnable{
	
	public void run() 
	{ 
		try
		{ 
			for( int i = 0 ; i < 10 ; i++ ) {
				System.out.println(n);
//				if ( n % 2 == 0 ) {
//					
//				}
//				else {
//					System.out.println(n*n*n);
//				}
				Thread.sleep(1000);				
			}
		} 
		catch (Exception e) 
		{ 
			// Throwing an exception 
			System.out.println ("Exception is caught"); 
		} 
	} 
	
}

//Main Class 
public class Program17 { 
	public static void main(String[] args) throws InterruptedException 
	{ 
	
		Thread1 t1 = new Thread1() ;
		Thread2 t2 = new Thread2() ;
		Thread3 t3 = new Thread3() ;
		
		t1.start();
		Thread.sleep(10);
		t2.start();
		Thread.sleep(10);
		t3.start();
		Thread.sleep(10);
		
	} 
} 

