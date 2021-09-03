/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner ip = new Scanner(System.in);
		int r = ip.nextInt();
		int l1=0,l2=0;
		int a=0,b=0;
		for(int i=0;i<r;i++)
		{
		    int n = ip.nextInt();
		    int m = ip.nextInt();
		    a = a + n;
		    b = b + m;
		    if(a>b && (a-b)>l1)
		       l1 = a - b; 
		    else if(b>a && (b-a)>l2)
		       l2 = b - a;
		}
		if(l1>l2)
		   System.out.println(1+" "+l1);
		else
		   System.out.println(2+" "+l2);
	
	}
}
