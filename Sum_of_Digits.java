import java.util.*;
import java.lang.*;
public class Sum_of_Digits {
    /* Name of the class has to be "Main" only if the class is public. */
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner scan = new Scanner(System.in);
            int x = scan.nextInt();
            int[] arr = new int[x];

            for (int i=1;i<=x;i++)
            {
                int num = scan.nextInt();
                int sum = 0;
                while (num != 0)
                {
                    sum += num%10;
                    num = num / 10;
                }
                arr[i-1] = sum;
            }

            for (int i=0;i<x;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
