import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.lang.Math ;

class small_factorials {
    public static  void main(String[] args)
    {
        int num  ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int values[] = new int[num];

        for(int i=0; i<num ;i++)
        {
            values[i] = sc.nextInt();
        }
        for(int i=0; i<num ;i++)
        {
            BigInteger fact = new BigInteger("1");
            while(values[i]!=0)
            {
                fact= fact.multiply(BigInteger.valueOf(values[i])) ;
                values[i]=values[i]-1 ;
            }
            System.out.println(fact);
        }
    }
}
