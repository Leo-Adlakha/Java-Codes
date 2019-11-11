import java.util.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
    public static void main(String args[]) {
        // Your Code Here
		int n = scn.nextInt() ;
		int[] a = new int[n] ;
		for ( int i = 0 ; i < n ; i++ ){
			a[i] = scn.nextInt() ;
		}
		int q = scn.nextInt() ;
		for ( int i = 0 ; i < q ; i++ ){
			int l = scn.nextInt() - 1 ;
			int r = scn.nextInt() - 1 ;
			int[] b = new int[r-l+1] ;
			for ( int k = 0 ; k < r-l+1 ; k++ ){
				b[k] = a[k+l];
			}
			System.out.println(maxofsub(b)) ;
		}
    }

	public static int maxofsub(int[] a){
		int[] allmax = new int[a.length] ;
		for ( int i = 0 ; i < a.length ; i++ ){
			int[] max = new int[a.length] ;
			for ( int j = i ; j < a.length ; j++ ){
				int sum = 0 ;
				for ( int k = i ; k <= j ; k++ ){
					sum += a[k] ;
				}
				max[j] = sum ;
			}
			allmax[i] = maxof(max);
		}
		return maxof(allmax) ;
	}

	public static int maxof(int[] max){
		int m = Integer.MIN_VALUE ;
		for ( int i = 0 ; i < max.length ; i++) {
			if ( max[i] > m ){
				m = max[i] ;
			}
		}
		return m ;
	}

}