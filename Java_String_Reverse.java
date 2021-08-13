import java.util.*;
public class Java_String_Reverse {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            StringBuilder s1 = new StringBuilder();
            s1.append(A).reverse();
            String B=new String(s1);
            if (A.equals(B))
                System.out.println("Yes");
            else
                System.out.println("No");
        }
}
