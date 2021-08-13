import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class REMAINDER
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a[] = new int[10000];
        int b[] = new int[10000];


        for(int i=0 ;i<num ;i++)
        {
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        for(int i =0 ; i< num ; i++)
        {
            System.out.println(a[i]%b[i]);
        }
    }
}