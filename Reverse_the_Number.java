import java.util.*;
import java.lang.*;
public class Reverse_the_Number {
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
                int rev = 0;
                while (num != 0)
                {
                    int r = num % 10;
                    num = num / 10;
                    rev=rev*10 + r;
                }
                arr[i-1] = rev;
            }

            for (int i=0;i<x;i++)
            {
                System.out.println(arr[i]);
            }
        }
}
