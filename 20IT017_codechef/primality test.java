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
        int n = sc.nextInt();
         for(int i=1;i<=n;i++)
         {
             int x= sc.nextInt();
             int count=0;
               for(int j=1;j<=x;j++)
                 {
                     if(x%j == 0)
                         {
                             count++;
                             
                         }
                     
                 }
                 if(count==2)
                     {
                         System.out.println("yes");
                     }
                 else
                     {
                         System.out.println("no");
                     }
             
         }
	}
}
