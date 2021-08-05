import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner c=new Scanner(System.in);
        int t=c.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]=c.nextInt();
        }
        
        for(int i=0;i<t;i++)
        {
            int f,l;
            l=a[i]%10;
            while(a[i]>9)
            {
                a[i]/=10;
            }
            f=a[i];
            System.out.println(f+l);
        }
    }
}