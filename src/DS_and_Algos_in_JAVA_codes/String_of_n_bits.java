package DS_and_Algos_in_JAVA_codes;

public class String_of_n_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(4, "");
		
	}

	public static void display ( int n, String ans )
	{
		
		if ( n == 0 )
		{
			System.out.println(ans);
			return;
		}
		
		display(n-1, ans+0);
		display(n-1, ans+1);
		
		
	}
	
}
