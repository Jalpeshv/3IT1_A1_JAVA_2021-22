import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.lang.Math;
public class Small_Factorials {
        public static void main (String[] args) throws java.lang.Exception
        {
            int num  ;
            // BigInteger a = new BigInteger("1");
            // System.out.println("ENTER THE NUMBER OF INPUT USER WANT");
            Scanner sc = new Scanner(System.in);
            num = sc.nextInt();
            int[] values = new int[num];
            //int array[100];

            for(int i=0; i<num ;i++)
            {
                values[i] = sc.nextInt();
            }
            for(int i=0; i<num ;i++)
            {
                //a=1 ;
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
