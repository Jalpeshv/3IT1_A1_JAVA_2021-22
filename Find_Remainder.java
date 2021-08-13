import java.util.Scanner;
public class Find_Remainder {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // System.out.println("enter how many numbers");
            int x = scan.nextInt();
            int[] arr = new int[x];
            // System.out.println("enter the numbers");
            for (int i=1;i<=x;i++)
            {
                int num1 = scan.nextInt();
                int num2 = scan.nextInt();
                int rem = num1%num2;
                arr[i-1] = rem;
            }

            for (int i=0;i<x;i++)
            {
                System.out.println(arr[i]);
            }
        }
}

