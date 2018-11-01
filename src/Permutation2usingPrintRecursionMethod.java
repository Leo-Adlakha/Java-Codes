import java.util.Scanner;

public class Permutation2usingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(Permutation(str,""));
		System.out.println(PermutationMaam2(str, ""));
		
	}
	static int p = 0 ;
	public static int Permutation(String ques, String ans)
	{
		if ( ques.length() == 1)
		{
			char ch = ques.charAt(0);
			System.out.println(ans + ch);
			return 1 ;
		}
		
		int ways = 0 ;
		
		for ( int i = 0 ; i < ques.length(); i++ ) 
		{
            p = 0 ;
			char ch = ques.charAt(i);
			for ( int j = 0 ; j < i; j++ )
			{
				char l = ques.charAt(j);
				if ( ch == l )
				{
					p++;
				}
				
				
		    }
			if ( p == 0 )
			{
			    String S1 = ques.substring(0, i);
			    String S2 = ques.substring(i+1);
			    String roq = S1 + S2 ;
			    ways += Permutation(roq,ans+ch);
			}
			
			
		}
		
		return ways ;
		
	}
	
	public static int PermutationMaam2(String ques, String ans)
	{
		if ( ques.length() == 1)
		{
			char ch = ques.charAt(0);
			System.out.println(ans + ch);
			return 1 ;
		}
		
		int ways = 0 ;
		boolean[] visited = new boolean[256];
		
		for ( int i = 0 ; i < ques.length() ; i++ ) 
		{
       
			char ch = ques.charAt(i);
			
			if ( !visited[ch] )
			{
			
			String S1 = ques.substring(0, i );
			String S2 = ques.substring(i+1);
			String roq = S1 + S2 ;
			ways += PermutationMaam2(roq, ans + ch);
			}
			visited[ch] = true ;
			
		}
		
		return ways ;

	}

}
