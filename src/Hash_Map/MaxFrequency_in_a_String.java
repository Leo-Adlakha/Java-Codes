package Hash_Map;

import java.util.HashMap;
import java.util.Scanner;

public class MaxFrequency_in_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Character,Integer> map = new HashMap<>() ;
		Scanner scn = new Scanner(System.in) ;
		String str = scn.next();
		
		for ( int i = 0 ; i < str.length() ; i++ )
		{
			char ch = str.charAt(i) ;
			if ( !map.containsKey(ch) )
			{
				map.put(ch, 1) ;
			}
			else
			{
				int ans = map.remove(ch) ;
				map.put(ch, ans+1) ;
			}
		}
		
		int max = 0 ;
		char maxK = 0 ;
		for ( Character key : map.keySet() )
		{
			if ( map.get(key) > max )
			{
				max = map.get(key) ;
				maxK = key ;
			}
		}
		
		System.out.println(maxK);
		System.out.println(max);
		
	}

}
