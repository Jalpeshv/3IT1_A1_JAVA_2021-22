import java.util.*;
public class Java_Strings_Introduction {

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            System.out.println(A.length() + B.length());
            if (A.compareTo(B)<=0)
                System.out.println("No");
            else
                System.out.println("Yes");

            String s1A= A.substring(0,1);
            String s2A=A.substring(1);
            String s1B= B.substring(0,1);
            String s2B=B.substring(1);
            System.out.println(s1A.toUpperCase() + s2A + " " + s1B.toUpperCase() + s2B);
        }
}