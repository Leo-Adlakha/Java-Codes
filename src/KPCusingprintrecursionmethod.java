import java.util.Scanner;

public class KPCusingprintrecursionmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		Kpc(str,"");
		
	}
	public static void Kpc(String ques, String ans)
	{
		if ( ques.length() == 0)
		{
			System.out.println(ans);
			return ;
		}
		char ch = ques.charAt(0);
		String str = KPC.getCode(ch);  // Way to extract a function from other Program from JAVA
		String roq = ques.substring(1);
		
		for ( int i = 0 ; i < str.length(); i++ )
		{
		Kpc(roq,ans + str.charAt(i));
		}
		
		
	}

	
	
	
	
}
