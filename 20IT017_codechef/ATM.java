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
		Scanner sc=new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		if((a + 0.5)<=b && a%5==0)
		{
		    b-=(a+0.5);
		}
	    System.out.printf("%.2f", b);
	}
}
