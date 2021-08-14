import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Helping_chef {
    public static void main(String[] args) throws java.lang.Exception {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int n[]=new int[num];

        for(int i=0 ;i<num ;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0 ;i<num ;i++)
        {
            if (n[i]< 10)
            {
                System.out.println("Thanks for helping Chef!");
            } else
            {
                System.out.println(-1);
            }
        }
    }
}