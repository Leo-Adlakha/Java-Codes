package DS_and_Algos_in_JAVA_codes;

public class String_of_n_bits_from_0_to_k_minus_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		display(3, 3, "");
		
	}

	public static void display ( int n, int k, String ans )
	{
		
		if ( n == 0 )
		{
			System.out.println(ans);
			return ;
		}
		
		for ( int i = 0 ; i < k ; i++ )
		{
			display(n-1, k, ans+i);		
		}
	}
	
}
