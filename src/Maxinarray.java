import java.util.Scanner;

public class Maxinarray {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Size?");
		int n = scn.nextInt();
		int[] a = takeInput(n);
		display(a);
		int c = max(a, n);
		System.out.println(c);

	}

	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}

	public static void display(int[] a) {
		for (int j = 0; j < a.length; j++) {
			System.out.println(a[j]);
		}
	}

	public static int max(int[] a, int n) {
		int max = 0, j;
		for (j = 0; j < n; j++)
		{
			if (a[j] > max) {
				max = a[j];
			}
		}
		return max;

	}

}
