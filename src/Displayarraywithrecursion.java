import java.util.Scanner;

public class Displayarraywithrecursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scn.nextInt();
		int[] a = takeInput(n);
		int i = 0;
		display(a , n , i );
		i = 0;
		displayrev(a, i);
	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] a, int n, int i) {
		if (i == n) {
			return;
		}
		System.out.println(a[i]);
		i++;
		display(a, n, i);
	}

	public static void displayrev(int[] a, int i) {
		if (i == a.length) {
			return;
		}
		displayrev(a, i + 1);
		System.out.println(a[i]);
	}

}
