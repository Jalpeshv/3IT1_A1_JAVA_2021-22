import java.util.*;
    import java.lang.*;
    import java.io.*;
    import java.math.BigInteger;
    
    /* Name of the class has to be "Main" only if the class is public. */
    class Main
    {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            if(t>=1 && t<=100) {
                while(t>=1) {
                    int n=sc.nextInt();
                    if(n>=1 && n<=100) {
                    BigInteger f=BigInteger.ONE;
                    while(n>1) {
                        f=f.multiply((new BigInteger (String.valueOf(n))));
                        n--;
                    }
                    System.out.println(f);
                    }
                    t--;
                
                }
            }
            sc.close();
        } 
    }