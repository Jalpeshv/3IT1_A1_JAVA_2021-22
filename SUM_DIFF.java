import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class SUM_DIFF {
    public static void main(String[] args) throws java.lang.Exception {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(a - b);
        } else {
            System.out.println(a + b);
        }
    }
}