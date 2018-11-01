import java.util.Scanner;

/*DELHI'S ODD EVEN
Due to growing Traffic Problem Kejriwal wants to devise a new scheme. The scheme is as follows, each car will be allowed to run on Sunday if the sum of digits which are even is divisible by 4 or sum of digits which are odd in that number is divisible by 3. However to check every car for the above criteria can't be done by the Delhi Police. You need to help Delhi Police by finding out if a car numbered N will be allowed to run on Sunday?


Input Format:
The first line contains N , then N integers follow each denoting the number of the car.

Constraints:
N<=1000
Car No >=0 && Car No <=1000000000
Output Format:
N lines each denoting "Yes" or "No" depending upon whether that car will be allowed on Sunday or Not !

Sample Input:
2
12345
12134
Sample Output:
Yes
No
Explanation:
1 + 3 + 5 = 9 which is divisible by 3
1 + 1 + 3 = 5 which is NOT divisible by 3 and 2+4 = 6 which is not divisble by 4.*/

public class DelhisODDEVEN {

	public static void main(String[] args) {

		Scanner scn = new Scanner (System.in) ;
		int t = scn.nextInt();
		
		for ( int i = 0 ; i < t ; i++ )
		{
			long n = scn.nextLong();
			int sumo = 0 ;
			int sume = 0 ;
			int p = 1 ;
			while( n != 0 )
			{
				long rem = n % 10 ;
				if ( rem % 2 != 0 )
				{
					sumo += rem ;
				}
				else if ( p % 2 == 0 )
				{
					sume += rem ;
				}
				p++;
				n = n / 10 ;	
			}
			if ( sume % 4 == 0 || sumo % 3 == 0 )
			{
				System.out.println("Yes");
			}
			else
			{
				System.out.println("No");
			}
			
			
			
		}

	}

}
