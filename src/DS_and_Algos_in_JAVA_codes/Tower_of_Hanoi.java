package DS_and_Algos_in_JAVA_codes;

public class Tower_of_Hanoi {

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
