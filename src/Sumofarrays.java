import java.util.ArrayList;
import java.util.Scanner;

public class Sumofarrays {

	static Scanner scn = new Scanner (System.in) ;
	public static void main(String[] args) {
		

		int n1 = scn.nextInt();
		int[] a = takeInput(n1);
		int n2 = scn.nextInt();
		int[] b = takeInput(n2);
		System.out.println(sumofarrays(a,b));
	}
	
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static ArrayList<Integer> sumofarrays(int[] a , int[] b )
	{
		ArrayList<Integer> list = new ArrayList<>();
		int i , j ;
		int sum = 0;
		int c = 0 ;
		int d = 0 ;
		int e = 0 ;
		for (  i = a.length-1, j = b.length - 1 ; i>=0 || j>=0 ; i--, j-- )   // tab tak run krega jab tak i, j dono greater than zero ho  
		{
			if ( i < 0 )
			{
				e = 0 ;
			}
			else 
			{
				e = a[i] ; 
			}
			if ( j < 0 )
			{
				d = 0 ;
			}
			else 
			{
				d = b[j] ;
			}
			sum = c + d + e ;
			
			
			if ( sum >= 10 )
			{
				c = sum / 10 ;
			}
			else 
			{
				c = 0 ;
			}
			list.add(0, sum%10);
		}
		
		if(c!=0)
		{
			list.add(0,c);           //Imp for the last digit if no. are 99 , 9954 in array
		}
			return list ;
		
	}

}
