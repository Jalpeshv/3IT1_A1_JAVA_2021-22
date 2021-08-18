import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sum_of_digit
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        int sum;
        //	int []n1=new int[n];
//	sum=0;
        for(int i=0;i<t;i++)
        {
            int n=s.nextInt();
            sum=0;
            for(;n>0;)
            {
                sum+=n%10;
                n=n/10;
                //System.out.println("frfr");

            }
            System.out.println(sum);


        }
    }
}
