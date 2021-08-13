import java.util.*;
public class Add_two_numbers {
    public static class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            // System.out.println("Enter how many times : ");
            int x = scan.nextInt();
            int[] arr= new int[x];
            for (int i=1;i<=x;i++)
            {
                int a = scan.nextInt();
                int b = scan.nextInt();
                arr[i-1] = a+b;
            }
            for(int i=0;i<x;i++)
            {
                System.out.println(arr[i]);
            }
        }
    }
}
