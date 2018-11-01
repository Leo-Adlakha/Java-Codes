import java.util.Scanner;

public class printprimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int N = scn.nextInt();
int i=2;
if(N>=2&&N<=1000)
{
while(i<=N)
{
	int j=1,p=0;
	while(j<=i)
	{
		if(i%j==0)
		{
		p++;
		}
		j++;
	}
	if(p==2)
	{
		System.out.println(i);
	}
	i++;
}
}
	}

}
