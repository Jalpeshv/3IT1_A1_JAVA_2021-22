import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


/* Name of the class has to be "Main" only if the class is public. */
class small_factorials
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0;i<t ;i++)
        {
            BigInteger fact = new BigInteger("1");
            long n = scan.nextInt();
            // fact=1;
            while(n!=0)
            {
                fact= fact.multiply(BigInteger.valueOf(n)) ;
                n--;
            }
            System.out.println(fact);
        }
    }
}
