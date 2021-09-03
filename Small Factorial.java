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
	    Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t ;i++)
        {
           int fact=1;
           int n = scan.nextInt();
          // fact=1;
           for(;n!=0;n--)
           {
               fact=fact*n;
               //n--;
           }
           System.out.println(fact);
        }
	}
}
       
        