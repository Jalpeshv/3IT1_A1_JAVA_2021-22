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
		
           Scanner sc= new Scanner(System.in);
	
		int withdraw=sc.nextInt();
		 double amount=sc.nextDouble();
		
		if(!(withdraw%5==0)||withdraw+0.50>amount)
		{
		    System.out.println(String.format("%.2f",amount));
		}
		else
		{
		    amount=amount-withdraw-0.50;
		    System.out.println(String.format("%.2f",amount));
		}
            
            
    }
}
