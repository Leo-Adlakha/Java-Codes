import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn = new Scanner(System.in);
int min = scn.nextInt();
int max = scn.nextInt();
int step = scn.nextInt();
for ( int t = min ; t <= max ; t+=step)
{
	int c = (int) ( (5.0/9) * ( t-32 ));
	System.out.println(t + "\t" + c);
}
	}

}
