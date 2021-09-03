/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    int s1=0,s2=0,d=0,x,w=0,l=0;
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
	    if(t<=10000)
	    {
	        for(int i=0;i<t;i++)
	        {
	            int a=sc.nextInt();
	            int b=sc.nextInt();
	            s1+=a;
	            s2+=b;
	            if(s1>s2)
	            {
	               x=s1-s2;
	               w=1;
	            }
	            else{
	                x=s2-s1;
	               w=2; 
	            }
	            
	            if(x>d)
	            {
	                d=x;
	                l=w;
	            }
	        }
	        System.out.print(l+" ");
	        System.out.println(d);
	    }
	    
		// your code goes here
	}
}
