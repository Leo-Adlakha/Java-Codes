package Stack_Ques;

import Stack.Dynamic_Stack;
import Stack.Stack_Class;

public class Display_Reverse_and_Actual_Reverse {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Stack_Class S = new Dynamic_Stack() ;
		S.push(10);
		S.push(20);
		S.push(30);
		S.push(40);
		S.push(50);
		S.push(60);
		S.push(70);
		S.push(80);
		S.push(90);
		S.push(100);
		
		displayReverse(S) ;
		System.out.println();
		S.display();
		Stack_Class res = new Dynamic_Stack() ;
		actualReverse(S,res) ;
		System.out.println();
		S.display();
		
	}
	
	public static void displayReverse ( Stack_Class S ) throws Exception
	{
		
		if ( S.size() == 0 )
		{
			return ;
		}
		int ans = S.pop();
		displayReverse(S) ;
		System.out.print(ans + " " );
		S.push(ans);
		
	}
	
	public static void actualReverse ( Stack_Class S, Stack_Class res ) throws Exception
	{
		if ( S.size() == 0 )
		{
			actualReverseHelper(S,res) ;
			return ;
		}
		int ans = S.pop();
		res.push(ans);
        actualReverse(S, res);
		
		
	}
	
	public static void actualReverseHelper ( Stack_Class S, Stack_Class res ) throws Exception
	{
        if ( res.size() == 0 )
        {
        	return ;
        }
		
		
		int temp = res.pop() ;
		actualReverseHelper(S, res);
		S.push(temp);
		
		
	}	
}
