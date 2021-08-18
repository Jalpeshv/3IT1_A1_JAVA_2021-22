import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class second_largest {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i = 0; i < t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int ans;
            if ((a > b && c < b) || (a < b && c > b)) {
                ans = b;
            } else if ((b > a && c < a) || (b < a && c > a)) {
                ans = a;
            } else {
                ans = c;
            }
            System.out.println(ans);
        }
    }
}

