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
        int x = sc.nextInt();
        int a=0;

        for(int i=0; i<x; i++)
        {
            int n = sc.nextInt();
            a = (n/2 + 1);
            System.out.println(a);
        }
	}
}
