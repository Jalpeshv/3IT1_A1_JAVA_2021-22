import java.util.*;
import java.util.Scanner;

public class FIRST_AND_LAST_DIGIT {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        for(int i=0; i<a;i++)
        {
            int q= s.nextInt();

            int sum=0;
            int last = (q%10);


            while(q>=10)
            {
                q=(q/10);

            }
            sum=last+q;
            System.out.println(sum);

        }


    }
}
