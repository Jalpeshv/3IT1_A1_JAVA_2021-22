import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class squareroot {
    public static void main(String[] args) throws java.lang.Exception {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int[] n = new int[num];

        for (int i = 0; i < num; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int b = (int)Math.sqrt(n[i]);

            System.out.println(b);
        }
    }
}