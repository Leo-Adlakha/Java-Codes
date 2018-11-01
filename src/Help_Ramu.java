import java.util.Scanner;

/*HELP RAMU
Ramu often uses public transport. The transport in the city is of two types: cabs and rickshaws. The city has n rickshaws and m cabs, the rickshaws are numbered by integers from 1 to n, the cabs are numbered by integers from 1 to m.

Public transport is not free. There are 4 types of tickets:

A ticket for one ride on some rickshaw or cab. It costs c1 ruppees;
A ticket for an unlimited number of rides on some rickshaw or on some cab. It costs c2 ruppees;
A ticket for an unlimited number of rides on all rickshaws or all cabs. It costs c3 ruppees;
A ticket for an unlimited number of rides on all rickshaws and cabs. It costs c4 ruppees.

Ramu knows for sure the number of rides he is going to make and the transport he is going to use. He asked you for help to find the minimum sum of ruppees he will have to spend on the tickets.


Input Format:
Each Test case has 4 lines which are as follows:

The first line contains four integers c1, c2, c3, c4 (1 ≤ c1, c2, c3, c4 ≤ 1000) — the costs of the tickets. The second line contains two integers n and m (1 ≤ n, m ≤ 1000) — the number of rickshaws and cabs Ramu is going to use. The third line contains n integers ai (0 ≤ ai ≤ 1000) — the number of times Ramu is going to use the rickshaw number i. The fourth line contains m integers bi (0 ≤ bi ≤ 1000) — the number of times Ramu is going to use the cab number i.

Output Format:
Print a single number — the minimum sum of ruppes Ramu will have to spend on the tickets.

Sample Input:
2
1 3 7 19
2 3
2 5
4 4 4
4 3 2 1
1 3
798
1 2 3
Sample Output:
12
1*/

public class Help_Ramu {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int tc = scn.nextInt();

		while (tc > 0) {

			int c1 = scn.nextInt();
			int c2 = scn.nextInt();
			int c3 = scn.nextInt();
			int c4 = scn.nextInt();

			int r = scn.nextInt();
			int c = scn.nextInt();

			int[] ra = new int[r];
			int[] ca = new int[c];

			for (int i = 0; i < r; i++) {
				ra[i] = scn.nextInt();
			}

			for (int i = 0; i < c; i++) {
				ca[i] = scn.nextInt();
			}

			int ans = min(c1, c2, c3, c4, ra, ca);

			System.out.println(ans);
			tc--;
		}

	}

	private static int min(int c1, int c2, int c3, int c4, int[] ra, int[] ca) {

		int minR = minTransport(c1, c2, c3, ra);
		int minC = minTransport(c1, c2, c3, ca);

		return Math.min(c4, minR + minC);
	}

	public static int minTransport(int c1, int c2, int c3, int[] arr) {

		int cost = 0;

		for (int i = 0; i < arr.length; i++) {
			cost += Math.min(arr[i] * c1, c2);
		}

		return Math.min(cost, c3);

	}
}
