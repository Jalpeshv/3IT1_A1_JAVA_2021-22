

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Chef_and_Remissness
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b;
            a=sc.nextInt();
            b=sc.nextInt();
            if(a>b)
            {
                System.out.println(a+" "+(a+b));
            }
            else
            {
                System.out.println(b+" "+(a+b));
            }
        }
    }
}