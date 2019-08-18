package Data_Structures_and_Algorithms_Made_Easy;

public class Tower_of_HAnoi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TOH(5, 'S', 'H', 'D');
		
	}

	public static void TOH ( int n, char source, char helper, char destination )
	{
		
		if ( n == 0 )
		{
			return ;
		}
		
		TOH(n-1, source, destination, helper);
		System.out.println("Move " + n + "th disc from " + source + " to " + destination);
		TOH(n-1, helper, source, destination);
		
		
	}
	
}
