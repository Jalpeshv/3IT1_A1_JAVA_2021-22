import java.util.Scanner;

public class Java_String_Reverse_h {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(A.equalsIgnoreCase(new StringBuffer(A).reverse().toString()))
        {System.out.println("Yes");}
        else
        {System.out.println("No");}
    }
}
