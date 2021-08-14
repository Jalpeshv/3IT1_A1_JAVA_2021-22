import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CHEF_AND_OPERATORS
{
    public static void main (String[] args) throws java.lang.Exception
    {
        int num  ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int []n = new int[num];
        int a[] = new int[10000];
        int b[] = new int[10000];


        for(int i=0 ;i<num ;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        for(int i =0 ; i< num ; i++)
        {
            if(a[i]<b[i])
            {
                System.out.println("<");
            }
            else if(a[i]>b[i])
            {
                System.out.println(">");
            }
            else
                System.out.println("=");
        }
    }
}