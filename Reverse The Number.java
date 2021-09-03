/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0){
		    int reversenum = 0;
			t--;
			int n=sc.nextInt();
			while(n!=0){
				reversenum = reversenum * 10;
				reversenum = reversenum + n%10;
				n = n/10;
			
			}
			System.out.println(reversenum);	
		}
		// your code goes here
	}
}