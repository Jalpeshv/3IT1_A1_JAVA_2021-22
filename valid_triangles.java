import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class valid_triangles
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            if(a+b+c==180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
