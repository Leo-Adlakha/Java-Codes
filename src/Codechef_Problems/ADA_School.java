package Codechef_Problems;

public class ADA_School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getmazepath
		
	}

	static int i = 0 ;
	
	public static void getmazepath( int cr , int cc , int er , int ec , boolean[][] b , int[][] a, String ans)
	{
		if ( cr == er && cc == ec && i != 1)
		{
			System.out.println(ans);
			return ;
		}
		else {
			i++ ;
		}
		
		if ( cr > er || cc > ec || cr < 0 || cc < 0 || b[cr][cc] == true || a[cr][cc] == 1 )
		{
			return ;
		}
		 
		b[cr][cc] = true ;
	    getmazepath( cr-1 , cc , er ,ec , b, a, ans + "U");
		getmazepath( cr+1 , cc , er ,ec, b, a, ans + "D");
		getmazepath( cr , cc-1 , er ,ec, b, a,ans + "L");
		getmazepath( cr , cc+1 , er ,ec, b, a, ans + "R");
		b[cr][cc] = false ;
		
	}
	
}
