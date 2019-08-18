import java.util.* ;

public class Dictionery_Order_Larger {

	static Scanner scn = new Scanner ( System.in ) ; 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = scn.next() ;
		printpermutationlarger(str, "", str);
		printpermutationlarger2(str, "", false, str);
		
	}
	
	public static void printpermutationlarger ( String ques, String ans, String os )
	{
		
		if ( ques.length() == 0 )
		{
			if ( ans.compareTo(os) > 0 )
			{
				System.out.println(ans);
			}
			return ;
		}
		
		for ( int i = 0 ; i < ques.length() ; i++ )
		{
			
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i) + ques.substring(i+1);
			printpermutationlarger(roq, ans + ch , os);
			
		}
		
	}
	
	public static void printpermutationlarger2 ( String ques, String ans, boolean isLarger, String os )
	{
		
		if ( ques.length() == 0 )
		{
			if ( ans.compareTo(os) != 0 )
			    System.out.println(ans);
			return ;
		}
		
		for ( int i = 0 ; i < ques.length() ; i++ )
		{
			
			char ch = ques.charAt(i);
			String roq = ques.substring(0,i) + ques.substring(i+1);
			
			if ( !isLarger )
			{
				if ( ch > ques.charAt(0) )
				{
					printpermutationlarger2(roq, ans+ch, true, os);
				}
				else if ( ch < ques.charAt(0) )
				{
					
				}
				else
				{
					printpermutationlarger2(roq, ans+ch, false, os);
				}
			}
			else
			{
				printpermutationlarger2(roq, ans+ch, true, os);
			}

		}
		
	}
	

}
