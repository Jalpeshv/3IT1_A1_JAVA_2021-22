import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        String num[] = new String[N];
        for(int i=0; i<N; i++)
        {
            num[i] = sc.next();
        }
        for(int i=0; i<N; i++)
        {
            sum=0;
            for(int j=0; j<num[i].length(); j++)
            {
                sum=sum + (num[i].charAt(j) - '0');
            }
            System.out.println(sum);
        }
	}
}
