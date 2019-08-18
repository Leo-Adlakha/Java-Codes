package Stack_Ques;

import java.util.LinkedList;
import java.util.Scanner;

public class Evaluation_of_Postfix_Expression {

	static Scanner scn = new Scanner ( System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = scn.nextInt();
		for ( int i = 0 ; i < t ; i++ )
		{
			
			String str = scn.next();
			LinkedList<Integer> stack = new LinkedList<>() ;
			
			while ( str.length() != 0 )
			{
				
				char ch = str.charAt(0) ;
				str = str.substring(1) ;
				
				if ( ch >= 48 && ch <= 57 )
				{
					stack.addFirst(ch-48);
				}
				else
				{
					if ( ch == '*' )
					{
						int a = stack.removeFirst() ;
						int b = stack.removeFirst() ;
						stack.addFirst(a*b);
					}
					else if ( ch == '+' )
					{
						int a = stack.removeFirst() ;
						int b = stack.removeFirst() ;
						stack.addFirst(a+b);
					}
					else if ( ch == '-' )
					{
						int a = stack.removeFirst() ;
						int b = stack.removeFirst() ;
						stack.addFirst(b-a);
					}
					else if ( ch == '/' )
					{
						int a = stack.removeFirst() ;
						int b = stack.removeFirst() ;
						stack.addFirst(b/a);
					}
					
				}
				
			}
			
			System.out.println(stack.removeFirst());
			
			
		}
		
		
		
		
	}

}
