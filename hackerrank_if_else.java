import java.util.*;

public class hackerrank_if_else {
//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        if(N%2!=0)
        {
            System.out.println("Weird");
        }
        if(N%2==0 && (N>=2 && N<=5) )
        {
            System.out.println("Not Weird");
        }
        if(N%2==0 && (N>=6 && N<=20) )
        {
            System.out.println("Weird");
        }
        if(N%2==0 && (N>20) )
        {
            System.out.println("Not Weird");
        }

    }
}
