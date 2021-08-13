/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FIRST_AND_LAST_SUM
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int num , rev ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int []n = new int[num];


        for(int i=0 ;i<num ;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i =0 ; i<num ; i++)
        {
            int lastdigit = n[i]%10 ;
            while(n[i]>=10)
            {
                n[i]=n[i]/10 ;
            }
            int sum = n[i]+lastdigit ;
            System.out.println(sum);
        }
    }
}
	
	
	