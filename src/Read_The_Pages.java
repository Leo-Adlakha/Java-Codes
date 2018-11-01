import java.util.Arrays;
import java.util.Scanner;

/*READ THE PAGES
You are given N books, ith of which has Pi pages (Pi <= Pj, if i < j). You have to assign these N books to M students, such that each student has subsegment of books and the maximum number of pages assigned to a student is minimized.
You have to find the maximum number of pages, a student can have in this assignment of books.


Input Format:
First line contains integers, N and M, denoting the number of books and number of students respectively. Next line contains N integers, denoting the number of pages in N books.

Constraints:
1<=N<=10^5
1<=M<=N
1<=Pi<=10^9
Output Format:
Print a single integer, denoting the answer.

Sample Input:
4 2
10 20 30 40
Sample Output:
60
Time Limit: 10 sec*/

public class Read_The_Pages {

	static Scanner scn = new Scanner(System.in ) ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int books = scn.nextInt() ;
		long students = scn.nextInt() ;
		long[] pages = takeInput(books) ;
		
		// No Sorting as subsegments are reqd !!
		
		System.out.println(readpages(pages,books,students));
		
		
	}
	
	private static long readpages(long[] pages, long books, long students) 
	{
		
		long lo = 0 ;
		long sum = 0 ;
		for ( long val : pages )
		{
			sum += val ;
		}
		
		long hi = sum ;
		
		long finalans = 0 ;
		
		while ( lo <= hi )
		{
			
			long mid = ( lo + hi ) / 2 ;
			
			if ( ispossible(pages,books,students,mid ) )
			{
				hi = mid - 1 ;
				finalans = mid ;
				
			}
			else
			{
				
				lo = mid + 1 ;
				
			}
	
		}
		
		return finalans ;
		
		
		
		
		
	}

	private static boolean ispossible(long[] pages, long books, long students, long mid) 
	{
		long sum = 0 ; 
		
		long studentsplaced = 1 ;
		
		int i = 0 ;
		
		while ( i < pages.length )
		{
			
			if ( pages[i] > mid )
			{
				return false ; 
			}
			
			
			if ( sum + pages[i] <= mid )
			{
				sum += pages[i] ;
			}
			else
			{
				studentsplaced++ ;
				sum = pages[i] ;
				
				if ( studentsplaced > students )
				{
					return false ; 
				}
				
			}
			i++ ;
			
		}
		
		return true ;
		
	}

	public static long[] takeInput(int n) {
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		return arr;
	}
	
	

}
