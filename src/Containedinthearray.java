import java.util.Scanner;

/*CONTAINED IN AN ARRAY
Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number. Write a recursive function which returns true if M is contained in the array and false otherwise. Print the value returned


Input Format:
Enter a number N and add N numbers in an array, then input a number M

Constraints:
None
Output Format:
Display the Boolean result

Sample Input:
3
1
2
3
1
Sample Output:
true*/
public class Containedinthearray {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		int n = scn.nextInt();
		int[] a = takeInput(n);
		int t = scn.nextInt();
		int i = 0 ;
		System.out.println(search(a,i,t));
		
	}
	public static int[] takeInput(int n) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	public static boolean search(int[] a,int i, int t)
	{
		if ( i == a.length)
		{
			return false ;
		}
		if ( a[i] == t )
		{
			return true ;
		}
		if (search(a,i+1,t))
		{
			return true;
		}
		return search(a,i+1,t) ;
		
	}
	

}
