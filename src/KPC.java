import java.util.ArrayList;
import java.util.Scanner;

public class KPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner (System.in);
		
		String str = scn.next();
		ArrayList<String> ans = kpc(str);
		System.out.println(ans);
	}
	
	public static ArrayList<String> kpc(String str)
	{
		char ch = str.charAt(0);
		String code = getCode(ch);
		if ( str.length()-1 == 0 )
		{
			ArrayList<String> base = new ArrayList<>();
			for ( int i = 0 ; i < code.length(); i++ )
			{
				String l = code.substring(i, i+1);
				base.add(l);
			}
		return base ;
		}
		
		String ros = str.substring(1);
		
		ArrayList<String> recres = kpc(ros);
		
		ArrayList<String> myans = new ArrayList<>();
		
		for ( String val : recres)
		{
			for ( int j = 0 ; j < code.length() ; j++ )
			{
				String m = code.substring(j, j+1);
				myans.add(m+val);
			}
		}
		
		
		return myans ;
		
		
		
		
		
	}
	
	
	
	
		public static String getCode(char ch) {

        if (ch == '1')
            return "abc";
        else if (ch == '2')
            return "def";
        else if (ch == '3')
            return "ghi";
        else if (ch == '4')
            return "jk";
        else if (ch == '5')
            return "lmno";
        else if (ch == '6')
            return "pqr";
        else if (ch == '7')
            return "stu";
        else if (ch == '8')
            return "vwx";
        else if (ch == '9')
            return "yz";
        else if (ch == '0')
            return "@#";
        else
            return "";
    }


}
