import java.util.Scanner;

public class Subsequsingprintrecursionmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		subseq(str,"");

	}
	
	public static void subseq(String ques , String ans )
	{
		if ( ques.length()==0)
		{
			System.out.println(ans);
			return ;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		
		subseq(roq,ans);
		subseq(roq,ans + ch );
//		subseq(roq,ans + (int)ch );
	}

}
