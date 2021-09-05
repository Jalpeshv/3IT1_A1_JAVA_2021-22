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
		Scanner sc=new Scanner (System.in);
		int x=sc.nextInt();//money which pooja withdrawal
    	double y=sc.nextDouble();//current balance
	
	//float bank_balance=y; // after transaction
	if(x%5==0&&x<=(y-0.5))
	{
	   // bank_balance-=(x+0.5);  
	    System.out.println((y-x-0.5));
	}
	else
		System.out.println(y);
	}
}
