package Algorithm_CEC05;

import java.util.*;

public class Program2 {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt() ;
		System.out.println(fact(n));
		
		
	}

	public static int fact(int n) {
		// TODO Auto-generated method stub
		int ans = 1 ;
		for(int i = n ; i >= 2 ; i-- ) {
			ans *= i ;
		}
		
		return ans;
	}

}
