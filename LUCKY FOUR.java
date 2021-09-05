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
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
    	{
    	    int a=sc.nextInt();
    	    int count=0;
    	    for(int j=0;a>0;j++)
    	    {
    	        int r;
    	        r=a%10;
    	        if(r==4)
    	        {
    	            count++;
    	        }
    	        a=a/10;
    	       
    	    }
    	    System.out.println(count);
	    }
	}
}
