package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class find_Largest_Sequence_Possible {

	static Scanner scn = new Scanner(System.in) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int n = scn.nextInt();
		
		int[] a = takeInput(n) ;
		
		System.out.println(longestseq(a));
		
		
	}
	
	public static ArrayList<Integer> longestseq(int[] a) 
	{
		
		ArrayList<Integer> ans = new ArrayList<>() ;
		HashMap<Integer, Boolean> map = new HashMap<>() ;
		int element ;
		int max = 0 ; 
		int starting = 0 ;
		
		
		for ( int i = 0 ; i < a.length ; i++ )
		{
			
			element = a[i];
			
			if ( map.containsKey(element-1))
			{
				map.put(element, false) ;
			}
			else
			{
				map.put(element, true) ;
			}
			
			if ( map.containsKey(element+1))
			{
				map.put(element+1, false) ;
			}
			
		}
		
		for ( Integer key : map.keySet() )
		{
			
			if ( map.get(key) )
			{
				
				int c = 0 ;
				while ( map.containsKey(key + c) )
				{
					c++ ;
				}
				
				if ( c > max )
				{
					max = c ;
					starting = key ;
				}
				
			}
			
		}
		
		for ( int i = 0 ; i < max ; i++ )
		{
			ans.add(starting+i);
		}
		
		return ans ;
		
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
