package CEC07;

import java.util.Random;

//Java code for thread creation by extending 
//the Thread class 

class Number{
	
	public int n;
	
	public int get() {
		return n ;
	}
	
	public void set( int n ) {
		this.n = n ;
	}
	
}

class Thread1 extends Thread 
{ 
	Number num = new Number();
	public void run() 
	{ 
		try{
			Random rand = new Random();  
			
			for ( int i = 0 ; i < 10 ; i++ ) {
				
				num.n.set(rand.nextInt(100)); 
				num = this.num ;
				System.out.println(num);
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
				System.out.println(num);
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
				System.out.println(num);
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
public class Test { 
		
	static int num;
	
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

