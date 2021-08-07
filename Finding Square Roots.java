/* package codechef; // don't place package name! */
import java.util.*;
/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args)
	{
		Scanner in = new Scanner(System.in);
			int t=in.nextInt();	
			while(t>0) {
				int n=in.nextInt();
				int sqrt=(int) Math.sqrt(n);
				System.out.println(sqrt);
				t--;
			}
     }
}
