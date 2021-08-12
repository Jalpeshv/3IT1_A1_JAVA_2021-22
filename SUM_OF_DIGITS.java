package com.company;
import java.util.Scanner;
public class SUM_OF_DIGITS {


    public static void main(String[] args) throws java.lang.Exception {
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        for (int i = 0; i < a; i++) {
            int n = s1.nextInt();
            int s = 0;
            while (n > 0) {
                s = s + (n % 10);
                n = n / 10;
            }
            System.out.println(s);
        }

    }
}


