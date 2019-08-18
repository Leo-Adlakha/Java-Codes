import java.util.Scanner;

public class MazePathusingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner (System.in);
		int cr = scn.nextInt();
		int cc = scn.nextInt();
		int er = scn.nextInt();
		int ec = scn.nextInt();
		
		System.out.println(getmazepath(cr,cc,er,ec,""));
			
	}
	
	public static int getmazepath(int cr, int cc, int er, int ec, String ans )
	{
		if ( cr == er && cc == ec )
		{
			System.out.println(ans);
			return 1 ;
		}
		
		int waysH = 0 ;
		int waysV = 0 ;
		if ( cc < ec )
		    waysH += getmazepath ( cr, cc + 1, er, ec, ans + "H") ;
		if ( cr < er )
			waysV += getmazepath ( cr + 1, cc, er, ec, ans + "V") ;
		
		return waysH + waysV ;
		
	}
	
	public static int getmazepathD(int cr, int cc, int er, int ec, String ans )
	{
		if ( cr == er && cc == ec )
		{
			System.out.println(ans);
			return 1 ;
		}
		
		int waysH = 0 ;
		int waysV = 0 ;
		int waysD = 0 ;
		if ( cc < ec )
		    waysH += getmazepath ( cr, cc + 1, er, ec, ans + "H") ;
		if ( cr < er )
			waysV += getmazepath ( cr + 1, cc, er, ec, ans + "V") ;
		if ( cr < er && cc < ec )
			waysD += getmazepath ( cr + 1, cc + 1 , er, ec, ans + "D") ;
		
		return waysH + waysV + waysD ;
		
	}

}
