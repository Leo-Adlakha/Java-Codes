import java.util.Scanner;

// Wrong Output for bca should come cab and cba but not coming as such ;

public class LexicolargerPermutationusingPrintRecursionMethod {

	static String str ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		str = scn.next();
		Permutation(str,"", str.charAt(0));
//		pnc( str ,"" , 0 ) ;
		
	}

	
	public static void Permutation(String ques, String ans, char chch ) // Why this is wrong ?? 
	{
//		if ( (ans+ques.charAt(0)) == str )
//		{
//			return ;
//		}
		if ( ques.length() == 1 )
		{
			char ch = ques.charAt(0);
			System.out.println(ans + ch);
			return ;
		}
		
		for ( int i = 1 ; i <= ques.length(); i++ ) 
		{
			char ch = ques.charAt(i);
			if (chch <= ch)  
			{
			    String S1 = ques.substring(0, i - 1 );
			    String S2 = ques.substring(i);
			    String roq = S1 + S2 ;
			    Permutation(roq,ans + ch, str.substring(i).charAt(0));
			}
//			else
//			{
//				String S1 = ques.substring(0, i);
//				String S2 = ques.substring(i+1);
//				String roq = S1 + S2 ;
//				Permutation(roq,ans + ch, j+1 , chch);
//			}
		}
	}

	
	public static void pnc ( String str, String ans, int count )   // Significance of count ?? 
	{
		
		if ( str.length() == 0 )
		{
			System.out.println(ans);
			return ;
			
		}
		
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i);
			String rem = str.substring(0, i) + str.substring( i + 1 ) ;
			if ( ch > str.charAt(0) || count > 0 )
			{
				count++ ;
				pnc(rem, ans + ch , count ) ;
			}
			if ( ch == str.charAt(0) && count == 0 )
			{
				pnc(rem, ans + ch , 0 );
			}	
		}	
	}
}
