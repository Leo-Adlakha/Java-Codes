import java.util.Scanner;

public class PermutationofStringbyPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(Permutation(str,""));
	
	}
	
	public static int Permutation(String ques, String ans)
	{
		if ( ques.length() == 1)
		{
			char ch = ques.charAt(0);
			System.out.println(ans + ch);
			return 1;
		}
		
		int ways = 0 ;
		for ( int i = 0 ; i < ques.length(); i++ ) 
		{
			char ch = ques.charAt(i);
			String S1 = ques.substring(0, i);
			String S2 = ques.substring(i+1);
			String roq = S1 + S2 ;
			ways += Permutation(roq,ans + ch );
		}
		
		return ways ;
	}

	
	

}
