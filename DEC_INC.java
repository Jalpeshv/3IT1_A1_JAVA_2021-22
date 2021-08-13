import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DEC_INC {
    public static void main(String[] args) throws java.lang.Exception {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        if (num %4 == 0) {
            System.out.println(++num);
        } else {
            System.out.println(--num);
        }
    }
}