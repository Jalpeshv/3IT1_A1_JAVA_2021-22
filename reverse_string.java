
import java.io.*;
        import java.util.*;
//import java.lang.StringBuffer.reverse();

public class reverse_string  {

    public static void main(String[] args) {
        StringBuffer s;

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        /*for(int i=0;i<(A.length()/2);i++)
        {
            B[i]=A[A.length()-i-1];
        }*/
        s=new StringBuffer(A);
        String B=s.reverse().toString();
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");

    }
}

