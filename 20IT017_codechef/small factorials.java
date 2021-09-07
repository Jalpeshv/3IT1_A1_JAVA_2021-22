/* package codechef; // don't place package name! */
import java.math.BigInteger;
import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
        int num,number;
        num=sc.nextInt();
        if(num>=1 && num<=100){
            for(int i=0;i<num;i++){
                number=sc.nextInt();
                BigInteger fact= new BigInteger("1");
                if(number >= 1 && number <= 100){
                    for(int j=1 ; j <= number ; j++){
                        fact=fact.multiply(BigInteger.valueOf(j));
                    }
                    System.out.println(fact);
                }
            }
        }
	}
}