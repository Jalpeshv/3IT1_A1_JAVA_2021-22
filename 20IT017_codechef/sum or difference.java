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
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		if(x>y)
		{
	        int a1=x-y;
            System.out.println(a1);
	    }
	    else
		{
	        int a2=x+y;
            System.out.println(a2);
	    }
	}
}
