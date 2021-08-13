
import java.util.Scanner;
public class Reverse_The_Number_Solved {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();

        for(int i=0;i<a;i++)
        {
            int n=s.nextInt();
            int x=0;
            while (n != 0)
            {

                x = x * 10;
                x = x+ n%10;
                n = n/10;
            }
            System.out.println(x);

        }
    }
}
