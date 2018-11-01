package Hash_Map;

import java.util.Scanner;

public class find_Largest_Sequence_Possible {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = scn.nextInt();
		
		int[] a = takeInput(n) ;
		
		for ( int i = 0 ; )
		
		
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
