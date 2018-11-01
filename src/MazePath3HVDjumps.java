import java.util.ArrayList;
import java.util.Scanner;

public class MazePath3HVDjumps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		
		System.out.println(getmazepath(cr,cc,er,ec)); // 22 ways for 0,0,2,2
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
			ArrayList<String> base = new ArrayList<>();
			return base ;
		}
		 
		ArrayList<String> myans = new ArrayList<>();
		for ( int i = 1 ; i <= er - cr && i <= ec - cc ; i++ )
		{
		ArrayList<String> recansD = getmazepath( cr+i , cc+i , er ,ec  );
		for ( String val : recansD )
		{
			myans.add("D" + i + val );
		}
		}
		for ( int i = 1 ; i <= ec - cc ; i++ )
		{
		ArrayList<String> recansH = getmazepath( cr , cc+i , er ,ec  );
		for ( String val : recansH )
		{
			myans.add("H" + i + val );
		}
		}
		for ( int i = 1 ; i <= er - cr ; i++ )
		{
		ArrayList<String> recansV = getmazepath( cr+i , cc , er ,ec  );
		for ( String val : recansV )
		{
			myans.add("V" + i + val );
		}
		}
		
		
		return myans ;
	}	
		

}
