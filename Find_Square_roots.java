import java.util.*;
import java.lang.*;
public class Find_Square_roots {

        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scan = new Scanner(System.in);
            // System.out.println("enter how many numbers");
            int x = scan.nextInt();
            int[] arr = new int[x];
            // System.out.println("enter the numbers");
            for (int i=1;i<=x;i++)
            {
                int num = scan.nextInt();
                int result = (int)Math.floor(Math.sqrt(num));
                arr[i-1] = result;
            }

            for (int i=0;i<x;i++)
            {
                System.out.println(arr[i]);
            }
        }
}


