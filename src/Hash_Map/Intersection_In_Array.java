package Hash_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Intersection_In_Array {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = scn.nextInt();
		int m = scn.nextInt();

		int[] a = takeInput(n);
		int[] b = takeInput(m);

		System.out.println(showans(a, b));

	}

	public static ArrayList<Integer> showans(int[] a, int[] b) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			int ch = a[i];
			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int ans = map.remove(ch);
				map.put(ch, ans + 1);
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < b.length; i++) {
			int ch = b[i];
			if (map.containsKey(ch) && map.get(ch) != 0) {
				int t = map.get(ch);
				t--;
				System.out.println(t);
				map.put(ch, t);
				ans.add(ch);

			}

		}

		return ans;

	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

}
