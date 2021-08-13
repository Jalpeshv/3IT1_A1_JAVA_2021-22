import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;

public class JAVA_LOOPS2_HR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int a , b , n ;
        for (int i = 0; i < cases; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            n = sc.nextInt();

            int sum = a;

            for (int j = 0; j < n; j++)
            {
                sum += (int) ( (Math.pow(2, j))) * b;
                System.out.print(sum + " ");
            }
            System.out.println("");

        }
    }
}
