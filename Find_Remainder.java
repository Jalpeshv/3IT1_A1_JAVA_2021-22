import java.util.Scanner;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Find_Remainder {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner s2 = new Scanner(System.in);
        int j = s2.nextInt();
        for (int i = 0; i < j; i++) {
            int a = s2.nextInt();
            int b = s2.nextInt();
            int remider = (a % b);
            System.out.println(remider);
        }
    }
}