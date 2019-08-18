package DS_and_Algos_in_JAVA_codes;

public class Array_sorted_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 2,5,7,12,16,21,24,29,31,36,51 };
		System.out.println(sorted(a, 1)) ; 
		
	}

	public static boolean sorted( int[] a, int i )
	{
		
		if ( i == a.length - 1 )
		{
			return true ;
		}
		
		if ( a[i] >= a[i-1] )
		{
			return sorted(a, i+1) ;
		}
		else
		{
			return false;
		}
		
	}
	
}
