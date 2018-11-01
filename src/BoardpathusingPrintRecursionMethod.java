import java.util.ArrayList;
import java.util.Scanner;

public class BoardpathusingPrintRecursionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scn = new Scanner(System.in);
		int cur = scn.nextInt();
		int end = scn.nextInt();
		System.out.println(getpath(cur, end, ""));

	}

	public static int getpath(int cur, int end, String ans) {
		int ways = 0;
		if (cur == end) {
			System.out.println(ans);
			return 1;
		}
		
//		if(cur > end) {        // This LOOP or the condition cur + i <= end 
//			return 0;
//		}

		for (int i = 1; i <= 6 && cur + i <= end ; i++) {
			ways += getpath(cur + i, end, ans + i);
		}

		return ways;

	}

}
