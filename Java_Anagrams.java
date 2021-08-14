import java.util.Arrays;
import java.util.Scanner;
//import java.util.*;
public class Java_Anagrams {

    static boolean isAnagram(String a, String b) {

//        *********METHOD 1**********
//        String A = a.toUpperCase();
//        String B = b.toUpperCase();
//        if (A.length() != B.length())
//            return false;
//        char[] array_A = A.toCharArray();
//        char[] array_B = B.toCharArray();
//        Arrays.sort(array_A);
//        Arrays.sort(array_B);
//        return (array_A.toString().equals(array_B.toString()));

//        *********METHOD 2*********
        String s1=a.toLowerCase();
        String s2=b.toLowerCase();
        if(s1.length()==s2.length())
        {
            int[] ch_a = new int[256];
            int[] ch_b = new int[256];
            for (int i = 0; i < s1.length(); i++) {
                ch_a[(int) s1.charAt(i)] += 1;
                ch_b[(int) s2.charAt(i)] += 1;
            }
            for (int i = 0; i < 256; i++) {
                if (ch_a[i] != ch_b[i])
                    return false;
            }
            return true;
        }
        else
            return false;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
