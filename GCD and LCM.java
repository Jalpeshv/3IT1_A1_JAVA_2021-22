/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static long gcd(long a, long b) {
        if(b%a ==0)
            return a;
        return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        try {
            int t = sc.nextInt();
            for (int i = 1; i <= t; i++) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long gcd = 0;
                if (a < b)
                    gcd = gcd(a, b);
                else
                    gcd = gcd(b, a);
                long lcm = (a * b) / gcd;
                System.out.println(gcd + " " + lcm);
            }
        }catch (Exception e){
            return;
        }
	}
}

