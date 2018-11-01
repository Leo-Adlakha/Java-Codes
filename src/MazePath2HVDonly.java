import java.util.ArrayList;
import java.util.Scanner;

public class MazePath2HVDonly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		
		System.out.println(getmazepath(cr,cc,er,ec));
		
	}
	
	public static ArrayList<String> getmazepath( int cr , int cc , int er , int ec )
	{
		if ( cr == er && cc == ec )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base ;
		}
		if ( cr > er || cc > ec )
		{
			ArrayList<String> base = new ArrayList<>();  // negative base case
			return base ;
		}
		 
		ArrayList<String> myans = new ArrayList<>();
		ArrayList<String> recansD = getmazepath( cr+1 , cc+1 , er ,ec  );
		ArrayList<String> recansH = getmazepath( cr , cc+1 , er ,ec  );
		ArrayList<String> recansV = getmazepath( cr+1 , cc , er ,ec  );
		
		for ( String val : recansH )
		{
			myans.add("H" + val );
		}
		for ( String val : recansV )
		{
			myans.add("V" + val );
		}
		for ( String val : recansD )
		{
			myans.add("D" + val );
		}
		
		return myans ;
	}	
		

}
