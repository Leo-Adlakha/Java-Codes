import java.util.ArrayList;
import java.util.Scanner;

public class Intersectionofarrays {

	static Scanner scn = new Scanner (System.in) ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n1 = scn.nextInt();
		int[] a = takeInput(n1);
		int n2 = scn.nextInt();
		int[] b = takeInput(n2);
		System.out.println(intersection(a,b));
		
		
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static ArrayList<Integer> intersection(int[] a , int[] b)
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i = 0, j = 0 ; 
		while ( i < a.length && j < b.length )
		{
			if ( a[i] == b[j] )
			{
				list.add(a[i]);
				i++;
				j++;
			}
			
			if ( a[i] < b[j] )
			{
				i++ ;
			}
			else if ( a[i] > b[j] )
			{
				j++;
			}
//			else 
//			{
//				i++;
//				j++;
//			}
		}
		return list ;
	}

}
