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
		int Arr[] = new int[] {1,2,5,10,50,100};
	    Scanner sc=new Scanner(System.in);
	    int t =sc.nextInt();
	    while(t--> 0)
	    {
	        int count = 0;
	        int n = sc.nextInt();
	        int i = 6;
	        while(i-- > 0)
	        {
	            int money = Arr[i];
	            while(n>= money)
	            {
	                n= n- money;
	                count++;
	            }
	        }
	        System.out.println(count);
	    }
	}
}
