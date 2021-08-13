/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SUM_OF_ITS_DIGIT
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
        for(int i=0 ;i<num ;i++)
        {
            int sum =0 ;
            while(n[i]!=0)
            {
                rev=n[i]%10 ;
                sum=sum+rev ;
                n[i]=n[i]/10;
            }
            System.out.println(sum);
        }
    }
}
