import java.util.ArrayList;
import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int cur = scn.nextInt();
		int end = scn.nextInt();
		System.out.println(getpath(cur,end));
		System.out.println(getpath(cur,end).size()); // 0 to 10 has 492 ways ;
		
	}
	
	public static ArrayList<String> getpath(int cur , int end )
	{
		if ( cur == end )
		{
			ArrayList<String> base = new ArrayList<>();
			base.add(" ");
			return base ;
		}
		if ( cur > end )
		{
			ArrayList<String> base = new ArrayList<>();
			return base ;
		}
		
		ArrayList<String> myans = new ArrayList<>();
		for ( int i = 1 ; i <= 6 ; i++ )
		{
			ArrayList<String> recans = getpath(cur+i,end );
			for ( String val : recans )
			{
				myans.add(i+val);
			}	
			
		}
		return myans ;
		
	}

}
