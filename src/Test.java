import java.util.* ;

public class Test{
	
	static Scanner scn = new Scanner(System.in) ;
	
    public static void main(String[] args) throws Throwable {
    	
    	String hello = scn.nextLine();
    	System.out.println(hello);
    	
    }
    
    public static void fun() throws Exception {
    	System.out.println("Hello World");
    	throw new Exception("Hello World") ;
    }
	
} 