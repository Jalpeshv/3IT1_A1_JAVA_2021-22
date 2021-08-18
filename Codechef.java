import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class reverse_the_number
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);

        int t = scan.nextInt();

        for (int i=0;i<t ;i++)
        {
            int num = scan.nextInt();
            int reverse=0;
            for(;num>0;)
            {
                int r;
                r=num%10;
                reverse=r+reverse*10;
                num=num/10;
            }
            System.out.println(reverse);
        }


    }
}

